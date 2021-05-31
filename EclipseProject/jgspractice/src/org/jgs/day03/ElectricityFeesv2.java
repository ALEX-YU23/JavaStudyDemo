package org.jgs.day03;

import java.util.Scanner;

/**
 * @Description:根据《省电网销售电价表》，居民生活用电按3个梯度收费：
 * 				月用电量150千瓦时及以下部分，每千瓦时0.4463元，
 * 				151-400千瓦时部分为0.4663元，401千瓦时以上部分为0.5663元，
 * 				请编写程序，当输入用户的用电量时，计算出所需付的费用
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年3月30日下午8:23:21
 */
public class ElectricityFeesv2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入用电量：");
		double econ = scan.nextDouble();
		double price=0,singlePrice=0;
		
		
		
		if (econ>400) {
			singlePrice = 0.5663;
			econ-=400;
			price += econ*singlePrice;
			econ = 400;
		}
		if (econ>150&&econ<=400) {
			singlePrice = 0.4663;
			econ-=150;
			price += econ*singlePrice;
			econ = 150;
		}
		
		if (econ<=150) {
			singlePrice = 0.4463;
			price += singlePrice*econ;
		}
		System.out.println(price);
	}

}
