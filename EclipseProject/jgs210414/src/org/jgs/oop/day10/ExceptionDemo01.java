package org.jgs.oop.day10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo01 {

	public static void main(String[] args) {
		//StackOverflowError
		//main(args);
		//java.lang.OutOfMemoryError
		//int[] i = new  int[1024*1024*1024];
		
		//java.lang.ArithmeticException
		
		Scanner scanner = new Scanner(System.in);
		//捕获异常
		try {
			
			System.out.println("请输入被除数");
			int num1 = scanner.nextInt();
			System.out.println("请输入除数");
			int num2 = scanner.nextInt();
			int result = num1/num2;
			System.out.println(num1+"/"+num2+"="+result);
			
//			int []  array = new int[3];
//			//java.lang.ArrayIndexOutOfBoundsException
//			for (int i = 0; i < 4; i++) {
//				System.out.println(array[i]);
//			}
			
		}catch (ArithmeticException ari) {
			//打印堆栈信息  查看出错的位置 和具体的出错信息
			ari.printStackTrace();
			System.err.println("除数不能为0");
			//退出虚拟机 0 正常退出 非0 不正常退出  是唯一一个 finally不执行的情况
			System.exit(1);
		}catch (InputMismatchException in) {
			in.printStackTrace();
			System.err.println("数据类型不匹配");
		}catch (ArrayIndexOutOfBoundsException arry) {
			arry.printStackTrace();
			System.err.println("数组下标越界");
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println("反正就是出错了 什么错我也不知道");
		}finally {
			System.out.println("计算结束");
		}
		
		
		
		
		

	}

}
