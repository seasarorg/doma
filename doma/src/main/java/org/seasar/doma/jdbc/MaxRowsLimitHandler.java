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
package org.seasar.doma.jdbc;

/**
 * 最大行数の制限値に達した場合に呼び出されるハンドラです。
 *
 * @author nakamura
 * @since 1.37.0
 */
public interface MaxRowsLimitHandler {

    /**
     * 最大行数の制限値に達した場合を処理します。
     *
     * @param maxRows
     *            最大行数
     * @param sql
     *            SQL
     */
    void handle(int maxRows, Sql<? extends SqlParameter> sql);
}
