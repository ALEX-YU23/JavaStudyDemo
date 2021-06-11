package org.jdbc.test2;

import org.jdbc.test2.utils.JdbcUtils;

import java.sql.*;

/**
 * @author alex-ycp
 * @create 2021-06-09 18:20
 */
public class SQL注入 {
    public static void main(String[] args) {
        login("wangwu","123456"); //正常登录   login("' or '1=1","123456");
//        login("' or '1=1","123456");
//        login("'' or '1=1","123456");
    }

    // 登录业务
    public static void login(String username, String password){
        // 获取连接
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtils.getConnection();
            // 获取执行sql的对象
            //statement = connection.createStatement();
            // SQL语句  SELECT * FROM users WHERE `NAME` = "lisi" AND `PASSWORD` = "123456"
            // "select * from users where `NAME`='"+ name +"'  AND `PASSWORD`='"+ password +"'"  -- 不严谨
            String sql = "SELECT * FROM users WHERE `NAME` = ? AND `PASSWORD` = ?";

            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,username);
            pst.setString(2,password);
            // 执行SQL语句  获取结果集对象
            resultSet = pst.executeQuery();
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
