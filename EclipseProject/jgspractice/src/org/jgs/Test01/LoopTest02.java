package org.jgs.Test01;

/**
 * @Description 2.给20块钱买可乐，每瓶可乐3块钱，喝完之后退瓶子可以换回1块钱，
 *                问最多可以喝到多少瓶可乐
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月2日上午8:57:26
 */
public class LoopTest02 {

	public static void main(String[] args) {
		
		
		// 定义钱数和价钱，并且初始化价钱
		int money,price = 3;
		// 定义并初始化拿到可乐瓶数的总数和用来换的可乐数
		int count = 0,rcount = 0;
		// 总金20，每次减3，当总金小于等于0时停止循环
		for (money = 20; money > 0; money-=price) {
			count ++;
			rcount ++;
			// 存够三个瓶子换一瓶可乐
			if (rcount==3) {
				count++;
				rcount = 0;
			}
		}
		// 输出可乐总数
		System.out.println("最多可以喝到"+count+"瓶可乐");

	}

}
