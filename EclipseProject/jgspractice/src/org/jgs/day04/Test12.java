package org.jgs.day04;

import java.util.Scanner;

/**
 * @Description 11.打印指定行和列的矩形，矩形由*组成
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年3月31日下午6:49:02
 */
public class Test12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 请输入行
		System.out.println("请输入行:");
		int row = scan.nextInt();
		// 请输入列
		System.out.println("请输入列:");
		int col = scan.nextInt();
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		scan.close();
		
		

	}

}
