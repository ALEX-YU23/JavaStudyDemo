package org.jgs.day05;
/**
 * 编写一个程序，求出200到300之间的数，
 * 且满足条件：它们三个数字之积为42，三个数字之和为 12
 * @author mosin
 * @DATE 2021年4月6日
 */
public class Test08 {

	public static void main(String[] args) {
		
		
		for (int i = 200 ;i<=300; i++) {
			
			//分别取出三位数字的各位数字
			
			int gw = i%10;
			int sw = (i/10)%10;
			int bw = i/100;
			
			if (((gw+sw+bw)==12)&&((gw*sw*bw)==42)) {
				System.out.println(i);
			}
	
		}
		

	}

}
