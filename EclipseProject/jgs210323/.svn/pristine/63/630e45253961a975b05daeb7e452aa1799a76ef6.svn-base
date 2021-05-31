package org.jgs.day06;
/*
 * 冒泡排序
 * 1.相邻元素进行比较
 */
public class BubbleSort {

	public static void main(String[] args) {
		
		int[]  num = {20,10,2,13,15};
		//外层循环控制比较的轮数
		for (int i = 0; i < num.length-1; i++) {
			for (int j = 0; j < num.length-1-i; j++) {
				if (num[j]>num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		//遍历数组
		for (int i : num) {
			System.out.println(i);
		}
		
		
	}

}
