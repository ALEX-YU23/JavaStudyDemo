package cn.kgc.javaweb.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

/**
 * 德鲁伊连接池工具类
 * @author mosin
 * @date 2021年7月6日
 * @version  1.0
 */
public final class DruidDataSourceUtil {
	private static DataSource dds = null;
	private DruidDataSourceUtil() {
		
	}
	
	static {
		
		Properties ps = new Properties();
		//通过类加载器 获取配置文件
		InputStream is = DruidDataSourceUtil.class.getClassLoader().getResourceAsStream("Druid.properties");
		try {
			ps.load(is);
			//获取连接池对象
			dds = DruidDataSourceFactory.createDataSource(ps);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static Connection getConnection() {
		
		 Connection connection =null;
		try {
			connection = dds.getConnection();
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		 return connection;
	}
	
	public static DataSource getDataSource() {
		return dds;
	}
	
	public static void closeAll(ResultSet rst,Statement stmt,Connection connection) {
		
		try {
			if(rst!=null) {
				rst.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(stmt!=null) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(connection!=null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
