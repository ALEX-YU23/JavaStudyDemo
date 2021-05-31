package org.jgs.collection.day01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * 集合框架  List
 * ArrayList
 * 创建ArrayList集合对象
 * 1.构造方法：
 * 	1.1 ArrayList() 构造一个初始容量为 10 的空列表 jdk1.8之后 初始容量为0 只有在添加第一个元素的时候 容量才会变成10
 * 	1.2 ArrayList(int initialCapacity)   构造一个具有指定初始容量的空列表
 * 
 * 2.常用方法
 * 	2.1 添加元素boolean add(E e)  将指定的元素添加到此列表的尾部
 * 
 * 
 * 3.特征
 * 	 1.底层是基于数组结构的  数据结构是线性(空间是连续的 元素是连续的)
 * 	 2.存储的元素 有序 不唯一
 *   3.初始容量是10  可以扩容的 扩容当前集合容量的0.5倍
 *   4.此实现不是同步的   多线程是不安全的  
 *   5.增删的效率较低  查找速度较快
 *   List list = Collections.synchronizedList(new ArrayList(...));   
 */

public class CollectionDemo01 extends  ArrayList{

	public static void main(String[] args) {
		
		
		//调用无参构造器 创建集合对象
		ArrayList<String> list = new ArrayList(); //0
		// ArrayList  list =  new ArrayList(20);

		//添加任何对象类型的数据到集合中
		//list.add(20);
		// boolean add(E e) 添加元素
		list.add("张三");
		list.add("李四");
		list.add("王五1");
		list.add("王五1");
		list.add("王五1");
		list.add("王五1");
		list.add("王五2");
		/*
		 * toArray(T[] a) 
			按适当顺序（从第一个到最后一个元素）返回包含此列表中所有元素的数组；
			返回数组的运行时类型是指定数组的运行时类型
		 */

		String[] array = list.toArray(new String[list.size()]);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("");
		//add(int index, E element) 将指定的元素插入此列表中的指定位置
		list.add(0, "张二");

		/*
		 * indexOf(Object o) 返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1
		 */

		int indexOf = list.indexOf("张三");
		System.out.println("index:" + indexOf);
		indexOf = list.indexOf("王五");
		System.out.println("index:" + indexOf);

		/*
		 * lastIndexOf(Object o) 
		  返回此列表中最后一次出现的指定元素的索引，或如果此列表不包含索引，则返回 -1
		 */
		indexOf = list.lastIndexOf("王五1");
		System.out.println("index:" + indexOf);

		//remove(int index)  移除此列表中指定位置上的元素
		String r1 = list.remove(3);
		System.out.println(r1);
		System.out.println("*****************************");

		//remove(Object o) 移除此列表中首次出现的指定元素（如果存在）。
		boolean r2 = list.remove("王五1");
		System.out.println(r2);
		System.out.println("*****************************");

		/*
		 * contains(Object o) 
		  如果此列表中包含指定的元素，则返回 true
		 */

		boolean contains = list.contains("张三");
		System.out.println("集合包含张三" + contains);
		
		

		/*   ?
		 * removeRange(int fromIndex, int toIndex) 
		  移除列表中索引在 fromIndex（包括）和 toIndex（不包括）之间的所有元素
		  该方法是被protected修饰的  只能在本类  同包类 子类中访问
		 */
		CollectionDemo01 collectionDemo01 = new CollectionDemo01();
		
		collectionDemo01.removeRange(1, 3);

		/*
		 * set(int index, E element) 用指定的元素替代此列表中指定位置上的元素
		 */

		list.set(2, "lisi");

		/*
		 * clear()  移除此列表中的所有元素
		 
		 */
		list.clear();

		/*
		 * isEmpty()  如果此列表中没有元素，则返回 true
		 */
		boolean empty = list.isEmpty();
		System.out.println("empty:" + empty);

		//访问集合中的元素  get(int index) 返回此列表中指定位置上的元素。
		//size() 返回此列表中的元素数
		for (int i = 0; i < list.size(); i++) {
			String str = (String) list.get(i);
			System.out.println(str);
		}

	}

}
