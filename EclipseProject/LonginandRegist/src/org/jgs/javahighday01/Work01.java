package org.jgs.javahighday01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jgs.javahighday01.eneity.User;
import org.jgs.javahighday01.exception.PassWordNotFormatException;
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
	private static File userData = new File("userdata.dat");
	
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
					} catch (PassWordNotFormatException e) {
						System.err.println(e.getMessage());
					}
					break;
			}
		}
	}
	public static void login() throws UsernamePasswordMismatchException {
		// 读取用户列表
		readUserData();
		System.out.println("*****");
		userList.forEach(x->System.out.println(x));
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
	
	
	public static void regist() throws UsernameUniqueException, PassWordNotFormatException {
		// 读取用户列表
		readUserData();
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
		// 校验密码是否由数字字母组成 六位    
		if (!password.matches("[A-Za-z0-9]{6}")) {
			throw new PassWordNotFormatException(password);
		}
		
		User user = new User(username, password);
		
		userList.add(user);
		
		// 写入文件
		writeUserData();
		System.out.println("注册成功!!");
	}
	
	@SuppressWarnings("unchecked")
	public static void readUserData() {
		
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(userData));
			userList = (List<User>)ois.readObject();
			if (userList==null) {
				return;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ois!=null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void writeUserData() {
		System.out.println("开始写入用户数据");
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(userData));
			oos.writeObject(userList);
			oos.flush();
			System.out.println("写入用户数据完毕");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos!=null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
