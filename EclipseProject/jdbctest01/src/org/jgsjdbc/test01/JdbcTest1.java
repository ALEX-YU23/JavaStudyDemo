package org.jgsjdbc.test01;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.mysql.jdbc.Driver;

public class JdbcTest1 {

	@Test
	public void test1() {
		//1.创建驱动 Driver 每个驱动程序必须实现的接口
		Driver driver = null;
		Connection conn = null;
		try {
			driver = new Driver();
			// 注册驱动 
			DriverManager.registerDriver(driver);
			// 获取连接
			String url = "jdbc:mysql://localhost:3306/jgs2111?useUnicode=true&characterEncoding=utf8&useSSL=true";
			String user = "root";
			String passwordString = "1qaz2wsx";
			conn = DriverManager.getConnection(url, user, passwordString);
			
			System.out.println(conn);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() {
		//1.创建驱动 Driver 每个驱动程序必须实现的接口
		Connection conn = null;
		// 通过反射加载驱动
		try {
			// 获取连接
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jgs2111?useUnicode=true&characterEncoding=utf8&useSSL=true";
			String user = "root";
			String passwordString = "1qaz2wsx";
			conn = DriverManager.getConnection(url, user, passwordString);
			
			System.out.println(conn);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test3() {
		
		Connection conn = null;
		Statement s = null;
		ResultSet rs = null;
		try {
			// 1. 注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/jgs2111?useSSL=false" ;
			String user = "root";
			String password = "1qaz2wsx";
			// 2. 获取连接
			conn = DriverManager.getConnection(url, user, password);
			
			// sql语句
			String sql_in = "insert into users(id,username,password,age,birth)VALUES(2,\"张祥\",\"12345\",12,\"2012-09-19\")";
			
			s = conn.createStatement();
			
			// 3. 获取SQL执行对象
			int i = s.executeUpdate(sql_in);
			if (i>0) {
				System.out.println("插入成功");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6. 关闭资源
			if (s!=null) {
				try {
					s.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}
}
