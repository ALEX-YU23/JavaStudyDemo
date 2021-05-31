package org.jgs.array;

import java.util.Scanner;

/**
 * @Description 录入5个学生的成绩并计算总成绩和平均分
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月7日上午8:49:12
 */
public class ArrayDemo {
	public static void main(String args[]) {

		int sum = 0;
		for (int i = 20; i > 0; i--) {
			if (i % 3 != 0) {
				continue;
			}
			System.out.println(i);
			sum+=i;
		}
	System.out.println(sum);
	}
}