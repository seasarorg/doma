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
package org.seasar.doma.internal.apt.meta;

import static org.seasar.doma.internal.util.AssertionUtil.*;

import org.seasar.doma.internal.apt.type.BasicType;

/**
 * @author taedium
 * 
 */
public class BasicListParameterMeta implements CallableSqlParameterMeta {

    protected final String name;

    protected final BasicType basicType;

    public BasicListParameterMeta(String name, BasicType basicType) {
        assertNotNull(name, basicType);
        this.name = name;
        this.basicType = basicType;
    }

    public String getName() {
        return name;
    }

    public BasicType getBasicType() {
        return basicType;
    }

    @Override
    public <R, P> R accept(CallableSqlParameterMetaVisitor<R, P> visitor, P p) {
        return visitor.visitBasicListParameterMeta(this, p);
    }

}
