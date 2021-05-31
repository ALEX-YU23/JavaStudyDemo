package org.jgs.day04;

import java.util.Iterator;

/**
 * @Description : 9.打印9*9乘法表
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年3月31日下午6:40:05
 */
public class Test10 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}

	}

}
