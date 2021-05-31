package org.jgs.day05;
/*
 * 使用循环求式子2+22+222+2222+22222的和
 */
public class Test10 {

	public static void main(String[] args) {
		int sum = 0;
		int num=0;
		for (int i = 1; i <=5; i++) {
			num = num*10+2;
			System.out.println(num);
			sum+=num;
		}
		System.out.println(sum);

	}

}
