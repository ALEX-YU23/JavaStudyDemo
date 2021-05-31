package org.jgs.Stringdemo.day01;

import java.util.Arrays;

import org.junit.Test;

/*
 * 常用类 String类的使用
 * final byte[] 底层存储的方式  不能被改变的
 */
public class Stringdemo {
	@Test
	public void test01() {
		
		String str1 = "helloworld";
		String str2 = "helloworld";
		
		String str3 = new String("helloworld");
		String str4 = new String("helloworld");
		
		System.out.println(str1 == str2);//true
		System.out.println(str1 == str3);//false
		System.out.println(str3 == str4);//false
		System.out.println(str1.equals(str4));//true
		
		System.out.println("*****************************");
		/*
		 * 当前的运算结果和java中的编译机制有关
		 * 如果在赋值的过程中,等号右边的值是两个字面量，那么在编译的时候会进行运算，
		 * 也就是在字节码文件中，是存储的计算后的结果
		 * 
		 */
		String str5 = "hello"+"world"; // String str5 ="helloworld"
		System.out.println(str5 == str1);//true
		
		String str6 = "hello";
		String str7 = str6+"world";//重新生成了一个新的字符串对象
		System.out.println(str7 == str1);//false

	}
	
	@Test
	public  void test02() {
		
		//String类型的变量值是不能被改变的 但是可以改变它的指向
		
		String str = "hello";
		System.out.println(str);
		str = "world";
		System.out.println(str);
		
		
		for (int i = 0; i <1000000000; i++) {
			str+=str;	//java.lang.OutOfMemoryError:
		}
		
		System.out.println("结束");

	}
	
	@Test
	public void test03() { //String 对象中常用的方法
		
				  //   0123456789
		String str1 = "HelloWorld";
		
		//获取字符串的长度 int   length()
		int length = str1.length();
		System.out.println("len:"+length);
		
		//指定位置的字符charAt(int index)
		char charAt = str1.charAt(4);
		System.out.println(charAt);
		
		//字符串的连接concat(String str)
		String str2 = "hello";
		String concat = str2.concat("world");
		System.out.println(concat);
		
		//判定指定的字符是否包含在目标对象中 boolean contains()
		boolean contains = str1.contains(str2);
		System.out.println("contains:"+contains);
		boolean con = str1.contains("a");
		System.out.println(con);
		
		//判定字符串是以什么开头
		boolean startsWith = str1.startsWith("h");
		System.out.println("startsWith:"+startsWith);
		
		boolean endsWith = str1.endsWith("a");
		System.out.println("endsWith:"+endsWith);
		
		//转换大小写  将小写转换为大写 将大写转换为小写
		String lowerCase = str1.toLowerCase();
		System.out.println("lowerCase:"+lowerCase);
		String upperCase = str1.toUpperCase();
		System.out.println("upperCase:"+upperCase);
		
		//去除字符串前后的空白  trim() 
		String str4 = "    he  llo    ";
		String trim = str4.trim();
		System.out.println(trim);
		
		//判定指定字符出现的索引  如果不存在返回-1
		
		int indexOf = str1.indexOf('a');
		System.out.println("indexof:"+indexOf);
		int index2 = str1.indexOf('l');
		System.out.println("indexof:"+index2);
		
		//判定指定的字符串在目标位置的索引   如果不存在返回-1
		int index3 = str1.indexOf("World");
		System.out.println("indexof:"+index3);
		
		//判定判定指定的字符串在目标位置最后一次出现的索引
		int lastIndexOf = str1.lastIndexOf('l');
		System.out.println("lastIndexOf:"+lastIndexOf);
		
		String replace = str1.replace('H', 'h');
		System.out.println("replace:"+replace);
		
		//截取子串 从开始位置截取到字符串的最后  substring(int index)
		
		String substring = str1.substring(3);
		System.out.println(substring);
		//从开始位置截取到指定位置的字符串  substring(int begin,int end) [begin,end)
		String substring2 = str1.substring(3, 6);
		System.out.println(substring2);
		
		String valueOf = String.valueOf(1);
		System.out.println(valueOf+1);
		//拆分字符串  split(String regex)
		String[] split = str1.split("");
		System.out.println(Arrays.toString(split));
		
	}

}
