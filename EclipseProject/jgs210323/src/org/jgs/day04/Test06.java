package org.jgs.day04;
/*
 * 输出20以内的偶数和奇数的个数
 */
public class Test06 {

	public static void main(String[] args) {
		
		int count1 = 0;
		int count2 = 0;
		//生成20以内的数字
		for (int i = 1; i < 21; i++) {
			
			//判断数字的奇偶性
			if (i%2==0) {
				count2++; 
			}else {
				count1++; 
			}
			
		}
		System.out.println("偶数的个数:"+count2);
		System.out.println("奇数的个数:"+count1);
		
		
	}

}
