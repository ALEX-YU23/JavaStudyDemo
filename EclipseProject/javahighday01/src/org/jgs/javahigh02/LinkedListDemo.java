package org.jgs.javahigh02;

import java.util.List;
import java.util.Deque;
import java.util.LinkedList;

import org.junit.Test;

/**
 * 
 * LinkedKist 集合
 * 1.LinkedList() 
 * 构造一个空列表。 
 * 
 * 
 * 2.特征
 * 		1.底层的结构是节点对象 数据结构 双向链表 同时也可以作为队列和栈使用
 * 
 */
public class LinkedListDemo {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void test01() {
		LinkedList list = new LinkedList();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		
		System.out.println(list);
		
		// 添加元素到表头
		list.addFirst("0");
		System.out.println(list);
		
		// 添加元素到指定位置
		list.set(3, "3");
		System.out.println(list);
		
		// 添加元素到表尾
		list.addLast("0");
		System.out.println(list);
		
		
	}
	/***
	 * 作为双向队列使用
	 */
	@Test
	public void test02() {
		Deque<String> queue = new LinkedList<>();
		
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");
		queue.offer("4");
		
		// 双向队列的方法
		queue.offerFirst("5");
		queue.offerLast("6");
		System.out.println(queue);
		System.out.println(queue.getFirst());
		System.out.println(queue.getLast());
		System.out.println("******************");
		
		// 元素出队 poll() 该元素会在队列中移除
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.pollFirst());
		System.out.println(queue);
		
		System.out.println(queue.pollLast());
		System.out.println(queue);
		
		//peek() 引用队首元素 不会移除
		System.out.println(queue.peek());
		System.out.println(queue);
		
		//peekFirst() 引用队首元素 不会移除
		System.out.println(queue.peekFirst());
		System.out.println(queue);
		
		//peekLast() 引用队尾元素 不会移除
		System.out.println(queue.peekLast());
		System.out.println(queue);
		
		
		
	}
	
	/**
	 * 
	 * 作为栈使用 FIFO
	 */
	@Test
	public void test03() {
		Deque<String> queue = new LinkedList<>();
		
		// 压栈
		queue.push("1");
		queue.push("2");
		queue.push("3");
		queue.push("4");
		
		System.out.println(queue);
		System.out.println("****************");
		
		
		// 出栈
		
		System.out.println(queue.pop());
		System.out.println(queue);
		
	}
}
