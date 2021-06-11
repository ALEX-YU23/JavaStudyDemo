package org.jgs.jdbc.day01;

import java.util.Scanner;

import org.jdbc.service.UserService;

import ord.jdbc.entity.Users;

public class LoginAndRegist2 {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
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
			
			System.out.print("请输入(1 or 2):");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				Scanner in = new Scanner(System.in);
				System.out.println("请输入用户名:");
				String username = in.next();
				System.out.println("请输入密码:");
				String password = in.next();
				boolean login = UserService.login(username, password);
				if (login) {
					System.out.println("登录成功");
				} else {
					System.out.println("登录失败");
				}
				break;
			case 2:
				Users diyUser = UserService.diyUser();
				boolean register = UserService.register(diyUser);
				if (register) {
					System.out.println("注册成功");
				} else {
					System.out.println("注册失败");
				}
				break;
			case 3:
				flag = false;
				break;

			default:
				break;
			}
		}
	}

}
