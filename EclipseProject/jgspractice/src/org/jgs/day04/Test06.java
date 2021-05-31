package org.jgs.day04;

/**
 * @Description : 
 * 5.输出100以内的素数，素数是只能被1和自身整除的数
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年3月31日下午6:22:44
 */
public class Test06 {

	public static void main(String[] args) {
		for (int i = 2; i < 100; i++) {
			int count = 0;
			for (int j = 1; j <= Math.sqrt(i); j++) {
				if (i%j==0) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		

	}

}
