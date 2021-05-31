package org.jgs.oop.day05;

public class TestTeacher {

	public static void main(String[] args) {
	
		Teacher teacher = new Teacher();
		 //对象名.属性名  无法保证数据的合理性
//		 teacher.age = 20;
		//对象名.方法名()s
		 teacher.setAge(120);
		 System.out.println( teacher.getAge());

	}

}
