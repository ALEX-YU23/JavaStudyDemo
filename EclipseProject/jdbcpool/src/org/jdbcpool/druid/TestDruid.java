package org.jdbcpool.druid;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PseudoColumnUsage;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.junit.Test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;

public class TestDruid {

	@Test
	public void test01() {
		DruidDataSource ds = new DruidDataSource();
		
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/jgs2111?useUnicode=true&characterEncoding=utf8&useSSL=true");
		ds.setUsername("root");
		ds.setPassword("1qaz2wsx");
		
		
		// 设置其他参数
		ds.setInitialSize(10);
		ds.setMaxActive(100);
		ds.setMaxWait(2000);
		
		// 获取连接
		try {
			DruidPooledConnection connection = ds.getConnection();
			
			System.out.println(connection);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test02() {  //通过配置文件获取连接 () 
		
		Properties ps = new Properties();
		try {
			ps.load(new FileInputStream("druid.properties"));
			
			DataSource ds = DruidDataSourceFactory.createDataSource(ps);
			
			Connection conn = ds.getConnection();
			
			System.out.println(conn);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test03() {  //C3p0
		
	}
	
}
