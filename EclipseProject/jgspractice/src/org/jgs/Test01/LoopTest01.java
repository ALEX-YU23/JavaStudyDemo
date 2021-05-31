package org.jgs.Test01;

import java.util.Scanner;

/**
 * @Description ：1.从键盘输入某个十进制整数，转换成对应的二进制并输出
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月2日上午8:34:27
 */
public class LoopTest01 {

	public static void main(String[] args) {
		//  扫描输入
		
		Scanner scanner = new Scanner(System.in);

		// 从键盘输入某个十进制整数
		System.out.println("请输入一个十进制整数：");
		int num = scanner.nextInt();
		// 初始化二进制
		String mod = "";
		// 除二取余法
		while (num!=0) {
			mod = num % 2 +mod;
			num /= 2;
		}

		// 补零 总共32位
		int modlen = mod.length();
		for (int i = 0; i < 16; i++) {
			if (i>=modlen) {
				mod = "0" + mod;
			}
			if ((i+1)%4==0) {
				mod = " " + mod;
			}
		}
		
		
		
		
		
		System.out.println(mod);
		
		
		
		scanner.close();
	}

}
