package org.jgs.day03;

import java.util.Scanner;

public class JudgeLeap {

	/**
	 * @Description 判断闰年（闰年的条件是能被4整除，但不能被100整除；或能被400整除。）
	 * @author AlexYU 
	 * @date 2021年3月30日下午7:47:08
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 扫描键盘输入
		Scanner scan = new Scanner(System.in);
		// 输入年份
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		
		if ((year%4==0&&year%100!=0)||year%400==0) {
			System.out.println(year + "年是闰年！！！");
		}else {
			System.out.println(year + "年不是闰年！！！");
		}

	}

}
