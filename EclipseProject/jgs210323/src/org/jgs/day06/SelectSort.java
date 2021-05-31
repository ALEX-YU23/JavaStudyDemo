package org.jgs.day06;
/*
 * 选择排序
 *  
 */
public class SelectSort {

	public static void main(String[] args) {
		int[]  num = {10,2,30,13,20,15};
		//外层循环控制比较的轮数
		for (int i = 0; i < num.length; i++) {
			//内层循环控制每轮比较的次数
			for (int j = i+1; j< num.length; j++) {
				
				if (num[i]>num[j]) {
					
					num[i] = num[i]+num[j];
					num[j] = num[i]-num[j];
					num[i] = num[i]-num[j];	
				}
			}
		}
		//遍历数组
		for (int i : num) {
			System.out.println(i);
		}
	}

}
