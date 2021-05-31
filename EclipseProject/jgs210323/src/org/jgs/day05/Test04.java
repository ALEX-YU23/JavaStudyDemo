package org.jgs.day05;

import java.util.Scanner;

/*
 * 从键盘输入三角形的三边长
(1）判断这三边是否能够构成三角形
(2）如果是等腰三角形，请说明是等腰三角形
(3）如果是等边三角形，请说明是等边三角形
 */
public class Test04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个边长");
		int a = scanner.nextInt();
		System.out.println("请输入第二个边长");
		int b = scanner.nextInt();
		System.out.println("请输入第三个边长");
		int c = scanner.nextInt();
		
		//判断是否能够组成三角形
		if ((a+b>c)&&(a+c>b)&&(b+c>a)) {

				//是否是等边三角形
			if ((a==b)&&(a==c)&&(c==b)) {
				System.out.println("该三角形是一个等边三角形");
			}else if ((a==b)||(a==c)||(c==b)) {
				//判定是否是等腰三角形
				System.out.println("该三角形是一个等腰三角形");
			}else {
				System.out.println("该三角形是一个普通三角形");
			}
		}else {
			System.out.println("三边不能构成三角形");
		}
		
		
		

	}

}
