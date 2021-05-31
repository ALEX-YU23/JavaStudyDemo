package org.jgs.lambda.day01;

import java.util.ArrayList;

import org.junit.Test;

/*
 * 测试lambda表达式的使用
 */
public class TestLambda {
//	@Test
//	public void test01() {
//		//使用匿名内部类创建接口的实例对象
//		LambdaInterface  li = new  LambdaInterface() {
//			@Override
//			public void say() {
//				System.out.println("hello");
//			}
//		};
//		li.say();
//		
//	}
	
//	@Test
//	public void test02() { //使用lambda表达式创建对象
//		//无参无返回值  如果方法体中  只有一条语句 那么大括号可以省略
//		LambdaInterface  li = ()->System.out.println("hello");
//		li.say();
//	}
	
//	@Test
//	public void test03() {
//		//有参无返回值
//		LambdaInterface  li = (str)->System.out.println(str);
//		li.say("helloworld");
//	}
	
//	@Test
//	public void test04() {
//		//有参无返回值  只有一条语句 如果还是返回值的话 那么 return 也可以省略
//		LambdaInterface  li = ()-> "hello";
//			
//		String say = li.say();
//		System.out.println(say);
//	
//	}
	
	@Test
	public void test05() {
		//有参无返回值  只有一条语句 如果还是返回值的话 那么 return 也可以省略
		//只有一个参数  小括号也可以省略
		LambdaInterface  li = str->{
			System.out.println(str.length());
			return str;
		} ;
		String say = li.say("hello");
		System.out.println(say);
	}
	

	@Test
	public void test06() {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.forEach(str->System.out.println(str));
		
	}

}
