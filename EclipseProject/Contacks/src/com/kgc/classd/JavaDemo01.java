package com.kgc.classd;

class Person01{
	public Person01() {
		System.out.println("【构造方法】Person类构造方法执行");
	}
	static{
		System.out.println("【静态块】静态块执行。");
		
	}
	{
		System.out.println("【构造块】Person构造块执行");
	}
}

public class JavaDemo01 {

	public static void main(String[] args){
        new Person01();
    }

}
