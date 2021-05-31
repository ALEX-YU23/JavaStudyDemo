package org.jgs.day01;

import java.util.Scanner;

public class ScannerDemo01 {

	public static void main(String[] args) {
	
		//创建scanner对象  扫描器  使用new 关键字  ctrl+1  快速的接收返回值
		Scanner scan = new Scanner(System.in);
		
		//接收用户的输入
		System.out.println("请输入您的姓名:");
		String name = scan.next();  //程序在此会停止  等待用户输入
		System.out.println("请输入您的年龄:");
		int age = scan.nextInt();
		System.out.println("请输入您的工作年限:");
		int year = scan.nextInt();
		
		//输出用户信息
		System.out.println("这个同学的姓名是："+name+"\t年龄是："+age+"\n工作了"+year+"年了");
	}

}
