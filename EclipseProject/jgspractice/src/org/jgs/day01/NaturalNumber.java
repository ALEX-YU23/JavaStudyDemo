package org.jgs.day01;
/**
 * 
 * @author AlexYU
 * 
 * @version 1.0
 * 
 * 打印自然数的个数
 * 1）打印1-100之间6的倍数的个数
 * 2）求出1~100之间，既是3又是7的倍数的自然数出现的个数
 * 
 * */
public class NaturalNumber {

	public static void main(String[] args) {
		
		int sixCount = 0,mixCount = 0;
		
		for (int i = 0; i < 100; i++) {
			if (i%6==0) {
				sixCount++;
			} 
			if (i%3==0||i%7==0) {
				mixCount++;
			}
		}
		System.out.println("打印1-100之间6的倍数的个数:"+sixCount);
		System.out.println("1~100之间，既是3又是7的倍数的自然数出现的个数:"+mixCount);
		
		
		
		
		
		
		

	}

}
