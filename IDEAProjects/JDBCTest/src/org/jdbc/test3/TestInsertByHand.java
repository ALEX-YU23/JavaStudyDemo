package org.jdbc.test3;

import java.sql.*;

/**
 * @author alex-ycp
 * @create 2021-06-09 18:51
 */
public class TestInsertByHand {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. 获取驱动
        Class.forName("com.mysql.jdbc.Driver");

        // 连接名
        String url = "jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String username = "root";
        String password = "1qaz2wsx";

        // 2. 获取数据库连接
        Connection connection = DriverManager.getConnection(url, username, password);

        // sql语句
        String sql = "select * from users";
        // 3. 执行对象
        PreparedStatement ps = connection.prepareStatement(sql);
        // 4. 获取结果集
        ResultSet resultSet = ps.executeQuery();


        while (resultSet.next()){
            System.out.println("id=" + resultSet.getObject("id"));
            System.out.println("name=" + resultSet.getObject("NAME"));
            System.out.println("password=" + resultSet.getObject("PASSWORD"));
            System.out.println("email=" + resultSet.getObject("email"));
            System.out.println("birth=" + resultSet.getObject("birthday"));
            System.out.println("****************");
        }

        resultSet.close();
        ps.close();
        connection.close();

    }

}
