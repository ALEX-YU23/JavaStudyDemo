package org.jgs.oop.day09;
/**
 * 一个类实现了两个接口 两个接口中有同样的默认方法
 * @author mosin
 * @DATE 2021年4月28日
 */
public class Doo implements Aoo,Boo{

	
	//重写重复的方法
	@Override
	public void test() {
		
		System.out.println("Doo test()");
		//Boo.super.test();
		//Aoo.super.test();
	}
	
	
	public static void main(String[] args) { //没有隐式的this传递
		Doo doo = new Doo();
		doo.test();
	}


	@Override
	public void t3() {
		
	}
	
	
	
	

}
