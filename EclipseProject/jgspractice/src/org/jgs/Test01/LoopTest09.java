package org.jgs.Test01;

import java.util.Scanner;

/**
 * @Description : 要求用户输入一个年份和一个月份，
 * 判断（要求使用嵌套的if…else和switch分别判断一次）该年该月有多少天。
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月2日上午10:15:30
 */
public class LoopTest09 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		System.out.println("请输入月份：");
		int month = scan.nextInt();
		boolean isLeap = true;
		if ((year%4==0&&year%100!=0)||year%400==0) {
			isLeap = true;
			System.out.println(year + "年是闰年！！！");
		}else {
			isLeap = false;
			System.out.println(year + "年不是闰年！！！");
		}
		int day = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 2:
			if (isLeap) {
				day = 29;
			}else {
				day = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;

		default:
			System.out.println("请输入正确的月份！！");
			break;
		}
		System.out.println(year+"年"+month+"月有"+day+"天");
	}

}
