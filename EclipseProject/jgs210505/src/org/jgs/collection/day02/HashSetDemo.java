package org.jgs.collection.day02;

import java.util.HashSet;
import org.junit.Test;
/*
 * 
 * HashSet
 * 1.构造器
 *     HashSet() 构造一个新的空集合; 实例具有默认初始容量（16）和负载因子（0.75）
 * 	   HashSet(int initialCapacity)构造一个新的空集合; 实例具有指定的初始容量和默认负载因子（0.75） 
。  2.特征
		1.底层HashMap的key进行数据的存储  数据结构是哈希表
		2.初始的容量 16  加载因子 0.75  当集合的容量达到容量的0.75倍是 扩容为原来的2倍
		3.存储的数据不保证顺序 ,唯一  可以为null 但是只能有一个
		4.线程是不同步的  多线程是不安全的
 * 
 */
public class HashSetDemo {
	
	@Test
	public void test01() {
		
		HashSet<String> set = new  HashSet<>();
		
		//添加元素
		set.add("孟老师");
		set.add("张老师");
		set.add("李老师");
		set.add("李老师");
		set.add("肖老师");
		set.add(null);
		set.add(null);
		
		set.remove("孟老师");
		boolean contains = set.contains("孟老师");
		System.out.println(contains);
		
		//set.clear();
		System.out.println(set);
		System.out.println(set.isEmpty());
		
	}
	

}
