package org.jgs.day05;

import java.util.Scanner;

/*
 * 从键盘输入某个十进制整数，转换成对应的二进制并输出
 */
public class Test01 {

	public static void main(String[] args) {
		
		//提示用户输入十进制的数字
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个十进制的整数");
		int num = scanner.nextInt();
		String str = "";
		while (num!=0) {
			//num除2
			int temp = num/2;
			int mod = num%2;
			str = mod+str;
			num = temp;
		}
		
		//判定字符串的长度
		if (str.length()<=8) {
			String st =""; 
			for (int i = 1; i <=8-str.length(); i++) {
				st+=0;
			}
			System.out.println(st+str);
		}else {
			System.out.println(str);
		}
	}

}
