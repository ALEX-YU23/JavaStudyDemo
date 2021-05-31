package org.jgs.oop.day04;
/**
 * 访问权限修饰符
 * 
 *                同类       同包       子类
 * private        true      false      false
 * 
 * 默认的          true      true       false
 * 
 * protected       true      true       true
 * 
 * public          true      true       true
 * @author mosin
 * @DATE 2021年4月20日
 */
public class Access {
	//私有
	private int pri;
	//默认 不用写任何权限修饰符
	int defal;
	//受保护的
	protected int pro;
	//公共的
	public int pub;
	
	//同类中访问四种权限修饰符修饰的变量  全部可以访问
	
	public void show() {
		pri = 1;
		defal = 2;
		pro = 3;
		pub = 4;
	}
}

class Boo{  //同包 
	
	public static void main(String[] args) {
		
		Access access = new Access();
		access.defal = 2;
		access.pro = 3;
		access.pub = 4;
		
		//pri是被private修饰 只能在本类中访问
		//access.pri = 5;
		
	}
	
}

