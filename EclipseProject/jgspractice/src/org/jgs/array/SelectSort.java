package org.jgs.array;

import java.util.Arrays;

/**
 * @Description 选择排序
 * 选择排序
 * 选择排序（Select Sort） 是直观的排序，通过确定一个 Key 最大或最小值，
 * 再从带排序的的数中找出最大或最小的交换到对应位置。再选择次之。
 * 双重循环时间复杂度为 O(n^2)
 * 算法描述：
 * 在一个长度为 N 的无序数组中，第一次遍历 n-1 个数找到最小的和第一个数交换。
 * 第二次从下一个数开始遍历 n-2 个数，找到最小的数和第二个数交换。
 * 重复以上操作直到第 n-1 次遍历最小的数和第 n-1 个数交换，排序完成。
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月7日上午9:49:59
 */
public class SelectSort {

	public static void main(String[] args) {
		
		int [] num = new int[] {116,16,26,10,2,13,20,89};
		System.out.println(Arrays.toString(num));
		
		for (int i = 0; i < num.length; i++) {
			int temp = num[i];
			int k = 0;
			//  从未排序列中选择最小数
			for (int j = i+1; j < num.length; j++) {
				if (temp>num[j]) {
					temp=num[j];
					k=j;
				}
			}
			//  当temp=num[k]时说明最小数在后面序列中
			//  若不满足此条件说明最小数就是num[i]
			if (temp==num[k]) {
				num[k] = num[i];
				num[i] = temp;
			}
			System.out.println(Arrays.toString(num));
		
		}

	}

}
