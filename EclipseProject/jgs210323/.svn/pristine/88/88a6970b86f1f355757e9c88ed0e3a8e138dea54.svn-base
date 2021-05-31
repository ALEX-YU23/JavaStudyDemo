package org.jgs.day03;

import java.util.Scanner;

/*
 * 1.出租车，起步价(2公里以内)为7元，
 * 超过2公里的按照每公里3元计算。要求根据路程计算费用
 */
public class Test01 {

	public static void main(String[] args) {
		
		//创建扫描器
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入里程:");
		double num = scan.nextDouble();
		scan.close();
		//计算 
		if(num<=2) {
			System.out.println("车费7元");
		}else {
			double money = 7+(num-2)*3;
			System.out.println("车费："+money+"元");
		}

	}

}
