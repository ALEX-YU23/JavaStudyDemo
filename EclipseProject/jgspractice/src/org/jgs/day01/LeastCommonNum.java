package org.jgs.day01;

import java.util.Scanner;

/**
 * @author AlexYU
 * @version 1.0
 * 
 * 
 * 
 * 输入两个正整数 m 和 n ,求其最大公约数和最小公倍数
 * 
 * 
 * */


public class LeastCommonNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//定义从键盘接收两个数
		int m = scan.nextInt(),n = scan.nextInt(),big,small;
		//定义最大公约数和最小公倍数
		int lCD,lCM;
		
		//分出两数中大数和小数
		big = (m>n)?m:n;
		small = (m<n)?m:n;
		
		//辗转相除法
		//跳出循环时big中就是最大公约数
		while(true) {
			lCD=big%small;
			big = small;
			small = lCD;
			
			if(small==0) {
				break;
			}	
		}
		lCD = big;
		
		//最小公倍数=两数乘积/最大公约数
		lCM = (n*m)/lCD;
		
		
		System.out.println("最大公约数是："+lCD);
		System.out.println("最小公倍数是："+lCM);
		
		
		
		
		

	}

}
