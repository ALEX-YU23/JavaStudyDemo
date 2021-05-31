package org.jgs.oop.day03;
/**
 * 创建学生对象
 * @author mosin
 * @DATE 2021年4月19日
 */
public class TestStudent {

	public static void main(String[] args) {
		
		Student student = new Student();
		//赋值  对象名.属性名  无法确保值的合理性
//		student.age = 200;
//		student.height=300;
		
		// 封装之后访问属性  对象名.属性名
		//student.age = 200;
		
		//赋值 通过调用对象中提供的set方法 
		student.setAge(101);
		student.setHeight(251);
		
		//访问属性值  
		int age = student.getAge();
		double height = student.getHeight();
		
		System.out.println(age);
		System.out.println(height);
		
		

	}

}
