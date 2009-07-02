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
package org.seasar.doma.internal.apt.meta;

import static org.seasar.doma.internal.util.Assertions.*;

import java.sql.Array;
import java.util.List;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;

import org.seasar.doma.ArrayFactory;
import org.seasar.doma.internal.apt.AptException;
import org.seasar.doma.internal.apt.Models;
import org.seasar.doma.message.MessageCode;

/**
 * @author taedium
 * 
 */
public class ArrayCreateQueryMetaFactory extends
        AbstractCreateQueryMetaFactory<ArrayCreateQueryMeta> {

    public ArrayCreateQueryMetaFactory(ProcessingEnvironment env) {
        super(env, Array.class);
    }

    @Override
    public QueryMeta createQueryMeta(ExecutableElement method, DaoMeta daoMeta) {
        assertNotNull(method, daoMeta);
        ArrayFactory arrayFactory = method.getAnnotation(ArrayFactory.class);
        if (arrayFactory == null) {
            return null;
        }
        ArrayCreateQueryMeta queryMeta = new ArrayCreateQueryMeta();
        queryMeta.setQueryKind(QueryKind.ARRAY_FACTORY);
        queryMeta.setJdbcTypeName(arrayFactory.typeName());
        queryMeta.setName(method.getSimpleName().toString());
        queryMeta.setExecutableElement(method);
        doTypeParameters(queryMeta, method, daoMeta);
        doReturnType(queryMeta, method, daoMeta);
        doParameters(queryMeta, method, daoMeta);
        doThrowTypes(queryMeta, method, daoMeta);
        return queryMeta;
    }

    @Override
    protected void doParameters(ArrayCreateQueryMeta queryMeta,
            ExecutableElement method, DaoMeta daoMeta) {
        List<? extends VariableElement> params = method.getParameters();
        int size = params.size();
        if (size != 1) {
            throw new AptException(MessageCode.DOMA4002, env, method);
        }
        VariableElement param = params.get(0);
        TypeMirror arrayType = Models.resolveTypeParameter(daoMeta
                .getTypeParameterMap(), param.asType());
        if (arrayType.getKind() != TypeKind.ARRAY) {
            throw new AptException(MessageCode.DOMA4076, env, param);
        }
        queryMeta.setArrayTypeName(Models.getTypeName(arrayType, daoMeta
                .getTypeParameterMap(), env));
        queryMeta.setArrayName(Models.getParameterName(param));
    }
}