package org.jgs.day03;

import java.util.Scanner;

/**
 * @Description 出租车，起步价（2公里以内）为7元，超过2公里的按照每公里3元计算。要求根据路程计算费用
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version 1.0
 * @date 2021年3月30日下午7:33:57
 */
public class TaxiMeter {

	public static void main(String[] args) {
		
		// 扫描键盘输入
		Scanner scan = new Scanner(System.in);
		// 输入里程数
		System.out.println("请输入您的里程数：");
		double mile = scan.nextDouble();
		
		if (mile <= 2) {
			System.out.println("您应付7元！！！");
		}else {
			double price = 7 + (mile-2)*3;
			System.out.println("您应付"+price+"元！！！");
		}
		
		
		
		
		
		
		// 关闭输入流
		scan.close();

	}

}
