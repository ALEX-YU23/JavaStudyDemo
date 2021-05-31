package com.atguigu.contack;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Judge00 {

	public static void main(String[] args) throws FileNotFoundException {
		
		/*
		 * boolean a = true; boolean b = true; if ( a == b) {
		 * System.out.println("haha"); }
		 */
		
//		int i;
//		System.out.println(i);
		PrintStream ps = new PrintStream("e:/log.txt");
		
		System.setOut(ps);//把创建的打印输出流赋给系统。即系统下次向 ps输出

		
		for (int i = 1; i < 50; i++) {
			System.out.println(i+".");
		}
		
		
		
		
//		PrintStream out = System.out; // 先把系统默认的打印输出流缓存
//
//		System.out.println("这行语句重新定位到标准输出——屏幕");
		
		

	}

}
