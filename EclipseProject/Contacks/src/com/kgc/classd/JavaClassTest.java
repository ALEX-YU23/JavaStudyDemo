package com.kgc.classd;


class Person {
	private String name;
	private int age;
	// 方法名称与类名相同，并且无返回值定义
	public Person() {
		 
		System.out.println("***一个新的Person类对象实例化。");
	}
	public Person(String name) {
		this();    //  调用本类无参构造
		this.name = name;
	}
	public Person(String name,int age) {
		this(name);    //  调用本类单参构造
		this.age = age;
	}
	public void tell() {
		System.out.println("姓名："+ this.name + "\n年龄：" + this.age);
	}
	// setter、getter略
}
public class JavaClassTest {   // 主类
	
	public static void main (String[] args) {
		Person person = new Person("李峰",67);
		person.tell();
	}
}