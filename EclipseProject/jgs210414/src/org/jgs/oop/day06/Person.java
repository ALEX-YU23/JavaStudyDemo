package org.jgs.oop.day06;

public class Person {
	
    String  name;
	int age;
	
//	public void eat() {
//		
//		System.out.println("人能吃饭 ");
//	}
	
	public Object eat() {	
		return "人能吃饭";
	}
	
	public void  sleep() {
		System.out.println("人能睡觉 ");
	}
	
	public static void say() {
		System.out.println("人能说话");
	}
	
}
