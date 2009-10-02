/*
 * Copyright 2004-2009 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.seasar.doma.internal.jdbc.command;

import static org.seasar.doma.internal.util.AssertionUtil.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.seasar.doma.internal.domain.DomainType;
import org.seasar.doma.internal.domain.DomainTypeFactory;
import org.seasar.doma.internal.jdbc.query.Query;
import org.seasar.doma.jdbc.NonUniqueResultException;

/**
 * @author taedium
 * 
 */
public class DomainSingleResultHandler<V, D> implements ResultSetHandler<D> {

    protected final DomainTypeFactory<V, D> domainTypeFactory;

    public DomainSingleResultHandler(DomainTypeFactory<V, D> domainTypeFactory) {
        assertNotNull(domainTypeFactory);
        this.domainTypeFactory = domainTypeFactory;
    }

    @Override
    public D handle(ResultSet resultSet, Query query) throws SQLException {
        ValueFetcher fetcher = new ValueFetcher(query);
        DomainType<V, D> domainType = domainTypeFactory.createDomainType();
        if (resultSet.next()) {
            fetcher.fetch(resultSet, domainType.getWrapper());
            if (resultSet.next()) {
                throw new NonUniqueResultException(query.getSql());
            }
            return domainType.getDomain();
        }
        return null;
    }

}