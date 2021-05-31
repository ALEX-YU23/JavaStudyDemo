package org.jgs.javahighday01.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.jgs.javahighday01.eneity.User;
import org.jgs.javahighday01.exception.PassWordNotFormatException;
import org.jgs.javahighday01.exception.UserListNullException;
import org.jgs.javahighday01.exception.UsernamePasswordMismatchException;
import org.jgs.javahighday01.exception.UsernameUniqueException;

import sun.misc.BASE64Encoder;

public class LGService {

	// 用户列表
	private static List<User> userList = new ArrayList<>();
	// 用户列表保存文件
	private static File userData = new File("userdata.dat");
	// 全局扫描器
	private static Scanner input = new Scanner(System.in);
	
	public static void view() {
		// 显示界面
		System.out.println("*****欢迎来到没啥用系统*****");
		System.out.println("༼ つ ◕_◕ ༽つ");
		System.out.println(" --------------------------- ");
		System.out.println("|                           |");
		System.out.println("|                           |");
		System.out.println("|    1.登录 2.注册 3.退出   |");
		System.out.println("|                           |");
		System.out.println("|                           |");
		System.out.println(" --------------------------- ");
	}
	
	public static void login() throws UsernamePasswordMismatchException,InputMismatchException, UserListNullException {
		userList.forEach(x->System.out.println(x));
		System.out.println("\n**********登录**********\n");
		//
		if (userList.size()==0) {
			System.out.println("登陆失败");
			throw new UserListNullException();
		}
		System.out.println("请输入用户名:");
		String username = input.next();
		System.out.println("请输入密码:");
		String password = input.next();
		boolean flag = false;
		for (User user : userList) {
			// 判断用户是否已注册
			if (user.getUsername().equals(username)&&user.getPassword().equals(password)) {
				System.out.println("\n (o゜▽゜)o☆[BINGO!]");
				System.out.println("登录成功");
				System.out.println(user);
				System.out.println();
				flag = true;
				System.out.println("　　 へ　　　　　／|\r\n"
						+ "　　/＼7　　∠＿/\r\n"
						+ "　 /　│　　 ／　／\r\n"
						+ "　│　Z ＿,＜　／　　 /`ヽ\r\n"
						+ "　│　　　　　ヽ　　 /　　〉\r\n"
						+ "　 Y　　　　　`　 /　　/\r\n"
						+ "　ｲ●　､　●　　⊂⊃〈　　/\r\n"
						+ "　()　 へ　　　　|　＼〈\r\n"
						+ "　　>ｰ ､_　 ィ　 │ ／／\r\n"
						+ "　 / へ　　 /　ﾉ＜| ＼＼\r\n"
						+ "　 ヽ_ﾉ　　(_／　 │／／\r\n"
						+ "　　7　　　　　　　|／\r\n"
						+ "　　＞―r￣￣`ｰ―＿");
				break;
			}
		}
		if (!flag) {
			System.out.println("登陆失败");
			throw new UsernamePasswordMismatchException();
		}
	}
	
	public static void regist() throws UsernameUniqueException, PassWordNotFormatException,InputMismatchException {
		// 开始注册时先读入保存的用户列表
//		readUserData();
		System.out.println("\n**********注册**********\n");
		System.out.println("请输入用户名:");
		String username = input.next();
		for (User user : userList) {
			// 判断用户名是否重复
			if (user.getUsername().equals(username)) {
				throw new UsernameUniqueException(username);
			}
		}
		System.out.println("请输入密码:");
		String password = input.next();
		// 判断密码是否6位由数字或者字母组成
		if (!password.matches("[A-Za-z0-9]{6}")) {
			throw new PassWordNotFormatException(password);
		}
		User user = new User(username, password);
		userList.add(user);
		System.out.println("\n o(*≧▽≦)ツ┏━┓");
		System.out.println("注册成功!!\n");
		// 将用户列表持久化
		writeUserData();
	}
	
	@SuppressWarnings("unchecked")
	public static void readUserData() {
		// 如果用户列表不存在则返回
		if (!userData.exists()||userData.length()==0) {
			return;
		}
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(userData));
			userList = (List<User>)ois.readObject();
//			if (userList==null) {
//				return;
//			}
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
//		System.out.println("开始写入用户数据");
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(userData));
			oos.writeObject(userList);
			oos.flush();
//			System.out.println("写入用户数据完毕");
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
	
	public static boolean exit() {
		// 是否退出系统
		System.out.println("\n是否退出系统(y or n):");
		if ("y".equalsIgnoreCase(input.next())) {
			return false;
		}
		return true;
	}
	public static void getImageStr(String imgFile) {
	    InputStream inputStream = null;
	    byte[] data = null;    
	    try {
	        inputStream = new FileInputStream(imgFile);
	        data = new byte[inputStream.available()];
	        inputStream.read(data);
	        inputStream.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }    // 加密
	    BASE64Encoder encoder = new BASE64Encoder();    
	    System.out.println(encoder.encode(data));
	}
}
