package org.jgs.Test01;

import java.util.Scanner;

import org.jgs.day01.ZodiacIssues;

/**
 * @Description : 7.天朝有一个乞丐姓洪，去天桥要钱
第一天要了1块钱
第二天要了2块钱
第三天要了4块钱
第四天要了8块钱
以此类推

问题： 洪乞丐干10天，总收入是多少？
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月2日上午10:15:30
 */
public class LoopTest07 {
	/**
	 * 定义一个求a的num次幂的函数
	 * 
	 * */ 
	public static double zpow(double a,int num) {
		// 任何数的0次幂都为1
		if (num == 0) {
			return 1;
		}
		double c = a;
		a = 1;
		for (int i = 0; i < num; i++) {
			a*=c;
		}
		return a;

	}
	public static void main(String[] args) {
		
		// 扫描输入
		Scanner scan = new Scanner(System.in);
		// 从键盘接收三角形的三边长
		System.out.println("洪乞丐干几天：");
		int day = scan.nextInt();
		
//		System.out.println(zpow(3, 3));
		double total = 0;
		
		for (int i = 0; i < day; i++) {
			total+=zpow(2, i);
		}
		System.out.println(total);
		
		scan.close();
	}

}
