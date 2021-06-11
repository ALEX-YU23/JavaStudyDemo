package org.jdbc.test1;

import java.sql.*;

/**
 * 我的第一个JDBC程序
 * @author alex-ycp
 * @create 2021-06-09 14:12
 */
public class JdbcFirstDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. 加载驱动// 固定写法,加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        // 2. 用户信息和url
        // useUnicode=true    设置中文编码
        // &characterEncoding=utf8  字符集为utf8
        // &useSSL=true   使用安全连接
        String url = "jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String username = "root";
        String password = "1qaz2wsx";
        // 3. 连接成功,数据库对象
        Connection connection = DriverManager.getConnection(url, username, password);
        // 4. 执行SQL的对象
        Statement statement = connection.createStatement();
        // 5. 执行SQL的对象 去 执行SQL, 可能会有结果,查看返回结果
        String sql = "SELECT * FROM users";

        ResultSet resultSet = statement.executeQuery(sql);// 返回的结果集,封装了所有查出来的结果
        while(resultSet.next()){
            System.out.println("id=" + resultSet.getObject("id"));
            System.out.println("name=" + resultSet.getObject("NAME"));
            System.out.println("password=" + resultSet.getObject("PASSWORD"));
            System.out.println("email=" + resultSet.getObject("email"));
            System.out.println("birth=" + resultSet.getObject("birthday"));
            System.out.println("====================");

        }
        // 6. 释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
