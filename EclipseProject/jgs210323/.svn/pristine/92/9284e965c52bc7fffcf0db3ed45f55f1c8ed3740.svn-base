package org.jgs.day05;
/*
 * 给20块钱买可乐，每瓶可乐3块钱，喝完之后退瓶子可以换回1块钱，
 * 问最多可以喝到多少瓶可乐
 */
public class Test02 {

	public static void main(String[] args) {
		
		int money = 20;
		int price = 3;
		
		//定义总瓶数
		int sum = 0;
		while (money>=price) {
			
			int bottle = money/price;
			//计算买过以后剩余的钱数
			int balance = money%price;
			money = balance+bottle;
			//计算总瓶数
			sum+=bottle;
		}
		System.out.println(sum);
	}

}
