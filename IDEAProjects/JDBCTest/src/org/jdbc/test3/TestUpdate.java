package org.jdbc.test3;

import org.jdbc.test2.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author alex-ycp
 * @create 2021-06-09 19:44
 */
public class TestUpdate {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            // 1. 获取连接
            connection = JdbcUtils.getConnection();

            // sql语句 UPDATE users SET `NAME` = "lisi" where id = 4
            String sql = "UPDATE users SET `NAME` = ? where id = ?";
            // 2. 获取执行对象
            pst = connection.prepareStatement(sql);
            pst.setString(1,"bigfat");
            pst.setInt(2,5);

            int i = pst.executeUpdate();
            if (i>0){
                System.out.println("修改成功!!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(connection,pst,null);
        }
    }
}
