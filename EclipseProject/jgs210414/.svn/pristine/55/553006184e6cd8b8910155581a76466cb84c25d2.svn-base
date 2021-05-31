package org.jgs.oop.day02;

public class Student {
	
	public String name;
	public int age;
	public double height;
	public char sex;
	
	//无参构造方法  也是可以重载
	public Student() {
		
	}
	//构造方法    权限修饰符  方法名(){}  方法名和类名保持一致
//	public Student(String parame1,int parame2,double parame3,char parame4) {
//		name = parame1;
//		age = parame2;
//		height = parame3;
//		sex = parame4;
//		System.out.println("Student的无参构造方法被调用");
//	}
	
	// 通过this关键字  进行赋值   this 指代的是当前对象
	public Student(String name,int age,double height,char sex) {
		//this() 实现构造方法的调用
//		this.name = name;
//		this.age = age;
		this(name,age); // 该行一定要在第一行
		this.study();
		this.height = height;
		this.sex = sex;
		//this.study();
		System.out.println("Student的无参构造方法被调用");
		
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//普通方法   对象名.方法名()
	public void study() {
		//调用两个参数的构造方法  普通方法不能调用构造方法  避免重复创建对象
	    //this("zsan",20);
		System.out.println("************************");
		System.out.println("学习java");
		System.out.println(this.height);
		System.out.println(this.sex);
		System.out.println("************************");
	}
	
	public void setValue(String parame1,int parame2,double parame3,char parame4) {
		name = parame1;
		age = parame2;
		height = parame3;
		sex = parame4;
	}

}
