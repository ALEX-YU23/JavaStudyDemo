package org.jgs.day01;
/*
 * 
 *  打印如下的三角形
 * 	
 *  *
 *	***
 *	*****
 *	*******
 *	*****
 *	***
 *	*
 * 
 * 
 * 
 * */


public class PrtTriangle {

	public static void main(String[] args) {
		for (int i = 1; i <= 14; i+=2) {
			if (i<=7) {
				
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 14-i; j > 0; j--) {
					System.out.print("*");
				}

			}
			System.out.println();
		}

	}

}
