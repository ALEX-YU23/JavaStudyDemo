package org.jgs.Test01;

/**
 * @Description : 10.使用循环求式子2+22+222+2222+22222的和
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月2日上午10:15:30
 */
public class LoopTest10 {

	public static void main(String[] args) {
		int count = 0,total = 0;
		for (int i = 0; i < 5; i++) {
			count+=2*Math.pow(10, i);
			total+=count;
		}
		System.out.println(total);
	}

}
