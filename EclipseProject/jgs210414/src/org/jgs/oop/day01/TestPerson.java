package org.jgs.oop.day01;
/*
 * 创建对象
 * 一个类要想真正的进行操作，则必须依靠对象
 * 类名称 对象名称 = new 类名称() 
 */
public class TestPerson {

	public static void main(String[] args) {
		
		//创建对象
		Person person = new Person();
		//赋值  对象.属性名 = 属性值
		person.name="张三";
		person.age = 1;
		person.sex = '男';
		
		//访问对象中的属性  对象.属性名
		System.out.println("姓名:"+person.name);
		System.out.println("年龄："+person.age);
		System.out.println("性别："+person.sex);
		
		//访问对象中的方法 对象名.方法名()
		 person.say();
	     int result = person.calculator(2,3);
		 System.out.println(result);
	}

}
