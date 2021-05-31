package org.jgs.Test01;

/**
 * @Description : 3.用while循环或其他循环输出1-1000之间能被5整除的数，且每行输出5个
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月2日上午9:20:50
 */
public class LoopTest03v2 {

	public static void main(String[] args) {
		
		int i = 1;
		while (i<=1000) {
			if (i%5==0) {
				System.out.print(i+"\t");
			}
			if (i%25==0) {  
				System.out.println();
			}
			i++;
		}

	}

}
