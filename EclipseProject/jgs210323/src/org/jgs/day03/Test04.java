package org.jgs.day03;

import java.util.Scanner;

/*
 * 当气温高于26℃时，需要开启制冷空调；气温低于10℃则开启制热空调；
 * 其余情况只需要开启送风模式即可。编制自动温控程序，
 * 控制操作用输出相应的提示字符串来模拟，比如开启制冷
 */
public class Test04 {
	
	public static void main(String[] args) {
		
		//创建扫描器
		Scanner scanner = new Scanner(System.in);
		//接收用户的输入
		System.out.println("请输入温度");
		double tp = scanner.nextDouble();
		//温度的判定
		if (tp>26) {
			System.out.println("开启制冷");
		}else if(tp<10){
			System.out.println("开启制热");
		}else {
			System.out.println("开启送风");
		}
		
		
	}
}
