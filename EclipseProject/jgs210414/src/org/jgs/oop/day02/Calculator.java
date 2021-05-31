package org.jgs.oop.day02;
/*
 * 使用方法的重载 实现简易计算器 实现加法运算 并将计算结果返回
 * int  int
 * double double
 * int  long  float
 */
public class Calculator {
	
	public int add(int num1,int num2){
		
		return num1+num2;
	}
	
//	public double add(double num1,double num2){
//		
//		return num1+num2;
//	}
	
	public double add(int num1,double num2){
		
		return num1+num2;
	}
	
	public double add(double num1,int num2){
		
		return num1+num2;
	}
	
	public float add(int num1,long num2,float num3){
		
		return num1+num2+num3;
	}

	
}
