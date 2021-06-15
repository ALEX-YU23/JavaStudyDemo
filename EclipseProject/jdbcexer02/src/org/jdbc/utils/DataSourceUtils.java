package org.jdbc.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public final class DataSourceUtils {

	// 共有的数据库连接池
	private static DataSource ds = null;
	
	// 静态代码块加载资源
	static {
		// 创建一个properties类读取配置文件
		Properties ps = new Properties();
		try {
			ps.load(new FileInputStream("source/ds.properties"));
			ds = DruidDataSourceFactory.createDataSource(ps);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/***
	 * 返回一个数据库连接池对象
	 * @Description
	 * @author AlexYU 
	 * @date 2021年6月13日下午1:39:49
	 * @return
	 */
	public static DataSource getDataSource() {
		return ds;
	}
	
	/***
	 * 返回一个数据库连接
	 * @Description
	 * @author AlexYU 
	 * @date 2021年6月13日下午1:41:48
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
	 * @Description
	 * @author AlexYU 
	 * @date 2021年6月13日下午1:43:55
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
