package org.jgs.jdbc.utile;

/**
 * 数据库连接工具类
 * @author mosin
 * @date 2021年6月11日
 * @version  1.0
 */

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public final class JDBCUtile {
	
	private static String url = null;
	private static String driver = null;
	private static String username = null;
	private static String password = null;

	private JDBCUtile() {
		
	}
	
	static {
		try {
			FileInputStream fis = new FileInputStream("JDBC.properties");
			//获取配置文件中的参数
			Properties ps = new Properties();
			ps.load(fis);

			driver = ps.getProperty("driver");
			url = ps.getProperty("url");
			username = ps.getProperty("username");
			password = ps.getProperty("password");
			//注册驱动
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//获取连接
	public static Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
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
