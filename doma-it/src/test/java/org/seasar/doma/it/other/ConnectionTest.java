package org.seasar.doma.it.other;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import org.junit.runner.RunWith;
import org.seasar.doma.it.dao.EmployeeDao;
import org.seasar.doma.it.dao.EmployeeDaoImpl;
import org.seasar.doma.it.entity.Employee;
import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.unit.Seasar2;

@RunWith(Seasar2.class)
public class ConnectionTest {

    public void test() throws Exception {
        DataSource dataSource = SingletonS2Container
                .getComponent(DataSource.class);

        Connection connection = dataSource.getConnection();
        try {
            EmployeeDao dao = new EmployeeDaoImpl(connection);
            List<Employee> list = dao.selectAll();
            assertEquals(14, list.size());
            list = dao.selectAll();
            assertEquals(14, list.size());
        } finally {
            connection.close();
        }
    }
}
