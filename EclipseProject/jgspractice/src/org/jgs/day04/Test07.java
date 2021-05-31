package org.jgs.day04;

/**
 * @Description : 6.输出20以内偶数和奇数的个数
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年3月31日下午6:30:53
 */
public class Test07 {

	public static void main(String[] args) {
		int odd = 0,even = 0;
		for (int i = 1; i < 20; i++) {
			if (i%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("奇数:"+odd+"个");
		System.out.println("偶数:"+even+"个");
	}

}
