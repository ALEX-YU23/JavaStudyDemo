package org.jgs.oop.day04;

public class Aoo {
	
	public int a;
	public static int b;
	
	
	public void show() { //有隐式的this传递
		//static int c;  不合法
		
		System.out.println(this.a);
		System.out.println(Aoo.b);
	    show2();
	
	}
	//static 修饰的方法是静态方法  也是属于类本身  类名.方法名 访问 只有一份
	public static void show2() { //没有隐式的this
		
		//static int c;  不合法
		
		//System.out.println(Aoo.a);
		System.out.println(Aoo.b);
		
		//调用普通方法时需要使用 this 
		//show();
		
	}
	public void show3() { //有隐式的this传递
		show();
	}
	
	
	public static void main(String[] args) {
		
		//通过类名  访问静态的方法
		Aoo.show2();
		//通过类名  访问普通的方法  无法实现  要想访问普通的方法 需要使用对象名.方法名
		//Aoo.show();
	}

}
