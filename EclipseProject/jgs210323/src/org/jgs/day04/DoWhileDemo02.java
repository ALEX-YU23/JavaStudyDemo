package org.jgs.day04;
/*
 * 求 1-100之间数字的和
 */
public class DoWhileDemo02 {

	public static void main(String[] args) {
		
		int sum = 0;
//		for (int i = 1; i < 101; i++) {
//			sum+=i;
//		}
		
		int i = 1;
//		while(i<101) {
//			sum+=i;
//			i++;
//		}
		
		do {
			sum+=i;
			i++;
		}while(i<101);
		
		System.out.println(sum);

	}

}
