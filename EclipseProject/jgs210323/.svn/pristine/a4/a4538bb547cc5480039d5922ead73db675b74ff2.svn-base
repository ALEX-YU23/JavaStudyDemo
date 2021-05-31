package org.jgs.day03;

import java.util.Scanner;

/*
 * 假设从A地到B地的火车票有硬座和硬卧，价格分别为100和190元。
 * 根据铁路部门规定，未成年人(18周岁以下)身高不足120cm免票，
 * 120(含)-150(不含)cm需半票，150及以上的需全票，
 * 未成年人卧铺只能减免硬座的半价。请设计一个购票程序，
 * 要求输入年龄和身高(未成人需要输入)以及票的类型，输出票的价
 */
public class Test06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入票型：");
		String ticketType = scanner.next();
		System.out.println("请输入年龄：");
		int age = scanner.nextInt();
		
		int ticketPrice =0;
		//逻辑判定
		if (age>=18) {
			//判定票型
			if ("硬座".equals(ticketType)) {
				ticketPrice = 100;
			}else {
				ticketPrice = 190;
			}
		}else {
			System.out.println("请输入身高：");
			double height = scanner.nextDouble();
			if (height<120) {
				ticketPrice=0;
			}else if(height<150) {
				//判定票型
				if ("硬座".equals(ticketType)) {
					ticketPrice = 50;
				}else {
					ticketPrice = 140;
				}
			}else {
				//判定票型
				if ("硬座".equals(ticketType)) {
					ticketPrice = 100;
				}else {
					ticketPrice = 190;
				}
			}
		}
		System.out.println("票价："+ticketPrice);
		scanner.close();
	}

}
