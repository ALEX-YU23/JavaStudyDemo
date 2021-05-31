package org.jgs.Test01;

/**
 * @Description : 3.用while循环或其他循环输出1-1000之间能被5整除的数，且每行输出5个
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月2日上午9:20:50
 */
public class LoopTest03 {

	public static void main(String[] args) {
		
		int i = 1,count=0;
		while (i<=1000) {
			if (i%5==0) {
				count++;
				System.out.print(i+"\t");
			}
			if (count==5) {
				System.out.println();
				count = 0;
			}
			i++;
		}

	}

}
