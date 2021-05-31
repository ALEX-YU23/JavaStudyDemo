package org.jgs.oop.day04;
/**
 * 
 * 类可以被谁修饰
 * public 默认 final abstract
 * 
 * 被final修饰的类 是不能被继承的
 * 被final修饰的变量  是不能被修改的
 * 被final修饰的方法 是不能被重写的
 * 
 * @author mosin
 * @DATE 2021年4月20日
 */
public class FinalDemo01 {
	
	//final 修饰变量  值不能被改变
//	final double PI= 3.14;
	final double PI;
	
	//final 修饰变量 可以再构造方法中初始化
	FinalDemo01(){
		PI = 3.14;
		//PI = 3;
	}
	
	
	void  show() {
		//final 修饰了一个局部变量  在使用之前完成初始化即可
		final int b;
		//b = 1;
		//System.out.println(b);
	}

	public static void main(String[] args) {
		
	}

}
