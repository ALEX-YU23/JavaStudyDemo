package org.jgs.day05;

import java.util.Scanner;

/**
 * 给定任意两个正整数，求一下他们的最大公约数和最小公倍数
 * @author mosin
 * @DATE 2021年4月6日
 */
public class Test06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个数字");
		int num2 = scanner.nextInt();
		
		int temp = 0;
		//最大公约数
		if (num1>num2) {
			temp = num2;
		}else {
			temp = num1;
		}
		
		int max = 0;
		for (int i = temp; i>0 ; i--) {
			if ((num1%i==0)&&(num2%i==0)) {
				System.out.println("最大公约数是："+i);
				max = i;
				break;
			}
		}
		
		//计算最小公倍数
		 int min = (num1*num2)/max;
		 System.out.println("最小公倍数是："+min);

	}

}
