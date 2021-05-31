package org.jgs.oop.day03;

public class Boo {

	//普通代码块  会被执行多次  
	{
		System.out.println("普通静态代码块被执行");

	}

	public Boo() {
		System.out.println("Boo构造方法被执行");
	}

	//代码块  静态代码块  创建对象是动执行 初始化资源  只会执行一次  而且是在对象创建之前

	//有多个静态代码块 则按照书序依次执行
	static {

		System.out.println("静态代码块被执行1");

	}

	static {

		System.out.println("静态代码块被执行2");

	}

}
