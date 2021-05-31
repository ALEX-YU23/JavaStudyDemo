package org.jgs.javahigh04;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class Demo01 {

	@Test
	public void test() {
		Class01 class01 = new Class01();
		class01.hello(1233);
		class01.hello("灭韩");
	}
	@Test
	public void test01() {
		Class02 class02 = new Class02();
		System.out.println(class02.hello("1233"));
		System.out.println(class02.hello("灭韩"));;
	}

	@Test
	public void test02() {
		ArrayList<Class00> classList = new ArrayList<>();
		classList.add(new Class00<>("1001", "张三"));
		classList.add(new Class00<>(10.01, "张三"));
		classList.add(new Class00<>("1002", "张三"));
		
		classList.forEach(x->System.out.println(x));
	}
	@Test
	public void test03() {
		ArrayList<Person> stuList = new ArrayList<>();
		
		stuList.add(new Person("大牙", '男',34));
		stuList.add(new Person("西施", '女',63));
		stuList.add(new Person("大乔", '女',36));
		stuList.add(new Person("典韦", '男',28));
		
		Collections.sort(stuList,new LadyFirstComparator());
		stuList.forEach(stu->System.out.println(stu));
		
		System.out.println("####################################");
		
		
		Collections.sort(stuList,(stu1,stu2)->-1);
		stuList.forEach(stu->System.out.println(stu));
	}
}
