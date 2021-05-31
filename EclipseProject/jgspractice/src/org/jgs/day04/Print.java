package org.jgs.day04;

/**
 * @Description :
 * 				1.打印图形
 *				*
 *				**
 *				***
 *				****
 *				2.打印
 				   *
				  **
				 ***
				****
 * 
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年3月31日下午4:58:43
 */
public class Print {
	
	public static void main(String[] args) {
		// 1
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 金字塔
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (j>=(4-i)) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
		// 2 
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j<3-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
