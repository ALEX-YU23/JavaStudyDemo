package org.jgs.oop.day04;
/*
 * 
 *  Teacher  is  a Person 
 *  如何实现让Teacher拥有人的特征和能完成的操作
 *   extends  实现继承
 *   
 *   Teacher  子类  派生类
 *   
 *   Person   父类  超类
 *   子类在继承父类的时候 不能继承被private修饰的变量(方法)
 */
public class Teacher extends Person {
	
	private String teacherNo;
	public Teacher() {
		//super  this()   默认super()调用父类的构造方法 
		//super();  
		//super(1);
		System.out.println("Teacher的无参构造被调用");
	}
	
	public Teacher(String teacherNo,double height) {
		//调用父类的有参
		super(height);
		//访问属性  super.name
		super.name = "张三";
		this.teacherNo = teacherNo;
		//super(height); 必须在第一行
	}
	
	public void teach() {

	}
	
	
}
