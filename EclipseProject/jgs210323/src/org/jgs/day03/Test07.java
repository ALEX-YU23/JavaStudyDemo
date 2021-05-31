package org.jgs.day03;

import java.util.Scanner;

/*
 * 输出两个数字之间的最大数
 */
public class Test07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数字：");
		double num1 = scanner.nextDouble();
		System.out.println("请输入第二个数字：");
		double num2 = scanner.nextDouble();
		
		if (num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
		
	}
}
