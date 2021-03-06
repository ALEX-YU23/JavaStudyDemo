package org.jgs.collection.day03;

import java.util.Comparator;
import java.util.TreeSet;

import org.jgs.collection.day01.Point;
import org.junit.Test;

/*
	TreeSet
	- 底层实现是TreeMap，数据结构是二叉树
	- 不保证顺序，可以自定义排序
	- 数据不可以重复，可以为null，只能有一个
	- 只能存储可排序的对象  第一种方式 实现Comparable<T>接口 重写compareTo()方法
 */
public class TreeSetDemo {
	@Test
	public void test01() {
		
			TreeSet<String> set = new TreeSet<String>();
			set.add("one");
			set.add("two");
			set.add("three");
			set.add("four");
			set.add("five");
			System.out.println(set);
	}
	
	@Test
	public void test02() {
		
		TreeSet<Point> set = new TreeSet<Point>();
		
		set.add(new Point(1,2));//java.lang.ClassCastException
		set.add(new Point(4,5));
		set.add(new Point(5,6));
		set.add(new Point(2,3));
		set.add(new Point(3,4));
	
		System.out.println(set);

	}
	
	@Test
	public void test03() {
		//构造一个新的，空的集合，根据指定的比较器进行排序
		TreeSet<Point> set = new TreeSet<Point>(new PointComparator());
		
		set.add(new Point(1,2));//java.lang.ClassCastException
		set.add(new Point(4,5));
		set.add(new Point(5,6));
		set.add(new Point(2,3));
		set.add(new Point(3,4));

		System.out.println(set);

	}
	
	
	@Test
	public void test04() {
		//构造一个新的，空的集合，根据指定的比较器进行排序  匿名内部类实现
		TreeSet<Point> set = new TreeSet<Point>(new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				return (o1.getX()*o1.getX()+o1.getY()*o1.getY())-(o2.getX()*o2.getX()+o2.getY()*o2.getY());
			}
		});
		
		set.add(new Point(1,2));//java.lang.ClassCastException
		set.add(new Point(4,5));
		set.add(new Point(5,6));
		set.add(new Point(2,3));
		set.add(new Point(3,4));

		System.out.println(set);
	}
	
	
	@Test
	public void test05() {//()->{}
		//构造一个新的，空的集合，根据指定的比较器进行排序  lambda
		TreeSet<Point> set = new TreeSet<Point>((p1,p2)-> p2.getX()-p1.getX());
		
		set.add(new Point(1,2));//java.lang.ClassCastException
		set.add(new Point(4,5));
		set.add(new Point(5,6));
		set.add(new Point(2,3));
		set.add(new Point(3,4));

		System.out.println(set);
	}
	
	

}
