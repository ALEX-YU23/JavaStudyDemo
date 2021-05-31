package org.jgs.Test01;

import java.util.Scanner;

/**
 * @Description : 4.从键盘输入三角形的三边长
				(1）判断这三边是否能够构成三角形
				(2）如果是等腰三角形，请说明是等腰三角形
				(3）如果是等边三角形，请说明是等边三角形
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月2日上午9:24:49
 */
public class LoopTest04 {

	public static void main(String[] args) {
		 // 扫描输入
		 Scanner scan = new Scanner(System.in);
		 // 从键盘接收三角形的三边长
		 System.out.println("请输入三角形第一条边长：");
		 double line1 = scan.nextDouble();
		 System.out.println("请输入三角形第二条边长：");
		 double line2 = scan.nextDouble();
		 System.out.println("请输入三角形第三条边长：");
		 double line3 = scan.nextDouble();
		 // 找出三条边中最长的和最短的
		 double max = (line1>line2)?(line1>line3)?line1:line3:(line2>line3)?line2:line3;
		 double min = (line1<line2)?(line1<line3)?line1:line3:(line2<line3)?line2:line3;
		 // 计算上二者的差
		 double dif = max - min;
		 // 两边之差小于第三边即为三角形
		 if (dif<line1&&dif<line2&&dif<line3) {
			 System.out.println("这三条边能组成三角形");
			 // 最长边等于最短边即三边相等
			 if (max==min) {
				System.out.println("该三角形是等边三角形");
			} else if(line1==line2||line2==line3||line3==line1){
				System.out.println("该三角形是等腰三角形");
			} else {

				System.out.println("该三角形是普通三角形");
			}
		}
		 
		 
		 // 关闭扫描
		 scan.close();
	}

}
