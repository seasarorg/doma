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
package org.seasar.doma.internal.jdbc.mock;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.util.Arrays;

import org.seasar.doma.internal.util.AssertionUtil;

/**
 *
 * @author taedium
 *
 */
public class MockStatement extends MockWrapper implements Statement {

    public boolean closed;

    public int addBatchCount;

    public int updatedRows = 1;

    @Override
    public void addBatch(String sql) throws SQLException {
        AssertionUtil.notYetImplemented();

    }

    @Override
    public void cancel() throws SQLException {
        AssertionUtil.notYetImplemented();

    }

    @Override
    public void clearBatch() throws SQLException {
        AssertionUtil.notYetImplemented();

    }

    @Override
    public void clearWarnings() throws SQLException {
        AssertionUtil.notYetImplemented();

    }

    @Override
    public void close() throws SQLException {
        closed = true;
    }

    @Override
    public boolean execute(String sql, int autoGeneratedKeys)
            throws SQLException {
        AssertionUtil.notYetImplemented();
        return false;
    }

    @Override
    public boolean execute(String sql, int[] columnIndexes) throws SQLException {
        AssertionUtil.notYetImplemented();
        return false;
    }

    @Override
    public boolean execute(String sql, String[] columnNames)
            throws SQLException {
        AssertionUtil.notYetImplemented();
        return false;
    }

    @Override
    public boolean execute(String sql) throws SQLException {
        return false;
    }

    @Override
    public int[] executeBatch() throws SQLException {
        int[] results = new int[addBatchCount];
        Arrays.fill(results, updatedRows);
        return results;
    }

    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        AssertionUtil.notYetImplemented();
        return null;
    }

    @Override
    public int executeUpdate(String sql, int autoGeneratedKeys)
            throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @Override
    public int executeUpdate(String sql, int[] columnIndexes)
            throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @Override
    public int executeUpdate(String sql, String[] columnNames)
            throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @Override
    public int executeUpdate(String sql) throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @Override
    public Connection getConnection() throws SQLException {
        AssertionUtil.notYetImplemented();
        return null;
    }

    @Override
    public int getFetchDirection() throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @Override
    public int getFetchSize() throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @Override
    public ResultSet getGeneratedKeys() throws SQLException {
        AssertionUtil.notYetImplemented();
        return null;
    }

    @Override
    public int getMaxFieldSize() throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @Override
    public int getMaxRows() throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @Override
    public boolean getMoreResults() throws SQLException {
        AssertionUtil.notYetImplemented();
        return false;
    }

    @Override
    public boolean getMoreResults(int current) throws SQLException {
        AssertionUtil.notYetImplemented();
        return false;
    }

    @Override
    public int getQueryTimeout() throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @Override
    public ResultSet getResultSet() throws SQLException {
        AssertionUtil.notYetImplemented();
        return null;
    }

    @Override
    public int getResultSetConcurrency() throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @Override
    public int getResultSetHoldability() throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @Override
    public int getResultSetType() throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @Override
    public int getUpdateCount() throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        AssertionUtil.notYetImplemented();
        return null;
    }

    @Override
    public boolean isClosed() throws SQLException {
        return closed;
    }

    @Override
    public boolean isPoolable() throws SQLException {
        AssertionUtil.notYetImplemented();
        return false;
    }

    @Override
    public void setCursorName(String name) throws SQLException {
        AssertionUtil.notYetImplemented();

    }

    @Override
    public void setEscapeProcessing(boolean enable) throws SQLException {
        AssertionUtil.notYetImplemented();

    }

    @Override
    public void setFetchDirection(int direction) throws SQLException {
        AssertionUtil.notYetImplemented();

    }

    @Override
    public void setFetchSize(int rows) throws SQLException {
        AssertionUtil.notYetImplemented();

    }

    @Override
    public void setMaxFieldSize(int max) throws SQLException {
        AssertionUtil.notYetImplemented();

    }

    @Override
    public void setMaxRows(int max) throws SQLException {
    }

    @Override
    public void setPoolable(boolean poolable) throws SQLException {
        AssertionUtil.notYetImplemented();

    }

    @Override
    public void setQueryTimeout(int seconds) throws SQLException {
    }

    @SuppressWarnings("all")
    public void closeOnCompletion() throws SQLException {
        AssertionUtil.notYetImplemented();

    }

    @SuppressWarnings("all")
    public boolean isCloseOnCompletion() throws SQLException {
        AssertionUtil.notYetImplemented();
        return false;
    }

    @SuppressWarnings("all")
    public long getLargeUpdateCount() throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @SuppressWarnings("all")
    public void setLargeMaxRows(long max) throws SQLException {
        AssertionUtil.notYetImplemented();

    }

    @SuppressWarnings("all")
    public long getLargeMaxRows() throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @SuppressWarnings("all")
    public long[] executeLargeBatch() throws SQLException {
        AssertionUtil.notYetImplemented();
        return null;
    }

    @SuppressWarnings("all")
    public long executeLargeUpdate(String sql) throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @SuppressWarnings("all")
    public long executeLargeUpdate(String sql, int autoGeneratedKeys)
            throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @SuppressWarnings("all")
    public long executeLargeUpdate(String sql, int[] columnIndexes)
            throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }

    @SuppressWarnings("all")
    public long executeLargeUpdate(String sql, String[] columnNames)
            throws SQLException {
        AssertionUtil.notYetImplemented();
        return 0;
    }
}
