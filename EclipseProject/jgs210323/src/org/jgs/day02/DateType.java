package org.jgs.day02;
/**
 * 数据类型的转换
 * 自动转换   小范围转换为大范围  隐式转换
 * 基本数据类型 
 * 	
 * byte  short  int  long  float  double
 * 			char<>int  char 类型的范围内  2字节     
 * 布尔类型不参与数据类型的转换
 * 
 * 强制转换	  大范围转换为小范围  有可能会产生数据精度的丢失   显示转换
 * 
 * 
 * 
 * @author mosin
 * @DATE 2021年3月26日
 */
public class DateType {
	
	public static void main(String[] args) {
		//自动类型转换
		byte b = 12;
		short s = b;
		int i = s;
		long l = i;
		System.out.println(l);
		
		float f = l;
		System.out.println(f);
		double d = f;
		System.out.println(d);
		
		char c = 97;
		System.out.println(c);
		
		i = c;
		System.out.println(i);
		
		//强制类型转换
		
		double d2 = 13.5;
		float f2 =(float)d2;
		System.out.println(f2);
		
		//精度丢失
		int i2 =(int) f2;
		System.out.println(i2);
		
		s =(short)c;
		
		
		
	}
	

}
