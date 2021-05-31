package org.jgs.oop.day03;
/*
 * 使用封装实现属性的隐藏  属性私有化 方法公开化
 */
public class Student {
	
// 可以通过对象名.属性名  
//	public String name;
//	public int age;
//	public double height;
//	public char sex;
	
	//阻止使用 对象名.属性名 的形式 赋值  需要修改  权限修饰符 为private
	private String name;
	private int age;
	private double height;
	private char sex;
	
	//提供方法  实现属性赋值
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		//书写逻辑代码 保证属性值的合理性
		if(age>0&&age<=100) {
			this.age = age;
		}
		
	}
	public void setHeight(double height) {
		if(height>50&&height<=250) {
			this.height = height;
		}
	}
	public void setSex(char sex) {
		
		this.sex = sex;
	}
	
	//提供方法实现 获取属性值
	public String getName(String name) {
		//返回值 return
		return this.name ;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public char getSex() {
		return this.sex;
	}
	
	
	
	
}
