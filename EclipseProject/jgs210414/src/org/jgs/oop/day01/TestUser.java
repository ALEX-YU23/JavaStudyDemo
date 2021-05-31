package org.jgs.oop.day01;

import java.util.Scanner;

public class TestUser {

	public static void main(String[] args) {
		//接收用户的输入
		Scanner scanner = new Scanner(System.in);
		//创建user对象
		User user = new User();
		System.out.println("请输入您的姓名");
		user.userName = scanner.next();
		System.out.println("请输入您的年龄");
		user.age = scanner.nextInt();
		//判定票价
		int price = user.judgeTicket(user.age);

		//打印输出信息
		System.out.println(user.userName+"年龄为"+user.age+" 票价是："+price);
		
	}

}
