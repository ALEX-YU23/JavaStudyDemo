package org.jgs.day03;

import java.util.Scanner;

/**
 * 超市购物小程序
 * @author mosin
 * @DATE 2021年3月30日
 * @version 1.0
 */
public class Shopping {

	public static void main(String[] args) {
		
		//创建扫描器
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入商品的单价");
		double price = scan.nextDouble();
		System.out.println("请输入商品的数量");
		double num = scan.nextDouble();
		System.out.println("请输入金额");
		double money = scan.nextDouble();
		
		//关闭scan 扫描器
		scan.close();
		
		//计算商品的总金额
		double totalPrice = price*num;
		//找零
		double change = money-totalPrice;
		
		//输出计算结果
		System.out.println("商品的总价格是："+totalPrice+"找零："+change);
		

	}

}
