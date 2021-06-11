package org.reflect.demo;

import org.junit.Test;

public class ReflectTest {

	@Test
	public void test01() {
		try {
			Class clzz = Class.forName("org.reflect.demo.Person");
			System.out.println(clzz);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test02() {
		Class clzz = Student.class;
		System.out.println(clzz);		
	
	}
	
	@Test
	public void test03() {
		Student student = new Student();
		Class clzz = student.getClass();
		System.out.println(clzz);
	}
}
