package org.jgs.oop.day01;
/**
 * 人类
 * 属性: 人的静态特征
 * 方法：人能完成的操作
 * 
 * @author mosin
 * @DATE 2021年4月14日
 */
public class Person {

	//属性 名字   成员变量  有默认值
	public String name;
	//年龄
	public int age;
	//性别
	public char sex;
	
	//方法 成员方法  完成的操作  说话  void 表示方法没有返回值   
	public void say() {
		System.out.println("hello");
	}
	
	//实现计算的操作  int  返回值类型 根据返回值决定
//	public  int calculator() {
//		int result = 1+1;
//		//返回 return
//		return result;
//	}
	//使用含有参数的方法  数据类型  参数名  形式参数
	public  int calculator(int num1,int num2) {
		int result =num1+num2; 
		//返回 return
		return result;
	}
	
//	public  void calculator() {
//		int result = 1+1;
//		System.out.println("加法已调用");
//	}
	
	
}
