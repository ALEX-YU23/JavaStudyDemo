package org.jgs.day01;

import java.util.Scanner;

public class WhatDay {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("请输入年份:");
		int year = scan.nextInt();
		System.out.println();

		System.out.print("请输入月份(1-12):");
		int month = scan.nextInt();
		System.out.println();

		System.out.print("请输入日期:");
		int day = scan.nextInt();
		System.out.println();

		System.out.println(year + "\\" + month + "\\" + day);

		boolean isLeapYear = false;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			isLeapYear = true;
		}

//		int day = 21;
		int dayth = 0;
		for (int i = 1; i < month; i++) {
			switch (i) {
			case 12:
				dayth += 31;
				break;
			case 11:
				dayth += 30;
				break;
			case 10:
				dayth += 31;
				break;
			case 9:
				dayth += 30;
				break;
			case 8:
				dayth += 31;
				break;
			case 7:
				dayth += 31;
				break;
			case 6:
				dayth += 30;
				break;
			case 5:
				dayth += 31;
				break;
			case 4:
				dayth += 30;
				break;
			case 3:
				dayth += 31;
				break;
			case 2:
				dayth += (isLeapYear)?29:28;
				break;
			case 1:
				dayth += 31;
				break;
			default:
				System.out.println("请输入正确的月份");
			}
		}
		dayth += day;
		System.out.println("这是"+year+"年的第"+dayth+"天");
	}

}
