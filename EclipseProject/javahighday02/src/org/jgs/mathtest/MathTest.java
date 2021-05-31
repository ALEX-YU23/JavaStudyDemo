package org.jgs.mathtest;
/**
 * 使用Math.random()返回指定数值范围内的随机数
 * @Description
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年5月19日上午11:01:08
 */

import org.junit.Test;

public class MathTest {

	@Test
	public void test01() {
		while (true) {
			
			System.out.println(randomRange(2,10));
		}
	}

	private int randomRange(int f,int c) {
		
		int range = c - f ;
		double random = Math.random()*range;
		
		return (int)random + f;
	}
	
	
}
