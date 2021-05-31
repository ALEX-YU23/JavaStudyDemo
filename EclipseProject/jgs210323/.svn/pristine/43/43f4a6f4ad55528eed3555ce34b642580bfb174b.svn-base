package org.jgs.day05;

import java.util.Scanner;
/*
 * 要求用户输入一个年份和一个月份，
 * 判断（要求使用嵌套的if…else和switch分别判断一次）该年该月有多少天。
 */
public class Test09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = scanner.nextInt();
		System.out.println("请输入月份");
		int month = scanner.nextInt();
		
		//判定是平年还是闰年
		if ((year%4==0&&year%100!=0)||year%400==0) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(year+"年"+month+"月有31天");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(year+"年"+month+"月有30天");
				break;
			case 2:
			System.out.println(year+"年"+month+"月有29天");
				break;
			default:
				System.out.println("请输入正确的月份");
				break;
			}
			
		}else {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(year+"年"+month+"月有31天");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(year+"年"+month+"月有30天");
				break;
			case 2:
			System.out.println(year+"年"+month+"月有28天");
				break;
			default:
				System.out.println("请输入正确的月份");
				break;
			}
		}
	}

}
