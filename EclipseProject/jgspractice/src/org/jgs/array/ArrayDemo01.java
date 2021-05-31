package org.jgs.array;

/**
 * @Description 获取数组中的最大最小值
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月7日上午9:14:52
 */
public class ArrayDemo01 {

	public static void main(String[] args) {
		
		int [] num = {10,2,13,20,89};
		
		int max=num[0],min=num[0];
		
		for (int i = 1; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
	}

}
