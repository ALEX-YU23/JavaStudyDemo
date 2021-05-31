package org.jgs.classpratice;

/**
 * @Description
 * 		设计一个Dog类，有名字、颜色、年龄等属
 * 性，定义构造方法来初始化类的这些属性，定义构造方法
 * 来初始化类的这些属性，定义方法输出Dog信息，编写应用
 * 程序使用Dog类。
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月6日下午6:40:17
 */
public class Dog {
	private String name;
	private String color;
	private int age;
	public Dog() {}
	public Dog(String name,String color,int age) {
		this.age = age;
		this.name = name;
		this.color = color;
	}
	// setter、getter略
	public String getInfo() {
		return "名字是："+name+"\n毛色："+color+"\n年龄："+age;
	}
}
