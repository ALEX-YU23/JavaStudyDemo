package org.jgs.day10;

/**
 * @Description 
 * (2) Studenta类继承 Person类,并增加成员math、 english存放数学和英语成绩。
 * 个6参构造方法、一个两参构造方法、一个无参构造方法和重写输出方法用于显示6种属性
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月28日上午8:49:27
 */
public class Student extends Person {

	private double math ;
	private double english;
	
	public Student() {}
	
	public Student(String name,String adrr) {
		super(name, adrr);
	}
	
	public Student(String name,String adrr,char sex,int age,double math,double english) {
		super(name, adrr, sex, age);
		this.english = english;
		this.math = math;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("数学:"+this.math+"、英语:"+this.english);
	}
	
	
}
