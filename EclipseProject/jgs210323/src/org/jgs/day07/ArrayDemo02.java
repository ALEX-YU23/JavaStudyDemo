package org.jgs.day07;

import java.util.Arrays;
/*
 * 函数式编程 
 * 简化java代码的写法
 */
public class ArrayDemo02 {

	public static void main(String[] args) {
		
		//静态初始化
		int[] ages = {20,15,13,28};
		
//		for (int age  : ages) {
//			System.out.println(age);
//		}
		
		//Arrays工具类  .stream()  箭头函数
//		Arrays.stream(ages).forEach(x ->System.out.println(x));
//		Arrays.stream(ages).forEach(x ->
//		{
//			x+=5;
//			System.out.println(x);
//		});
//		
		//过滤不符合要求的数值
		Arrays.stream(ages).filter(x->x>18).forEach(x->System.out.println(x));
		//统计符合要求数据的个数
		long count = Arrays.stream(ages).filter(x->x>18).count();
		System.out.println(count);

	}

}
