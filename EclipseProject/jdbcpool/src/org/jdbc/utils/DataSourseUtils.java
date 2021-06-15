package org.jdbc.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;


public final class DataSourseUtils {

	private static  DataSource ds = null;
	
	private DataSourseUtils() {
		
	}
	static {
		Properties ps = new Properties();
		try {
			ps.load(new FileInputStream("druid.properties"));
			
			ds =  DruidDataSourceFactory.createDataSource(ps);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取数据库连接池
	 */
	public static DataSource getDataSource(){
		return ds;
	}
	
	/***
	 * 
	 * @Description 返回一个数据库连接
	 * @author AlexYU 
	 * @date 2021年6月11日下午2:47:39
	 * @return Connection
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
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
