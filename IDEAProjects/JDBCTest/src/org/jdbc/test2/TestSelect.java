package org.jdbc.test2;

import org.jdbc.test2.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author alex-ycp
 * @create 2021-06-09 17:29
 */
public class TestSelect {
    public static void main(String[] args) {
        // 获取连接
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtils.getConnection();
            // 获取执行sql的对象
            statement = connection.createStatement();
            // SQL语句
            String sql = "select * from users";
            // 执行SQL语句  获取结果集对象
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                System.out.println("id=" + resultSet.getObject("id"));
                System.out.println("name=" + resultSet.getObject("NAME"));
                System.out.println("password=" + resultSet.getObject("PASSWORD"));
                System.out.println("email=" + resultSet.getObject("email"));
                System.out.println("brith=" + resultSet.getObject("birthday"));
                System.out.println("==========================");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭连接
            JdbcUtils.release(connection,statement,resultSet);
        }
    }

}
