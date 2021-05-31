package org.jgs.day05;

import java.util.Iterator;

/*
 * 用while循环或其他循环输出1-1000之间能被5整除的数，且每行输出5个
 */
public class Test03 {

	public static void main(String[] args) {
		
		for (int i = 1; i <1001; i++) {
			
			if(i%5==0) {
				System.out.print(i+"\t");
			}
			if (i%25==0) {
				System.out.println();
			}
			
		}
		

	}

}
