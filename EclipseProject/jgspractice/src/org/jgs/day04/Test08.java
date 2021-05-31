package org.jgs.day04;

/**
 * @Description : 7.输出1000以内的水仙花数，
例子：如果一个三位数 abc=a*a*a+b*b*b+c*c*c 则该数字是一个水仙花数
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年3月31日下午6:35:12
 */
public class Test08 {

	public static void main(String[] args) {

		for (int i = 100; i < 1000; i++) {
			int a = i/100;
			int b = (i-a*100)/10;
			int c = i%10;
			if (i==a*a*a+b*b*b+c*c*c) {
				System.out.println(i);
			}
		}

	}

}
