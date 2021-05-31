package org.jgs.javahigh03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class CountryMap {

	HashMap<String, String> hashMap = new HashMap<String,String>();

	{
		hashMap.put("CN", "中华人民共和国");
		hashMap.put("AU", "澳大利亚");
		hashMap.put("US", "美利坚合众国");
		hashMap.put("RS", "俄罗斯联邦");
		hashMap.put("FR", "法国");
	}
	
	@Test
	public void test01() {
		
		
		System.out.println(hashMap);
		
		System.out.println("CN对应的国家是:"+hashMap.get("CN"));
		
		System.out.println("Map中有"+hashMap.size()+"组数据");
		
		System.out.print("Map中包含FR的key吗?");
		boolean containsKey = hashMap.containsKey("FR");
		System.out.println(containsKey);
		
		System.out.print("Map中包含UP的key吗?");
		System.out.println(hashMap.containsKey("UP"));
		
		
		Set<String> keySet = hashMap.keySet();
//		keySet.forEach(x -> System.out.println(x));
		System.out.println(keySet);
		
		Collection<String> values = hashMap.values();
		System.out.println(values);
		System.out.println(values instanceof Set) ;
		
		// 清空map
		hashMap.clear();
		System.out.println(hashMap.isEmpty()?"map已经清空":"map");
			
	}
	@Test
	/**
	 * 
	 * 遍历map的方法 1.迭代器遍历
	 * @author AlexYU 
	 * @date 2021年5月12日下午2:43:53
	 */
	public void test02() {
		// 1.迭代器遍历
		Iterator<Entry<String, String>> it = hashMap.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	@Test
	/**
	 * 
	 * 遍历map的方法 2.增强型for循环
	 * @author AlexYU 
	 * @date 2021年5月12日下午2:43:53
	 */
	public void test03() {
		// 2.增强型for循环
		hashMap.forEach((x,y)->System.out.println(x+":"+y));
	}
	@Test
	/**
	 * 
	 * 遍历map的方法 3：键值对
	 * @author AlexYU 
	 * @date 2021年5月12日下午2:43:53
	 */
	public void test04() {
		//3：键值对
		Set<String> keySet = hashMap.keySet();
		for (String str : keySet) {
			System.out.println(str+":"+hashMap.get(str));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
