package org.jdbc.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public final class JDBCUtils {

	private static String url = null;
	private static String username = null;
	private static String password = null;
	static {
		try {
			// getResourceAsStream 默认路径为src
			InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
			
			Properties properties = new Properties();

			properties.load(in);

			String driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			username = properties.getProperty("username");
			password = properties.getProperty("password");

			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 获取数据库连接
	 * @Description
	 * @author AlexYU 
	 * @date 2021年6月10日下午2:01:09
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
	/**
	 * 
	 * @Description 释放数据库资源
	 * @author AlexYU 
	 * @date 2021年6月10日下午2:01:32
	 * @param connection
	 * @param statement
	 * @param resultSet
	 */
	public static void release(Connection connection,Statement statement,ResultSet resultSet) {
		if (connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (statement!=null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (resultSet!=null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void release(Connection connection,Statement statement) {
		if (connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (statement!=null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
