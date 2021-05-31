package org.jgs.day04;

/**
 * @Description : 8.分别计算1到100的偶数和奇数和
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年3月31日下午6:37:59
 */
public class Test09 {

	public static void main(String[] args) {
		int odd = 0,even = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		System.out.println("奇数和:"+odd);
		System.out.println("偶数和:"+even);

	}

}
