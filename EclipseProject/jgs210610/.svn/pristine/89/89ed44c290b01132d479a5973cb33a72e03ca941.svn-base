package org.jgs.jdbc.utile;

/**
 * druid连接池工具类
 * @author mosin
 * @date 2021年6月11日
 */

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public final class DataSourceUtile {
	private static DataSource ds = null;

	private DataSourceUtile() {
	};

	static {

		try {
			Properties ps = new Properties();
			ps.load(new FileInputStream("druid.properties"));
			ds = DruidDataSourceFactory.createDataSource(ps);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//获取连接连接池
	public static DataSource getDataSource() {
		return ds;
	}

	//获取连接
	public static Connection getConnection() throws SQLException {
		//通过数据库连接池获取连接
		return ds.getConnection();
	}

	//关闭连接
	public static void closeAll(ResultSet rs, Statement st, Connection connection) {

		try {
			if (rs != null) {
				rs.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (st != null) {
				st.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (connection != null) {
				connection.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
