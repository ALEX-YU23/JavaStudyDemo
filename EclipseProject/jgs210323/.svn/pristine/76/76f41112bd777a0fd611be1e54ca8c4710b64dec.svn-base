package org.jgs.day03;

import java.util.Scanner;

/*
 * 2.判断闰年
 * （闰年的条件是能被4整除，但不能被100整除；或能被400整除。）
 */
public class Test02 {

	public static void main(String[] args) {
		//创建扫描器
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份:");
		int year = scan.nextInt();
		
		//判定
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.println("该年份是闰年");
		}else {
			System.out.println("该年份是平年");
		}

	}

}
