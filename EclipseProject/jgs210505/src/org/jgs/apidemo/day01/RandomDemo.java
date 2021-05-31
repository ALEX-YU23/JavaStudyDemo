package org.jgs.apidemo.day01;

import java.util.Random;

import org.junit.Test;

/**
 *      Random()：创建一个新的随机数生成器，当前的构造方法以当前的系统时间System.nanoTime()纳秒为种子
- 		Random(long seed)：使用单个 long 种子创建一个新的随机数生成器
- 		在创建一个Random对象的时候可以给定任意一个合法的种子数，
		种子数只是随机算法的起源数字，和生成的随机数的区间没有任何关系
 * 
 * @author mosin
 * @DATE 2021年5月19日
 */
public class RandomDemo {
	@Test
	public void test01() {

		//创建Random对象   System.nanoTime()
		Random random = new Random();
		//获取随机数   产生int范围内的随机数  
		int num1 = random.nextInt();//1339811552   93290880  -145583955 可以是负数
		for (int i = 0; i < 100; i++) {
			num1 = random.nextInt();
			System.out.println(num1);
		}
		
		//  nextInt(int bound); [0,bound)  整数
		int num2 = random.nextInt(100);
		System.out.println(num2);

		//                System.nanoTime()
		Random random2 = new Random();
		int num3 = random2.nextInt(100);
		System.out.println(num3);
	}

	@Test
	public void test02() {//调用有参构造器 创建random对象 传递一个种子   种子的值和产生随机数的范围没有任何关系

		Random random1 = new Random(100);
		Random random2 = new Random(100);

		for (int i = 0; i < 50; i++) {
			System.out.println("random1:" + random1.nextInt(50));
			System.out.println("random2:"+random2.nextInt(50));
			System.out.println("*******************************");
		}

	}


}
