package org.jgs.demo01;
/**
 * @author mosin
 * @DATE 2021年3月24日
   @version 1.0
   
   java中的数据类型   基本类型和引用类型  合理的利用内存空间
   基本类型
	   	数值型        选择数据类型要遵循    最小原则
	   		整数       每种数据类型占的字节数 决定了能存放多大的数据
	   		 	byte   1字节  8位   -128 ~ 127
	   		 	short  2字节  16位  -32768 ~ 32767     
	   		 	int    4字节  32位           
	   		 	long   8字节  64位
	   		浮点数  
	   			float 单精度  4字节
	   			double 双精度 8字节
	   	非数值型
	   		字符型  char    2字节  'a' '5' '' + 需要加单引号 只能写一个字符 
	   		我们人能够阅读的最小单位  
	   		布尔型  boolean  1bite  1字节   true  false
   引用类型
   	类  数组 枚举 接口 注解  String  字符串  "asdgg"
   
 */
public class Demo02 {
	
	public static void main(String[] args) {
		//存储数字10   默认是int类型  = 在赋值整数时  会做类型的转换
		
		byte b = 10;
		short s = 10;
		int i = 10;
		long l = 10;


		//2.5  默认 double
//		float f = 2.5;
//		float f = 2.5f;
//		float f = 2.5F;
		float f = (float)2.5;
		
		double d = 2.5;
		
		//char
//		char c = 'a';
		char c = 'a';  //不允许为空
		
		//boolean
//		boolean bl = true;
		boolean bl = false;
		
		//String 字符串
		String  name = "张三";
		
		
	}
}
