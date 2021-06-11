package org.jgs.jdbc.day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.jgs.jdbc.utile.DataSourceUtile;
import org.junit.Test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 常用连接池的使用
 * 1.druid连接池
 * 2.C3P0连接池
 * @author mosin
 * @date 2021年6月11日
 */
public class JDBCTest04 {
	
	@Test
	public void  test01() throws SQLException {//获取druid连接池
		
		DruidDataSource ds = new DruidDataSource();
		//设置数据库连接池的参数
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql:///jgs2111");
		ds.setUsername("root");
		ds.setPassword("root");
		
		//设置其它的参数
		ds.setInitialSize(10);  //初始化的连接数
		ds.setMaxActive(100);  //最大连接数
		ds.setMaxWait(2000);  // 最大的等待时间
		
		//获取连接
		DruidPooledConnection connection = ds.getConnection();
		System.out.println(connection);
		connection.close();
		
	}
	
	@Test
	public void  test02() throws SQLException {//通过配置文件 获取druid连接池 推荐
		
		try {
			Properties ps = new  Properties();
			ps.load(new FileInputStream("druid.properties"));
			DataSource ds = DruidDataSourceFactory.createDataSource(ps);
			Connection connection = ds.getConnection();
			System.out.println(connection);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test
	public void  test03() throws SQLException {//使用c3p0连接池获取连接

		ComboPooledDataSource ds = new ComboPooledDataSource();
		Connection connection = ds.getConnection();
		System.out.println(connection);

	}
	@Test
	public void  test04() {//测试数据库连接池工具类
		
		try {
			Connection connection = DataSourceUtile.getConnection();
			System.out.println(connection);
			DataSourceUtile.closeAll(null, null, connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
