package org.jgs.oop.day07;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * 演示junit的使用
 */

public class TestDemo {
	
//	@Test
//	public void testPerson() {
//		System.out.println("hello world");
//		
//	}
//	
//	@Test
//	public void test2() {
//		System.out.println("hello world2");
//	}
//	
//	
//	@Before
//	public void init() {
//		System.out.println("初始化");
//	}
//	
//	@After
//	public void detory() {
//		System.out.println("销毁");
//	}
//	
	@Test
	public void testCat() {
		
		Cat cat = new Cat(); 
		cat.cry();
		
	}
	
	@Test
	public void testAnimal() {
		
	
	} 
}
