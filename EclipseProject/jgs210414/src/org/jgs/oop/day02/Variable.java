package org.jgs.oop.day02;
/**
 * 成员变量 和 局部变量  作用域 
 * 成员变量：有初始值  初始值根据变量的类型决定
 * 局部变量：没有默认值  使用之前必须初始化
 * @author mosin
 * @DATE 2021年4月16日
 */
public class Variable {
	//成员变量 有初始值  初始值根据变量的类型决定
	public String name;
	public int age;
	public double height;
	public char sex;
	
	//int result;
	
	//成员方法
	public void study(int num1,int num2) {
		//局部变量  没有初始值  局部变量在使用之前必须初始化
		int result;
		result = num1+num2;
		System.out.println(result);
	}
	
	public String getName() {
		return name;
	}
	
//	public int getReSult() {
//		return result;
//	}
//	
	
	public static void main(String[] args) {
		
		Variable variable = new Variable();
		String name2 = variable.getName();
		System.out.println(name2);
		variable.study(1, 2);
		
	}
	
}
