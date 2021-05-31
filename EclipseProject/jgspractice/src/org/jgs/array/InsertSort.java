package org.jgs.array;

import java.util.Arrays;

/**
 * 插入排序
 * 1.把当前的数组看成一个有序序列和一个无序序列
 * 2.从无序序列中依次取值，插入到有序的序列中
 * 
 * @author mosin
 * @DATE 2021年4月7日
 */
public class InsertSort {

	public static void main(String[] args) {
		//  定义一个数组
		int[]  num = {10,2,30,13,20,15};
		//  外层看做无序数组，从无序数组中取值
		for (int i = 1; i < num.length; i++) {
			//  定义临时变量接收num[i]的值
			int temp = num[i];
			//  定义并初始化有序数组循环下标（从前往后）
			int index = i-1;
			//  遍历有序数组，当num[index]不大于temp时停止循环
			//  注意这里的temp不能用num[i]代替
			//  因为下面循环时有序数组往后移，num[i]的值会等于num[i-1]
			while (index>=0&&num[index]>temp) {
				//  满足条件时有序数组依次往后移
				num[index+1] = num[index];
				index--;
			}
			//  将temp放在空出来的位置上
			num[index+1] = temp;
			System.out.println(Arrays.toString(num));
		}
		for (int i : num) {
			System.out.println(i);
		}
	}

}
