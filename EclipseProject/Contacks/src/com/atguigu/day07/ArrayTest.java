package com.atguigu.day07;

import java.util.Arrays;

import org.junit.Test;

/**
 * 
 * @Description 冒泡排序
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月27日上午9:48:45
 */
public class ArrayTest {
	@Test //冒泡排序
	public  void Bubble() {
		int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	@Test  //反转数组
	public void Reverse() {
		int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
		
		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	@Test // 复制数组
	public void copyArray() {
		
		int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
		
		int[] brr = new int[arr.length];
		
		for (int i = 0; i < brr.length; i++) {
			brr[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(brr));
	}
	
	@Test // 使用线性查找，从上述数组中查找22是否存在。存在，返回所在位置的索引。不存在，输出提示信息。
	public void Search() {
		
		int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
		int value = 2;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==value) {
				value = i;
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(value);
		}else {
			System.out.println("不存在"+value);
		}
		
	}
	/**
	 * 5. 数组中常见的异常有哪些？请举例说明
	 * 
	 * ArrayIndexOutOfBoundsException: 数组下标越界
	 * 合理范围【0,arr.lenght-1】
	 * arr[-1]
	 * 
	 * NullPointerException: 空指针异常
	 * int [] arr --- null
	 * arr[0]
	 * 
	 */
	
	
	
}
