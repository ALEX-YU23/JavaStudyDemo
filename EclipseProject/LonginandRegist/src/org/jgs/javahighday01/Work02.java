package org.jgs.javahighday01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
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
public class Work02 {

	private static Scanner input = new Scanner(System.in);

	// 用户列表
//	private static List<User> userList = new ArrayList<>();
	private static StringBuilder userList = new StringBuilder();
	private static File userData = new File("userdata.txt");
	
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
		if (userData.length()==0) {
			System.out.println("目前数据库中无用户,请先注册!!");
			return;
		}
		readUserData();
		System.out.println("*****");
		boolean flag;
		String username = "";
		String password = "";
		do {
			System.out.println("请输入用户名: ");
			username = input.next();
			System.out.println("请输入密码: ");
			password = input.next();
			flag = true;
			boolean containUsername = userList.toString().contains(username);
			boolean containPassword = userList.toString().contains(password);
			if (!(containPassword&&containUsername)) {
				flag = false;
			}
			
			if(flag) {
				System.out.println("恭喜登录成功!!");
				System.out.println();
				System.exit(0);
			}else {
				throw new UsernamePasswordMismatchException();
			}
		}while(flag);
	}
	
	
	public static void regist() throws UsernameUniqueException, PassWordNotFormatException {
		// 读取用户列表
		if (userData.length()!=0) {
			readUserData();
		}
		System.out.println("请输入用户名");
		String username = input.next();
		// 校验用户名是否已经存在
		while (userList.length()!=0&&userList.toString().contains(username)) {
			System.out.println("用户名重复,请输入用户名");
			username = input.next();
		}
		System.out.println("请输入密码: ");
		String password = input.next();
		// 校验密码是否由数字字母组成 六位    
		if (!password.matches("[A-Za-z0-9]{6}")) {
			throw new PassWordNotFormatException(password);
		}
		
		User user = new User(username, password);
		
		userList.append(user.toString());
		
		// 写入文件
		writeUserData(user.toString());
		System.out.println("注册成功!!");
	}
	
	public static void readUserData() {
		// 字符输入流
		FileReader fr = null;
		try {
			fr = new FileReader(userData);
			
			// 读入 数据
			char[] cbuf = new char[64];
			int len;
			while ((len=fr.read(cbuf))!=-1) {
				userList.append(new String(cbuf, 0, len));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void writeUserData(String user) {
		System.out.println("开始写入用户数据");
		FileWriter fw = null;
		try {
			fw = new FileWriter(userData,true);
			fw.write(user+"\r\n");
			System.out.println("写入用户数据完毕");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
