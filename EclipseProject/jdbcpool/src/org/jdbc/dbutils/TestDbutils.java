package org.jdbc.dbutils;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.jdbc.utils.DataSourseUtils;
import org.junit.Test;

import ord.jdbc.entity.Users;

public class TestDbutils {

	@Test
	public void test01() {//使用工具查询一条记录
		// 获取连接
		DataSource ds = DataSourseUtils.getDataSource();
			
		// 创建SQL执行对象
		QueryRunner qr = new QueryRunner(ds);
		
		// 编写SQL语句
		String sql = "select * from users where id = ?" ;
			
		try {
			Users user = qr.query(sql, new BeanHandler<>(Users.class),1);
			System.out.println(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test02() {//使用工具查询一条记录
		// 获取连接池  传入工具类
		DataSource ds = DataSourseUtils.getDataSource();
		// 创建工具类对象
		QueryRunner qr = new QueryRunner(ds);
		// 编写并执行SQL
		String sql = "";
	}
}
