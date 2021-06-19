package org.jgs.jdbc.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public final class JDBCUtile {
	private static String url = null;
	private static String username = null;
	private static String password = null;
	
	
	static {
		Properties ps = new Properties();
		try {
			ps.load(new FileInputStream("config/jdbc.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String driver = ps.getProperty("driver");
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		url = ps.getProperty("url");
		username = ps.getProperty("username");
		password = ps.getProperty("password");
	}
	
	// 获取连接
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// 释放数据库资源
	public static void releaseAll(Connection conn,Statement st,ResultSet rs) {
		if (conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
