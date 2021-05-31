package org.jgs.day04;

import java.util.Scanner;

/*
 * 输入五个学生的成绩，计算总成绩，以及平均成绩
 */
public class Test09 {
	public static void main(String[] args) {
		
		//创建扫描器
		Scanner scan = new Scanner(System.in);
		//定义变量存储总成绩
		double sumScore = 0;
		//循环输入分数
		for (int i = 0; i < 5; i++) {
			//提示用户输入分数
			System.out.println("请输入成绩");
			double score = scan.nextDouble();
			sumScore+=score;
		}
		//打印输出总成绩
		System.out.println("总成绩："+sumScore);
		//打印输出平均成绩
		System.out.println("平均成绩："+sumScore/5);
		
		//关闭扫描器
		scan.close();
		
		
	}
}
