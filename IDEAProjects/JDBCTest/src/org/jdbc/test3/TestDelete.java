package org.jdbc.test3;

import org.jdbc.test2.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author alex-ycp
 * @create 2021-06-09 19:43
 */
public class TestDelete {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            // 1. 获取连接
            connection = JdbcUtils.getConnection();

            // sql语句
            String sql = "DELETE from users WHERE id = ?";
            // 2. 获取执行对象
            pst = connection.prepareStatement(sql);
            pst.setInt(1,4);

            int i = pst.executeUpdate();
            if (i>0){
                System.out.println("删除成功!!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(connection,pst,null);
        }
    }
}
