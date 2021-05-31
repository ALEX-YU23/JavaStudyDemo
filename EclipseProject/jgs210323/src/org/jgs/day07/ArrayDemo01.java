package org.jgs.day07;
/*
 * 数组的回顾
 * 
 * 数组的使用步骤
 * 1.声明数组
 * 2.分配内存空间
 * 3.赋值
 * 4.使用
 */
public class ArrayDemo01 {

	public static void main(String[] args) {
	
		//存储3个int型数据  声明数组    数据类型[]  数组名
		int[] ages;
		//分配内存空间  动态初始化
		ages = new int[3];
		//赋值  
		ages[0] = 20;
		ages[1] = 21;
		ages[2] = 22;
		
		//获取数组中的每一个元素  数组名[下标]
//		System.out.println(ages[0]);
//		System.out.println(ages[1]);
//		System.out.println(ages[2]);
		
		//使用循环遍历数组
//		for (int i = 0; i < ages.length; i++) {
//			System.out.println(ages[i]);
//		}
		
		//增强for循环
		for (int i : ages) {
			System.out.println(i);
		}
		
		
		

	}

}
