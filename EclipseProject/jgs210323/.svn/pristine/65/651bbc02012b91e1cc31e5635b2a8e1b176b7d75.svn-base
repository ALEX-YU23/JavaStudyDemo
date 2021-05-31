package org.jgs.day06;
/**
 * 获取数组中的最大值和最小值
 * 
 * 思路：
 * 1.使用for循环
 * 2.数组排序
 * 		2.1冒泡排序
 * 		2.2选择排序
 * 		2.3插入排序
 * @author mosin
 * @DATE 2021年4月7日
 */
public class ArrayDemo04 {

	public static void main(String[] args) {
	
		int[]  num = {10,2,13,20,15};
		
		int max=num[0] ;
		int min=num[0];
		
		//遍历数组
		for (int i = 1; i < num.length; i++) {
			
			//判断最大值
			if (max<num[i]) {
				max = num[i];
			}
			
			//判断最小值
			if (min>num[i]) {
				min= num[i];
			}
			
		}
		//打印输出
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
		
	}

}
