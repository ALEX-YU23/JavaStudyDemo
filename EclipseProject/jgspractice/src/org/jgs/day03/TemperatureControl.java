package org.jgs.day03;

import java.util.Scanner;

/**
 * @Description :当气温高于26℃时，需要开启制冷空调；气温低于10℃则开启制热空调；
 * 				其余情况只需要开启送风模式即可。编制自动温控程序，
 * 				控制操作用输出相应的提示字符串来模拟，比如开启制冷“
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version 1.0
 * @date 2021年3月30日下午8:17:49
 */
public class TemperatureControl {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入温度：");
		double temp = scan.nextDouble();
		
		if (temp>26) {
			System.out.println("开启制冷");
		} else if(temp<10) {
			System.out.println("开启制热");
		}else {
			System.out.println("开启送风模式");
		}
	}

}
