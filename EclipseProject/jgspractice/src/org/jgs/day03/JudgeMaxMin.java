package org.jgs.day03;

import java.util.Scanner;

/**
 * @Description : 输出两个数字之间的最大数
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version 1.0
 * @date 2021年3月31日上午8:47:44
 */
public class JudgeMaxMin {

	public static void main(String[] args) {
		

		// 从键盘扫描输入
		Scanner scan = new Scanner(System.in);
		// 分别输入两个数
		System.out.println("请分别输入两个数：");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		double num3 = (num1>num2)?num1:num2;
		
		System.out.println("最大的数是:" + num3);
	}

}
