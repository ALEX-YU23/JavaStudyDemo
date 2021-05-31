package org.jgs.javahigh02;

import java.util.Comparator;
import java.util.TreeSet;

import org.jgs.javahigh02.comparator.IdComparator;
import org.junit.Test;


/*
TreeSet
- 底层实现是TreeMap，数据结构是二叉树
- 不保证顺序，可以自定义排序
- 数据不可以重复，可以为null，只能有一个
- 只能存储可排序的对象  
		第一种方式 实现Comparable<T>接口 重写compareTo()方法
*/
public class TreeSetDemo {

	@Test
	/**
	 * @Description 向TreeSet中添加字符串
	 * @author AlexYU 
	 */
	public void test01() {
	
		
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("田卫星"); //\u7530
		tSet.add("刘浩");//\u5218
		tSet.add("金强");
		tSet.add("齐佳");
		tSet.add("曹建");//\u66f9
		tSet.add("刘浩");
		
		System.out.println(tSet);
		// [刘浩, 曹建, 田卫星, 金强, 齐佳]
		
		// 字符串按照ASCII码值排序由从小到大
	}
	
	@Test
	/**
	 * @Description 向TreeSet中添加对象，对象实现Comprable<Student>
	 * 				接口
	 * @author AlexYU 
	 */
	public void test02() {
		TreeSet<Student> tSet = new TreeSet<>();
		
		tSet.add(new Student("张祥", "1234", 80, 20));
		tSet.add(new Student("刘浩", "1474", 74, 21));
		tSet.add(new Student("金祥", "1094", 87, 16));
		tSet.add(new Student("卫星", "1104", 90, 23));
		tSet.add(new Student("齐佳", "1778", 89, 22));
		
		for (Student student : tSet) {
			System.out.println(student);
		}
		
	}
	@Test
	/**
	 * @Description 向TreeSet中添加对象
	 * 				让TreeSet容器加一个实现的Comprabtor接口
	 * @author AlexYU 
	 */
	public void test03() {
		TreeSet<Student> tSet = new TreeSet<>(new IdComparator());
		
		tSet.add(new Student("张祥", "1234", 80, 20));
		tSet.add(new Student("刘浩", "1474", 74, 21));
		tSet.add(new Student("金祥", "1094", 87, 16));
		tSet.add(new Student("卫星", "1104", 90, 23));
		tSet.add(new Student("齐佳", "1778", 89, 22));
		
		for (Student student : tSet) {
			System.out.println(student);
		}
		
	}
	@Test
	/**
	 * @Description 向TreeSet中添加对象
	 * 				让TreeSet容器加一个匿名内部类实现的Comprabtor接口
	 * @author AlexYU 
	 */
	public void test04() {
		TreeSet<Student> tSet = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student stu1, Student stu2) {
				// 按照序号从大到小排序
				return ((String) stu1.getId()).compareTo((String) stu2.getId());
			}
		});
		
		tSet.add(new Student("张祥", "1234", 80, 20));
		tSet.add(new Student("刘浩", "1474", 74, 21));
		tSet.add(new Student("金祥", "1094", 87, 16));
		tSet.add(new Student("卫星", "1104", 90, 23));
		tSet.add(new Student("齐佳", "1778", 89, 22));
		
		for (Student student : tSet) {
			System.out.println(student);
		}
		
	}
	@Test
	/**
	 * @Description 向TreeSet中添加对象
	 * 				用lamada表达式构建比较器
	 * @author AlexYU 
	 */
	public void test05() {
		TreeSet<Student> tSet = new TreeSet<Student>((stu1,stu2)->stu1.getName().compareTo(stu2.getName()));
		
		tSet.add(new Student("张祥", "1234", 80, 20));
		tSet.add(new Student("刘浩", "1474", 74, 21));
		tSet.add(new Student("金祥", "1094", 87, 16));
		tSet.add(new Student("卫星", "1104", 90, 23));
		tSet.add(new Student("齐佳", "1778", 89, 22));
		
		for (Student student : tSet) {
			System.out.println(student);
		}
		
	}
}
