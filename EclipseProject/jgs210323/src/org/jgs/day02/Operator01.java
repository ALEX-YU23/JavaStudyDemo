package org.jgs.day02;
/**
 * 数学运算符
 * + - *  /  %  ++  --
 * @author mosin
 * @DATE 2021年3月26日
 */
public class Operator01 {

	public static void main(String[] args) {
		
		int a = 10;
		double d = 3.2;
		float f3 = 2.3f;
		byte b = 2;
		short s = 3;
		char c = 12;
		
		//加法  如果操作数有大范围 则结果是大范围类型
		double d2 = a+d;
		int result = a+b;
		
		//如果操作数是 byte short char类型 在运算前 会转换成int
		int s2 = b+s;
		int s3 = s+c;
		
//		float d2 = a+d;
		System.out.println(d2);
		
		
		//除法
		int d3= a/s;
		System.out.println(d3);   
		
		double  d4 = d/s;
		System.out.println(d4);
		
		// java.lang.ArithmeticException:  / by zero
//		d3 = a/0;
//		System.out.println(d3);
		
		d4 = d/0;
		System.out.println(d4); //Infinity  无穷大
		
		float f4 = f3/0;
		System.out.println(f4);  //Infinity 
		
		
		//取余
		
		int i4 = a%s;
		System.out.println(i4); //1
		
		//++ 自增  --自减
		
//		a++;
//		++a;
//		System.out.println(a);
//		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		

	}

}
