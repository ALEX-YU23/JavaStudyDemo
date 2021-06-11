package org.jdbc.test2;

import org.jdbc.test2.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author alex-ycp
 * @create 2021-06-09 18:11
 */
public class TestUpdate {
    public static void main(String[] args) {
        // 获取连接
        Connection connection = null;
        Statement statement = null;
        try {
            connection = JdbcUtils.getConnection();

            // 获取执行SQL语句的对象 -- 执行对象
            statement = connection.createStatement();

            // sql语句
            String sqlDelete = "UPDATE users SET `NAME` = \"hdhhdhdhh\" where id = 2";
            // 执行SQL
            int i = statement.executeUpdate(sqlDelete);

            if (i>0){
                System.out.println("修改成功!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(connection,statement,null);
        }
    }
}
