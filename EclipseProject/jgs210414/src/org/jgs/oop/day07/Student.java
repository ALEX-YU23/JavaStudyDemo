package org.jgs.oop.day07;

/*
 * 多态
 * 1.父类的引用指向子类的对象
 */
public class Student extends Person{

	int  stuId;
//	String  name = "lisi";
	
	public Student() {
		super();
		System.out.println(super.name);	
		System.out.println(this.name);
	}

	public Student(int stuId,int age,String name) {
		this.age = age;
		this.name = name;
		this.stuId = stuId;
	}

	public void eat() {
		System.out.println("学生吃饭");
	}

//	public void sleep() {
//		System.out.println("学生睡觉");
//	}

	public void study() {
		System.out.println("学生学习");
	}

}
