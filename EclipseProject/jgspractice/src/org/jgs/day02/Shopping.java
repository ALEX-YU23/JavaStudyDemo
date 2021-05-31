package org.jgs.day02;

import java.util.Scanner;

/**
 * @Description
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年3月30日下午3:48:49
 */
public class Shopping {

	public static void main(String[] args) {
		//创建扫描器
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入商品单价:");
		double price = scan.nextDouble();
		System.out.println("请输入商品质量:");
		double quality = scan.nextDouble();
		System.out.println("请支付:");
		double paymoney = scan.nextDouble();
		
		double usemoney = quality*price;
		System.out.println("原价: "+usemoney);
		//超过50打8折
		if (usemoney>50) {
			usemoney*=0.8;
			System.out.println("八折: "+usemoney);
		}
		
		
		if (paymoney>usemoney) {
			System.out.println("花费: " + usemoney + "\t找零: " + (paymoney-usemoney));
		}else {
			System.out.println("钱不够");
		}
		
		
		
		
		
		//关闭扫描器
		scan.close();
	}

}
