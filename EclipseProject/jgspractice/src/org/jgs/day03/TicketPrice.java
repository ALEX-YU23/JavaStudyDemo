package org.jgs.day03;

import java.util.Scanner;

/**
 * @Description :假设从A地到B地的火车票有硬座和硬卧，价格分别为
 * 				100和190元。根据铁路部门规定，未成年人（18周岁以下）
 * 				身高不足120cm免票，120（含）-150（不含）cm需半票，
 * 				150及以上的需全票，未成年人卧铺只能减免硬座的半价。请设
 * 				计一个购票程序，要求输入年龄和身高（未成人需要输入）以及票
 * 				的类型，输出票的价
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version 1.0
 * @date 2021年3月30日下午8:46:39
 */
public class TicketPrice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入您的年龄：");
		int age = scan.nextInt();
		boolean isAdult = true;
		if (age<18) {
			isAdult = false;
		}
		System.out.println("请问您购票的类型：");
		String type  = scan.next();
		
		if (isAdult) {
			switch (type) {
			case "硬座":
				System.out.println("票的价为100元");
				break;
			case "硬卧":
				System.out.println("票的价为190元");
				break;
			default:
				System.out.println("请输入正确的类型");
				break;
			}
		}else {
			System.out.println("请输入您的身高：");
			double height = scan.nextDouble();
			switch (type) {
			case "硬座":
				if(height<120) {
					System.out.println("免票");
				}else if(height>=120&&height<150) {
					System.out.println("票的价为50元");
				}else {
					System.out.println("票的价为100元");
				}
				break;
			case "硬卧":
				if(height<120) {
					System.out.println("免票");
				}else if(height>=120&&height<150) {
					System.out.println("票的价为140元");
				}else {
					System.out.println("票的价为190元");
				}
				break;
			default:
				System.out.println("请输入正确的类型");
				break;
			}
			
		}
		scan.close();

	}

}
