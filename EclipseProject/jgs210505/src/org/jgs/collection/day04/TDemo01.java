package org.jgs.collection.day04;

import java.util.ArrayList;

import org.jgs.collection.day01.Point;
import org.junit.Test;

/*
 * 泛型得到使用
 * 1.集合
 */
public class TDemo01 {
	@Test
	public void test01() {

		ArrayList list = new ArrayList();
		//没有使用泛型可以添加任何引用类型的数据
		list.add(1);
		list.add("lisi");
		list.add(new Point());

		for (Object obj : list) {
			String str = (String) obj;//java.lang.ClassCastException
		}

	}

	@Test
	public void test02() {//使用泛型 限制集合中存储元素的类型

		ArrayList<String> list = new ArrayList<>();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");

		for (String str : list) {
			System.out.println(str);
		}

	}

	@Test
	public void test03() {
         int  day = 0;
		switch (day) {
		case  1:
			System.out.println("学习java");
			break;
		case 2:
			System.out.println("学习C语言");
			break;
		case 3:
			System.out.println("学习html");
			break;
		case 4:
			System.out.println("学习css");
			break;
		case 5:
			System.out.println("学习javascript");
			break;
		case 6:
			System.out.println("休息");
			break;
		case 7:
			System.out.println("休息");
			break;
		default:
			System.out.println("请输入正确的天数");
			break;
		}

	}
	
	@Test
	public void test04() {
		
        WeekEnum day = WeekEnum.Tuesday;
        
		switch (day) { //byte short int char String
		case Monday:
			System.out.println("学习java");
			break;
		case Tuesday :
			System.out.println("学习java");
			break;
		default:
			break;
		}
	}
	
	@Test
	public void test05() {//自动装箱和自动拆箱
		
		int a = 1;
		//将基本类型的变量直接赋值给包装类型
		Integer A = a;
		//将基本类型的值直接赋值给包装类型
		 A = 2;
		 a = A; //将包装类型的变量字节赋值给基本类型  拆箱

	}
	

	@Test
	public void test06() {
		
		Integer i = new Integer(2);  //不在建议使用
		System.out.println(i);
		i = new Integer("3");
		System.out.println(i);
		
		//Integer 包含的常量
		int maxValue = Integer.MAX_VALUE; //包装类中能存储的最大值
		System.out.println("maxValue:"+maxValue);
		int minValue = Integer.MIN_VALUE;//包装类中能存储的最小值
		System.out.println("minValue:"+minValue);
		
		int size = Integer.SIZE; //通过该值可以推断该类型的值占的字节数
		System.out.println("size:"+size);
		
	}

	@Test
	public void test07() { // 包装类常用的方法
		//parseInt(String s)  将字符串中的值转换为十进制的值
		
		int parseInt = Integer.parseInt("12");
		System.out.println("parseInt:"+(parseInt+1));
		
		//sum(int a,  int b)
		
		int a =1;
		int b = 2;
//		int c = a+b;
		
		int sum = Integer.sum(a,b);
		System.out.println("sum:"+sum);
		
		//max(int a,  int b)  返回两个变量之间的最大值
		int max = Integer.max(a, b);
		System.out.println("max:"+max);
		
		//min(int a,  int b)  返回两个变量之间的最小值
		int min = Integer.min(a, b);
		System.out.println("min:"+min);
		
		//Integer valueOf = Integer.valueOf("一");//NumberFormatException
		Integer valueOf = Integer.valueOf("13");
		System.out.println("valueOf:"+(valueOf+1));
		
		Integer valueOf2 = Integer.valueOf(1);
		System.out.println("valueOf2:"+valueOf2);
		
		//valueOf(String s,  int radix)   按照指定的进制radix[2,36] 转换指定的字符串s为十进制
		
		Integer valueOf3 = Integer.valueOf("123", 4);   
		System.out.println("valueOf3:"+valueOf3);

	}
}
