package org.jgs.javaweb.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public final class DataSourceUtils {
	
	private static DataSource ds = null;
	
	private DataSourceUtils() {}
	
	static {
		Properties ps = new Properties();
		try {
			InputStream is = DataSourceUtils.class.getClassLoader().getResourceAsStream("druid.properties");
			ps.load(is);
			ds = DruidDataSourceFactory.createDataSource(ps);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/***
	 * 返回数据库连接池
	 * @return
	 */
	public static DataSource getDataSource() {
		return ds;
	}
	
	/***
	 * 返回一个数据库链接
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection(){
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/***
	 * 释放资源
	 */
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
