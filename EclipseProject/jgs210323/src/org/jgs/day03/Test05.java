package org.jgs.day03;

import java.util.Scanner;

/**
 * 根据《省电网销售电价表》，居民生活用电按3个梯度收费：月用电量150千瓦时及以下部分，
 * 每千瓦时0.4463元，151—400千瓦时部分为0.4663元，401千瓦时以上部分为0.5663元，
 * 请编写程序，当输入用户的用电量时，计算出所需付的费用
 * @author mosin
 * @DATE 2021年3月31日
 */
public class Test05 {

	public static void main(String[] args) {

		//创建扫描器
		Scanner scanner = new Scanner(System.in);
		//接收用户的输入
		System.out.println("请输入度数");
		double num = scanner.nextDouble();
		
		double totalPrice;
		if (num<=150) {
			totalPrice = num*0.4463;
		}else if (num<=400) {
			totalPrice = 150*0.4463+(num-150)*0.4663;
		}else{
			totalPrice = 150*0.4463+250*0.4663+(num-400)*0.5663;
		}
		System.out.println(totalPrice);
		

	}

}
