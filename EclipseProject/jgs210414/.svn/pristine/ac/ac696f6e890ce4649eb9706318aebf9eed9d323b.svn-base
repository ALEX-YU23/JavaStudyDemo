package org.jgs.oop.day01;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		//创建账户对象
		Account account = new Account();
		//创建扫描器 实现用户输入
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名");
		String name  = scanner.next();
		System.out.println("请输入密码");
		String pwd  = scanner.next();
		
		//判定用户名和密码是否正确
		if (account.uname.equals(name)&& account.pwd.equals(pwd)) {
			System.out.println("开始更改密码，请输入新密码：");
			//更改密码
			account.pwd = scanner.next();
			System.out.println("密码修改成功");
		}else {
			System.out.println("用户名或密码不正确！");
		}

		System.out.println(account.pwd);
		scanner.close();
	}

}
