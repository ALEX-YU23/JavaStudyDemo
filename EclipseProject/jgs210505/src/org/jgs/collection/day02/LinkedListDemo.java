package org.jgs.collection.day02;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/*
 * LinkedList 集合  
 * 1.构造器
 * LinkedList() 构造一个空列表。
 * 2.特征：
 * 		1.底层的实现是节点对象   数据结构双向的链表 同时也可以作为队列 和 栈使用
 * 		2.没有扩容的概念
 * 		3.存储的数据有序,不唯一 可以存储null
 * 		4.此实现不同步  多线程是不安全的
 * 		5.增删较快  查询较慢
 */
public class LinkedListDemo {
	/*
	 * 普通的集合使用
	 * List接口中有的方法 在该集合均能使用
	 */
	@Test
	public void test01() {
		
		List list = new LinkedList();//多态
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
	
		list.set(0, "1");
		//清空集合
		list.clear();
		//判定集合是否为空
		list.isEmpty();
		System.out.println(list);

	}
	
	/*
	 *作为双向队列使用    队列遵循 FIFO 先进先出
	 */
	@Test
	public void  test02() {
		
		Deque<String> deque = new LinkedList<String>();
		
		//添加元素  offer() 队列方法
		deque.offer("one");
		deque.offer("two");
		deque.offer("three");
		deque.offer("four");
		
		//offerFirst() 等价 addFirst() 双向队列
		deque.offerFirst("zero");
		//deque.addFirst("zero");
		System.out.println(deque);
		//deque.offerLast("five");
		deque.addLast("five");
		System.out.println(deque);
		System.out.println("********************");
		String first = deque.getFirst();
		System.out.println(first);
		System.out.println("********************");
		String last = deque.getLast();
		System.out.println(last);
		
		
		//元素出队  poll() 该元素会在队列中移出
		String poll = deque.poll();
		System.out.println("poll:"+poll);
		System.out.println(deque);
		
		deque.pollFirst();
		System.out.println(deque);
		deque.pollLast();
		System.out.println(deque);
		System.out.println("************************");
		//peek()  引用队首元素  不会移除
		String peek = deque.peek();
		System.out.println("peek:"+peek);
		System.out.println(deque);
		
		//引用队首
		String peekFirst = deque.peekFirst();
		System.out.println("peekFirst:"+peekFirst);
		//引用队尾
		String peekLast = deque.peekLast();
		System.out.println("peekLast:"+peekLast);
	
	}
	
	/**
	 * 作为栈使用  FILO 先进后出
	 */
	@Test
	public void test03() {
		
		Deque<String> deque = new LinkedList<String>();
		
		//压栈
		deque.push("one");
		deque.push("two");
		deque.push("three");
		deque.push("four");
		System.out.println(deque);
		System.out.println("**********************");
		//出栈  从栈中移除元素
		String pop = deque.pop();
		System.out.println(pop);
		System.out.println(deque);
	
	}

}
