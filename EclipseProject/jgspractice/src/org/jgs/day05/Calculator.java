package org.jgs.day05; 
/**
 * @Description 计算机类 演示:方法的重载
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月15日下午2:55:23
 */
public class Calculator {
	
	public int add(int a,int b) {
		return a+b;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public float add(int a,long b,float c) {
		return a+b+c;
	}
	public int reduce(int a,int b) {
		return a-b;
	}
	public double reduce(double a,double b) {
		return a-b;
	}
	public float reduce(int a,long b,float c) {
		return a-b-c;
	}
}
