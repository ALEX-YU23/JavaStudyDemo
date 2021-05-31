package org.jgs.oop.day09;
/*
 * 一个类继承了一个抽象类实现了一个接口 
 * 抽象类中有一个方法和接口中的默认方法重名
 * 	采取优先的原则，优先继承抽象类的方法
 */
public class Eoo extends Coo implements Aoo{
	
	public static void main(String[] args) {
		
		Eoo eoo = new Eoo();
		eoo.test();
		
	}
	
}
