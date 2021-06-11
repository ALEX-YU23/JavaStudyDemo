package org.jgs.jdbc.day01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.jdbc.dao.UserDao;
import org.jdbc.utils.JDBCUtils;
import org.junit.Test;

import ord.jdbc.entity.Users;

public class LoginAndRegist {

	@Test
	public void name() {
//		System.out.println(login());
		SimpleDateFormat ctime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		System.out.println(date);
	}
	
	// 注册
	@Test
	public Boolean login() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = in.next();
		System.out.println("请输入密码:");
		String password = in.next();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Users user = null;
		try {
			conn = JDBCUtils.getConnection();
			
			String sql_select = "SELECT	* FROM users WHERE username = ? and	password = ?";
			
			ps = conn.prepareStatement(sql_select);
			ps.setString(1, username);
			ps.setString(2, password);
			
			rs = ps.executeQuery();
			
			SimpleDateFormat birth = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat ctime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			while (rs.next()) {
				username = rs.getString(2);
				password = rs.getString(3);
				int age = rs.getInt(4);
				Date birthday = rs.getDate(5);
				Date createTime = rs.getDate(6);
				
				user = new Users(username, password, age, birthday, createTime);
				
			}
			System.out.println(user);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn, ps, rs);
		}
		
		return user != null;
		
	}
	
	// 注册
	@Test
	public void register() {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = in.nextLine();
		System.out.println("请输入密码:");
		String password = in.nextLine();
		System.out.println("请输入年龄:");
		String age = in.nextLine();
		System.out.println("请输入您的生日:");
		String birthday = in.nextLine();
		
		SimpleDateFormat ctime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String createTime = ctime.format(date);
		
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtils.getConnection();
			
			String sql_insert = "insert into users(username,password,age,birth,create_time)VALUES(?,?,?,?,?)";
			
			ps = conn.prepareStatement(sql_insert);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, age);
			ps.setString(4, birthday);
			ps.setString(5, createTime);
			
			int i = ps.executeUpdate();
			
			if (i>0) {
				System.out.println("插入成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn, ps);
		}
		
	}
	
	//测试addUser
	@Test
	public void testaddUser() {
		UserDao userDao = new UserDao();
		
		// 创建一个user
		Scanner in = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = in.nextLine();
		System.out.println("请输入密码:");
		String password = in.nextLine();
		System.out.println("请输入年龄:");
		int age = in.nextInt();
		System.out.println("请输入您的生日:");
		SimpleDateFormat birth = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = null;
		try {
			in.nextLine();
			birthday = birth.parse(in.nextLine());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Date createTime = new Date();
		
		
		Users user = new Users(username, password, age, birthday, createTime);
		
		
		userDao.addUser(user);
	}
	@Test
	public void testUpdateUser() {
		UserDao userDao = new UserDao();
		
		// 创建一个user
		Scanner in = new Scanner(System.in);
		System.out.println("请输入原用户名:");
		String oldname = in.nextLine();
		System.out.println("请输入新用户名:");
		String newname = in.nextLine();
		userDao.updateUser(oldname, newname);
	}
	
	@Test
	public void testDeleteUser() {
		UserDao userDao = new UserDao();
		
		// 创建一个user
		Scanner in = new Scanner(System.in);
		System.out.println("请输入原用户名:");
		String oldname = in.nextLine();
		
		userDao.deleteUser(oldname);
	}

}
