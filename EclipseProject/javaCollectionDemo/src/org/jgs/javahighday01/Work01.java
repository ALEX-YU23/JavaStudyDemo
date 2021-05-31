package org.jgs.javahighday01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jgs.javahighday01.eneity.User;
import org.jgs.javahighday01.exception.UsernamePasswordMismatchException;
import org.jgs.javahighday01.exception.UsernameUniqueException;

/**
 * 使用ArrayList作为数据存储，实现用户注册和登录功能
 * 要求:
 * 1.使用User实体类保存用户信息:用户名、密码、真实姓名、手机号等
 * 2.注册时校验用户名是否重复
 * 3.登录时校验用户名或者密码是否正确
 * 4.所有错误信息使用白定义异常抛出
 * 
 */
public class Work01 {

	private static Scanner input = new Scanner(System.in);

	// 用户列表
	private static List<User> userList = new ArrayList<>();
	
	public static void main(String[] args) {

		
		while (true) {
			System.out.println("请选择: 1登录 2注册");
			switch (input.nextInt()) {
				case 1:
					// 登录
				try {
					login();
				} catch (UsernamePasswordMismatchException e1) {
					System.err.println(e1.getMessage());
				}
					
					
					break;
				case 2:
					// 注册
					try {
						regist();
					} catch (UsernameUniqueException e) {
						System.err.println(e.getMessage());
					}
					break;
			}
		}
	}
	public static void login() throws UsernamePasswordMismatchException {
		boolean flag;
		String username = "";
		String password = "";
		do {
			System.out.println("请输入用户名: ");
			username = input.next();
			System.out.println("请输入密码: ");
			password = input.next();
			flag = true;
			User user2 = new User();
			for (User user : userList) {
				if (user.getUsername().equals(username)&&user.getPassword().equals(password)) {
					user2 = user;
					flag = false;
				}else {
					
					flag = true;
				}
			}
			if(!flag) {
				System.out.println("恭喜登录成功!!");
				System.out.println(user2);
				System.exit(0);
			}else {
				throw new UsernamePasswordMismatchException();
			}
		}while(flag);
	}
	
	
	public static void regist() throws UsernameUniqueException {
		
		System.out.println("请输入用户名");
		String username = input.next();
		// 校验用户名是否已经存在
		for (User user : userList) {
			if(user.getUsername().equals(username)) {
				throw new UsernameUniqueException(username);
			}
		}
		System.out.println("请输入密码: ");
		String password = input.next();
		System.out.println("请输入真实姓名: ");
		String realname = input.next();
		System.out.println("请输入手机号码: ");
		String phonenum = input.next();
		
		User user = new User(username, password, realname, phonenum);
		
		userList.add(user);
		
		System.out.println("注册成功!!");
	}
}
