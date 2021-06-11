package org.jdbc.service;
/**
 * 数据持久化
 * @Description
 * @author AlexYU
 * @date 2021年6月10日下午8:11:55
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.jdbc.dao.UserDao;

import ord.jdbc.entity.Users;

public class UserService {

	private static UserDao userDao = new UserDao();
	// 注册
	public static boolean register(Users user) {
		return userDao.addUser(user);
	}

	// 登录
	public static boolean login(String username,String password) {
		return userDao.selectUser(username,password);
	}
	
	public static Users diyUser() {
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
		
		
		return new Users(username, password, age, birthday, createTime);
	}
}
