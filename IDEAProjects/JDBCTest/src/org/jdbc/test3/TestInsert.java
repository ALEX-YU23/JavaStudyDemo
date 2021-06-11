package org.jdbc.test3;

import org.jdbc.test2.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 * @author alex-ycp
 * @create 2021-06-09 19:27
 */
public class TestInsert {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = JdbcUtils.getConnection();
            // Sql
            String sql = "INSERT INTO users VALUES (?,?,?,?,?)";
            pst = connection.prepareStatement(sql);

            pst.setInt(1,5);
            pst.setString(2,"lihui");
            pst.setString(3,"234234");
            pst.setString(4,"23345@qq.com");

            pst.setDate(5, new java.sql.Date(System.currentTimeMillis()));

            int i = pst.executeUpdate();
            if (i>0){
                System.out.println("插入成功!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(connection,pst,null);

        }

    }
}
