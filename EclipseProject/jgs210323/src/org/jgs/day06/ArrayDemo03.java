package org.jgs.day06;

import java.util.Scanner;

/*
 * 录入5个学生的成绩 并计算总成绩和平均分
 */
public class ArrayDemo03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("请输入第一个学生的成绩");
//		double score1 = scanner.nextDouble();
//		System.out.println("请输入第二个学生的成绩");
//		double score2 = scanner.nextDouble();
//		System.out.println("请输入第三个学生的成绩");
//		double score3 = scanner.nextDouble();
		
		//定义一个数组 存储学生的成绩
		double[] scores = new double[5];
		for (int i = 1; i < 6; i++) {
			System.out.println("请输入第"+i+"个学生的成绩");
			scores[i-1] = scanner.nextDouble();
		}
		
		//计算总成绩
		double sum = 0;
		//遍历数组   .length
		
//		for (int i = 0; i < scores.length; i++) {
//			sum+=scores[i];
//		}
		
//		int index =0;
//		while (index<scores.length) {
//			sum+=scores[index];
//			index++;
//		}
		
//		do {
//			sum+=scores[index];
//			index++;
//		} while (index<scores.length);
			/*
			 * 增强for循环
			 * for(数据类型 变量:数组){
			 * 
			 * }
			 * 
			 * 普通for循环  VS  增强for循环
			 * 1.增强for循环 获取每一个值 更加的便利 效率更高
			 * 2.增强for循环 无法操作数组的下标
			 * 3.在遍历的同时  无法改变元素的值
			 * */
			for (double d : scores) {
				sum+=d;
			}
		
		
		//计算平均成绩
		
		double avg = sum/scores.length;
		
		//打印输出
		
		System.out.println("总成绩："+sum);
		System.out.println("平均成绩："+avg);
		
		
		
		
		
		
		
		

	}

}
