package org.jgs.iotest.day01;

import java.util.Scanner;

import org.junit.Test;

/**
 * io流模拟用户的登录和注册
 * @author mosin
 * @DATE 2021年5月27日
 */
public class Regist_Login {

	@Test
	public void test01() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("欢迎使用xxxxx系统");
		int num = -1;
		do {
			System.out.println("***********************");
			System.out.println("1.注册");
			System.out.println("2.登录");
			System.out.println("3.退出");
			System.out.println("***********************");
			System.out.println("请选择:");
			int choose = scanner.nextInt();
			
			while(choose<1||choose>3) {
				System.out.println("请输入正确的选择:");
				choose = scanner.nextInt();
			}

			//定义标识符 标记用户是如何退出的
			boolean flag = false;
			//根据用户的选择 进入相应的功能
			switch (choose) {
			case 1:
				System.out.println("******欢迎注册********");
				System.out.println("请输入用户名");
				String username = scanner.next();
				while(Regist.checkUserName(username)){
					System.out.println("用户名已存在,请重新输入用户名");
					username = scanner.next();
				}
				
				System.out.println("请输入密码");
				String pwd = scanner.next();
				
				while(!(pwd.matches("\\w{6}"))) {
					System.out.println("请输入格式正确的密码");
					pwd = scanner.next();
				}
				//注册
				Regist.regist(username, pwd);
				System.out.println("注册成功！");
				break;
			case 2:
				System.out.println("********欢迎登录*******");
				System.out.println("请输入用户名");
				String uname = scanner.next();
				System.out.println("请输入密码");
				String password = scanner.next();
				
				if(Login.login(uname, password)) {
					System.out.println("登录成功");
					//结束当前方法
					return;
				}else {
					System.out.println("用户名或密码错误！");
				}
				break;
			case 3:
				System.out.println("退出系统");
				flag = true;
				break;
			}
			
			if(flag) {
				break;
			}else {
				System.out.println("请输入0返回");
				num = scanner.nextInt();
			}
		} while (num == 0);
		System.out.println("谢谢使用！");
		
	}

}
