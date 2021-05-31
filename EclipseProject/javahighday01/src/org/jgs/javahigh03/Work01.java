package org.jgs.javahigh03;

import java.util.HashMap;
import java.util.Scanner;

public class Work01 {
	

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("0000000000000");
		HashMap<String, Student> stumap = new HashMap<String, Student>();
		
		stumap.put("jack", new Student(123,"田卫星",'女'));
		stumap.put("tom", new Student(112,"郭仁义",'女'));
		stumap.put("jk", new Student("1230","汤姆",'女'));
		
		System.out.println("请输入学员英文名字:");
		String ename = input.next();
		
		if (stumap.containsKey(ename)) {
			System.out.println(ename+"对应的"+stumap.get(ename));
		}
		
	}
}
