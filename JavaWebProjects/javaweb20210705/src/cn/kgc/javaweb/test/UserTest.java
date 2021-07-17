package cn.kgc.javaweb.test;

import java.sql.Connection;

import org.junit.Test;

import cn.kgc.javaweb.util.DruidDataSourceUtil;
import cn.kgc.javaweb.util.MD5Util;

public class UserTest {
	@Test
	public void testDataSource() {
		
		Connection connection = DruidDataSourceUtil.getConnection();
		System.out.println(connection);
		
	}
	
	@Test
	public void testMD5() {
		
		String  pwd = "123";
		String encryptPassword = MD5Util.encryptPassword(pwd);
		System.out.println(encryptPassword);
		System.out.println(encryptPassword.length());
	}
}
