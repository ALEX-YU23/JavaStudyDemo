package org.jgs.Test01;

/**
 * @Description : 编写一个程序，求出200到300之间的数，
 * 且满足条件：它们三个数字之积为42，三个数字之和为 12
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月2日上午10:15:30
 */
public class LoopTest08 {

	public static void main(String[] args) {
		
		for (int i = 200; i < 300; i++) {
			int a = 2;
			int b = (i-200)/10;
			int c = i%10;
			if((a+b+c==12)&&(a*b*c==42)) {
				System.out.println("满足条件的数："+i);
			}
		}

	}

}
