/*
 * Copyright 2004-2010 the Seasar Foundation and the Others.
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
import java.util.ArrayList;
import java.util.List;

import org.seasar.doma.internal.jdbc.query.SelectQuery;
import org.seasar.doma.jdbc.NoResultException;
import org.seasar.doma.jdbc.Sql;
import org.seasar.doma.jdbc.domain.DomainType;
import org.seasar.doma.jdbc.domain.DomainWrapper;

/**
 * @author taedium
 * 
 */
public class DomainResultListHandler<D> implements ResultSetHandler<List<D>> {

    protected final DomainType<?, D> domainType;

    public DomainResultListHandler(DomainType<?, D> domainType) {
        assertNotNull(domainType);
        this.domainType = domainType;
    }

    @Override
    public List<D> handle(ResultSet resultSet, SelectQuery query)
            throws SQLException {
        BasicFetcher fetcher = new BasicFetcher(query);
        List<D> domains = new ArrayList<D>();
        while (resultSet.next()) {
            DomainWrapper<?, D> wrapper = domainType.getWrapper(null);
            fetcher.fetch(resultSet, wrapper);
            domains.add(wrapper.getDomain());
        }
        if (query.isResultEnsured() && domains.isEmpty()) {
            Sql<?> sql = query.getSql();
            throw new NoResultException(query.getConfig()
                    .getExceptionSqlLogType(), sql);
        }
        return domains;
    }

}
