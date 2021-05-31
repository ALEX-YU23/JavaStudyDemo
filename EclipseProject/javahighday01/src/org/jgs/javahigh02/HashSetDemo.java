package org.jgs.javahigh02;

import java.util.HashSet;

import org.junit.Test;

/**
 * 
 * HashSet
 * 1.构造器
 * 		HashSet() 构造一个新的空集合; 背景HashMap实例具有默认初始容量（16）和负载因子（0.75）。 
 * 		HashSet(int initialCapacity) 构造一个新的空集合; 背景HashMap实例具有指定的初始容量和默认负载因子（0.75）。
 * 2.特征
 * 		1.底层的HashMap的key 进行数据的存储 数据结构是哈希表
 * 		2.初始的容量16加载因子 0.75当集 合的容量达到容量的0.75倍是扩容为原来的2倍
 * 		3.存储的数据不保证顺序,唯一 可以为null 但是只能有一个
 * 		4.线程是不同步的 多线程是不安全的
 * 
 */
public class HashSetDemo {

	@Test
	public void test01() {
		HashSet<String> set = new HashSet<>();
		
		// 添加元素
		set.add("孟老师");
		set.add("张老师");
		set.add("张老师");
		set.add("李老师");
		set.add("李老师");
		set.add("田主任");
		set.add(null);
		set.add("null");
		
		System.out.println(set);
		
		System.out.println("集合为："+ ((set.isEmpty())?"空":"非空" ));
		
		/**
		 * 两次执行test01打印的set集合顺序一样
		 * 是因为集合的算法是，得到字符串的哈希值通过一定的算法，能得到元素存储的位置
		 * 因为两次集合中添加的字符串没变，所以两次打印顺序一样
		 * 哈希碰撞
		 */
		
		
	}
	
}
