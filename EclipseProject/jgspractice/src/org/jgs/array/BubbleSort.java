package org.jgs.array;

/**
 * @Description 冒泡排序
 * 1.相邻元素进行比较
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月7日上午9:36:33
 */
public class BubbleSort {
	/**
	 * 
	 * @Description  冒泡排序（从小到大）
	 * 每次循环，遍历数组找出最大的数依次放在数组末尾
	 * @author AlexYU 
	 * @date 2021年4月7日上午10:03:25
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [] num = new int[] {116,16,26,10,2,13,20,89};
		
		int temp;
		//  外层循环，当只剩一个数没有冒泡时，会发现这个数就是最小（最大值）
		//  所以外层循环只用执行数组长度-1就好
		for (int i = 0; i < num.length-1; i++) {
			//  排好序的数组长度随i变
			//  所以内层每次冒泡长度都在减小，为num.length - i
			for (int j = 1; j < num.length - i; j++) {
				
				temp = num[j-1];
				if (temp>num[j]) {
					num[j-1] = num[j];
					num[j] = temp;
				}
			}
		}
			
		for (int i : num) {
			System.out.print(i+"\t");
		}
		
	}

}
