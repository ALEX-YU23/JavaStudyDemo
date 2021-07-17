package org.jgsjavaweb.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public final class DataSourceUtils {
	// 公有的数据库连接池
	private static DataSource ds = null;
	
	private DataSourceUtils(){
		
	}
	
	// 静态代码块加载资源
	static {
		//创建一个properties类读取数据
		Properties ps = new Properties();
		try {
			// 加载配置文件
			InputStream is = DataSourceUtils.class.getClassLoader().getResourceAsStream("./druid.properties");
			ps.load(is);
			// 根据配置文件创建连接池
			ds = DruidDataSourceFactory.createDataSource(ps);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/***
	 * 返回一个数据库连接池对象
	 * @return
	 */
	public static DataSource getDataSource() {
		return ds;
		
	}
	
	/***
	 * 返回一个数据库连接
	 * @return
	 */
	public static Connection getConnection() {
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	/***
	 * 释放连接
	 * @param connection
	 * @param statement
	 * @param resultSet
	 */
	public static void releaseAll(Connection connection,Statement statement,ResultSet resultSet) {
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
}