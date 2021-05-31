package org.jgs.day06;

import java.util.Arrays;

/*
 *  1.toString 将数组转换成字符串打印

	2.sort数组的排序，基本类型使用快排方法 ，引用类型使用的并归排序

	3.binarySearch（目标数组，元素）查找指定元素在指定数组的位置，找不到返回负数
	
	4.copyOf(原数组，新长度) 如果新的长度比原数组小，则会舍去后面的元素，如果大则自动补全默认值

	5.fill(目标数组,指定值)快速的填充数组

	6.equals(array1, array2) 比较数组是否相等
 */
public class ArrayDemo06 {

	public static void main(String[] args) {
		
		int[]  num = {10,2,30,13,20,15};
		int[]  num2 = {10,2,30,13,20,15};
//		int[] num2 = num;
		//将数组转换成字符串打印
//		System.out.println(Arrays.toString(num));
		//排序
	//Arrays.sort(num);
		System.out.println(Arrays.toString(num));
//		System.out.println(Arrays.toString(num2));
		//查找指定元素在指定数组的位置
		int index = Arrays.binarySearch(num, 40);
		System.out.println(index);
		//数组复制  实现数组的扩容
		int[] arr = Arrays.copyOf(num, 7);
		System.out.println(Arrays.toString(arr));
		//快速填充数组
//		sArrays.fill(num, 0);
		System.out.println(Arrays.toString(num));
		//比较数组是否相等
		System.out.println(Arrays.equals(num, num2));
		System.out.println(num==num2);
		
	}

}
