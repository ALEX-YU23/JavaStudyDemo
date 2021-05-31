package org.jgs.javahigh07;

import org.junit.Test;

public class TestDemo01 {
	static int a = 1;   // 全局
	static {
		int a = 5;
	}

	@Test
	public void test01() {
		Integer i = new Integer(3);
		Integer j = new Integer(3);
		System.out.println(i==j);
		
	}
	@Test
	public void test02() {
		System.out.println(TestDemo01.a);
	}
}
