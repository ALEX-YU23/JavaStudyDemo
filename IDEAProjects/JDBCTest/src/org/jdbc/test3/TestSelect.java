package org.jdbc.test3;

import org.jdbc.test2.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author alex-ycp
 * @create 2021-06-09 19:43
 */
public class TestSelect {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement pst = null;
        ResultSet resultSet = null;
        try {
            // 1. 获取连接
            connection = JdbcUtils.getConnection();

            // sql语句
            String sql = "select * from users where id = ?";
            // 2. 获取执行对象
            pst = connection.prepareStatement(sql);
            pst.setInt(1,3);

            resultSet = pst.executeQuery();
            while (resultSet.next()){
                System.out.println("name=" + resultSet.getObject("NAME"));
                System.out.println("password=" + resultSet.getObject("PASSWORD"));
                System.out.println("************************");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(connection,pst,resultSet);
        }
    }
}
