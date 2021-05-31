package org.jgs.Test01;

import java.util.Scanner;

/**
 * @Description ： 6.给定任意两个正整数，求一下他们的最大公约数和最小公倍数
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月2日上午9:59:02
 */
public class LoopTest06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int num1 = scan.nextInt();
		System.out.println("请输入第二个数：");
		int num2 = scan.nextInt();
		int max = (num1>num2)?num1:num2;
		int min = (num1<num2)?num1:num2;
		int mod;
		// 辗转相除法
		do {
			mod=max%min;
			max=min;
			min=mod;
			
		} while (mod==0);
		
		System.out.println("最大公约数:"+ min);
		// 最小公倍数 = 两数之积/最大公约数
		System.out.println("最小公倍数:"+ (num1*num2)/min);
		scan.close();
	}

}
