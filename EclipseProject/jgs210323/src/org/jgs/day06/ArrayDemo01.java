package org.jgs.day06;

public class ArrayDemo01 {

	public static void main(String[] args) {
		
		//保存一个班级20位同学的成绩
//		double score = 80;
//		double  score1 = 80;
//		double  score2 = 80;
		
		/*
		 * 
		 * 数组：
		 * 1.数组定义以后 存储的数据类型已经确定 存储的是相同数据类型的数据
		 * 2.数组在使用的过程中 存在数组下标越界的异常(错误)
		 * 3.一旦数组的内存空间确定了  那么存储的数据个数也确定了
		 * 4.数组开辟的内存空间是连续的
		 * 5.数组的赋值和访问数组中的每一个元素 可以通过下标完成 数组的下标是从0开始
		 * 
		 * 回顾：变量的使用
		 * 		1.定义一个变量  int num;  int num =12;
		 * 		2.赋初始值   num = 12;
		 * 		3.使用
		 * 数组的使用步骤
		 * 1.声明数组 多个数据的集合
		 * 		数据类型[]  数组名   
		 * double[]  scores 
		 * double  scores[]
		 * 2.开辟内存空间
		 *  new  数据类型[num]  num表示开辟内存空间的大小 而且该内存空间是连续的
		 * 3.赋值
		 * 	数组元素 是有顺序的 可以使用下标进行赋值
		 * 4.使用
		 * 使用下标获取每一个元素
		 */
		
		//声明
//		double[] scores;
//		char[]  ch;
//		String[] str;
		boolean[] b;
		//开辟内存空间
//		scores = new double[5];
//		ch = new char[3];
//		str = new String[3];
		b= new boolean[3];
		//赋初始值  下标  从0开始 数组名[下标]
//		scores[0] = 80;
//		scores[1] = 60;
//		scores[2] = 70;
//		scores[3] = 90;
//		scores[4] = 50;
		//java.lang.ArrayIndexOutOfBoundsException
		//scores[5] = 88;
		
		//使用 遍历数组   取出数组中的所有元素   scores[0]   scores.length 数组中元素的个数
		for (int i = 0; i < b.length; i++) {
			System.out.println( b[i]);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
