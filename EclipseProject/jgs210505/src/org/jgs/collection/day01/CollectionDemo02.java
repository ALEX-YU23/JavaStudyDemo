package org.jgs.collection.day01;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

/*
 * 遍历集合的几种方式
 */
public class CollectionDemo02 extends ArrayList {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Test
	public void test01() {
		//调用无参构造器 创建集合对象
		ArrayList<String> list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");

		//普通for循环
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	@Test
	public void test02() {
		//调用无参构造器 创建集合对象
		ArrayList<String> list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		//增强for循环
		for (String str : list) {
			System.out.println(str);
		}
	}

	@Test
	public void test03() {
		//调用无参构造器 创建集合对象
		ArrayList<String> list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		//使用迭代器遍历集合
		Iterator<String> iterator = list.iterator();
		System.out.println("********************");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
	
	@Test
	public void test04() {
		//调用无参构造器 创建集合对象
		ArrayList<String> list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		//forEach
		list.forEach(x->{
			System.out.println(x);
		});
	}
	
	@Test
	public void test05() {
		//调用无参构造器 创建集合对象
		ArrayList<String> list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		//stream()
		list.stream().forEach(x->System.out.println(x));
		System.out.println("**********************");
		list.stream().filter(x->!x.equals("张三")).forEach(x->System.out.println(x));
		System.out.println("**************************");
		long count = list.stream().filter(x->!x.equals("张三")).count();
		System.out.println(count);
	}
	
	@Test
	public  void test06() {
		
		ArrayList<Point> list = new ArrayList<Point>();
		
		list.add(new Point(1, 2));
		System.out.println(list);
		Point point = new Point(1, 2);
		boolean contains = list.contains(point);
		System.out.println(contains);
		
	}
	
	

}
