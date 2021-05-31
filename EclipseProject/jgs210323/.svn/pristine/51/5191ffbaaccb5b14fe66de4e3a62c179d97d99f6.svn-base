package org.jgs.day07;

import java.util.Scanner;

/*
 * 存储三个班级学生的成绩 一个班级三个人 输出每个班级的总成绩
 */
public class ArrayDemo04 {

	public static void main(String[] args) {
		
		int[][] scores = new int[3][3];
		//创建扫描器
		Scanner scanner = new Scanner(System.in);
		//控制班级
		for (int i = 0; i < scores.length; i++) {
			System.out.println("******请输入第"+(i+1)+"个班级学生的成绩*******");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.println("请输入第"+(j+1)+"个学生的成绩");
				scores[i][j] =scanner.nextInt(); 
			}
		}
		
		int sum = 0;
		//遍历数组  计算每个班级的总成绩
		for (int i = 0; i < scores.length; i++) {
			for (int s : scores[i]) {
				sum+=s ;
			}
			System.out.println("第"+(i+1)+"个班级学生的总成绩是："+sum);
			System.out.println("第"+(i+1)+"个班级学生的平均成绩是："+sum/scores[i].length);
			sum = 0;
		}
		
		
		
		
		
		
	}
}
