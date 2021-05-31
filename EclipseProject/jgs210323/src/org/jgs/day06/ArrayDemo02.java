package org.jgs.day06;
/*
 * 数组的简化定义
 */
public class ArrayDemo02 {

	public static void main(String[] args) {
	

		//第一种方式  声明数组的同时开辟内存空间
		int[]  scor = new int[5];
		//赋值
		scor[0] = 10;
		scor[1] = 20;
		scor[2] = 30;
		//第二种方式
		int[]  scores = new int[]{1,2,3,4};
		//第三种方式
		int[]  scores2 ={1,2,3,4};
		
	}

}
