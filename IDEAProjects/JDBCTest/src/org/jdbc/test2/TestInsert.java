package org.jdbc.test2;

import org.jdbc.test2.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author alex-ycp
 * @create 2021-06-09 16:57
 */
public class TestInsert {
    public static void main(String[] args){
        // 获取连接
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtils.getConnection();
            // 获取执行sql的对象
            statement = connection.createStatement();
            // SQL语句
            String sql = "INSERT INTO users VALUES (4,'张祥','12345','weweewew@sas.com','1998-11-09')";
            // 执行SQL语句  获取结果集对象
            int i = statement.executeUpdate(sql);
            if (i>0){
                System.out.println("插入成功");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            // 关闭连接
            JdbcUtils.release(connection,statement,resultSet);
        }





    }
}
