package org.jgs.javahigh01;

import java.util.ArrayList;

import org.junit.Test;

class student {
	private int id;
	public student(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (id != other.id)
			return false;
		return true;
	}
}

@SuppressWarnings("serial")


public class Demo01 {

	
	
	@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
	@Test
	public void Test02() {
		ArrayList list = new ArrayList();
		
		//添加元素
		list.add(9098);
		list.add(90.98);
		list.add("张");
		list.add(12021.98);
		list.add('祥');
		list.add(3);
		
		System.out.println(list);  //[9098, 90.98, 张, 12021.98, 祥, 3]
		
		
//		//删除元素
//		list.remove(1); // 根据下标删除
//		System.out.println(list);
//		
//		list.remove(12021.98);  // 根据元素删除
//		System.out.println(list);
		
		list.remove(3);  // 展示冲突 当要删除的元素与某个元素的下标相同时会出现什么结果
		System.out.println(list); // [9098, 90.98, 张, 祥, 3]
		// 很明显会按照下标删除
		
		Integer i = 123;
		
		list.remove(i); 
		System.out.println(list);
		
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		list.clear();
		student student1 = new student(18);
		student student2 = new student(18);
		list.add(student1);
		list.add(new student(11));
		list.add(new student(12));
		list.add(new student(13));
		list.add(new student(14));
		list.add(new student(15));
		list.add(new student(16));
		
		boolean contains = list.contains(student2);
		System.out.println(contains);
		
	}
}
