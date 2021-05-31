package org.jgs.javahigh03;

import java.util.ArrayList;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		
		
		list.add(new Student<>(1211, "博安", '男'));
		list.add(new Student<>("1212", "内部", '男'));
		list.add(new Student<>(1213, "打牌", '男'));
		list.add(new Student<>(1214, "车辆", '男'));
		
		list.forEach(x->System.out.println(x));
		
		
		System.out.println("*****************************");
		list.sort((stu1,stu2)->stu1.getName().compareTo(stu2.getName()));
		
		list.forEach(x->System.out.println(x));
	}
	
	
}
