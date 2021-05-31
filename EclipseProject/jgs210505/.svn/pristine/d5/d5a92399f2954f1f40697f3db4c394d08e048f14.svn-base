package org.jgs.collection.day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/*
 * HashMap
 * 1.数据结构

​		jdk1.8之前：数组+单链表

​    	jdk1.8之后：数组+单链表+红黑二叉树（提高查询的效率）

2.初始的容量是16 加载因子0.75

3.当存放的元素达到总容量的0.75时，扩容为原容量的2倍

4.扩容的上限 1<<30

5.其它常量

​			TREEIFY_THRESHOLD = 8   当链表元素达到8时将链表转换为红黑二叉树

​			UNTREEIFY_THRESHOLD = 6  当链表元素减少到6时将二叉树转换为链表

6.无序，key唯一 ，value不唯一，key和value均能为null

7.线程是不同步 ，多线程使用不安全


 * 
 */
public class HashMapDemo {
	
	@Test
	public void test01() {
		
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		
		//put(K key, V value)  添加元素到map集合
		
		map.put("语文", 80);//自动装箱
		map.put("数学", 50);
		map.put("英语", 90);
		map.put("计算机", 95);
		
		//覆盖原来的值
		map.put("数学", 70);
		map.put(null, null);
		System.out.println(map);
		
		//获取指定的元素
		Integer value = map.get("数学");
		System.out.println(value);
		
		//删除元素
		//Integer remove = map.remove("数学");
		//System.out.println(remove);
		
		System.out.println("******************************");
		//遍历map  获取所有的key
		Set<String> keySet = map.keySet();
		//遍历所有的key
		for (String key : keySet) {
			Integer val = map.get(key);
			System.out.println(key+":"+val);
		}
		System.out.println("******************************");
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		//遍历set集合获取所有的Entry对象
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			
			Entry<String, Integer> entry = iterator.next();
			String key = entry.getKey();
			Integer value2 = entry.getValue();
			System.out.println(key+":"+value2);
			
		}
		
		System.out.println("**************************");
		//containsKey(Object key)
		boolean containsKey = map.containsKey("物理");
		System.out.println("语文:"+containsKey);
		
		//map.clear();
		boolean empty = map.isEmpty();
		System.out.println("empty:"+empty);

	}
	@Test
	public void test02() {
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		
		//put(K key, V value)  添加元素到map集合
		System.out.println("***********************");
		map.put("语文", 80);//自动装箱
		map.put("数学", 50);
		map.put("英语", 90);
		map.put("计算机", 95);
		map.put(null, null);
		
		//遍历集合
		map.forEach((key,value)->{
			System.out.println(key);
			System.out.println(value);
		});
		System.out.println("***********************");
		//size() 获取当前集合中元素的个数
		
		int size = map.size();
		System.out.println("size:"+size);
		//通过values() 获取所有的value
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}
		
	}
	
	
	
	@Test
	public void test03() {
		//Collections synchronizedList()  获取一个线程安全的集合  使用方式参照ArrayList
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		System.out.println("*******************");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("*******************");
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("*******************");
		String max = Collections.max(list);
		System.out.println("max:"+max);
		
		String min = Collections.min(list);
		System.out.println("min:"+min);
		
		
	}
	
	

}
