package org.jgs.day04;

import java.util.Scanner;

/**
 * @Description : 10.输入五个学生的成绩，计算总成绩，以及平均成绩
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年3月31日下午6:43:18
 */
public class Test11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0,avg=0;
		
		int i=1;
		
		while (i<=5) {
			System.out.println("请输入:");
			int a = scan.nextInt();
			count+=a;
			i++;
		}
		System.out.println("总成绩:"+count);
		System.out.println("平均成绩:"+count/5);
	}

}
