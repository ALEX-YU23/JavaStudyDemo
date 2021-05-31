package org.jgs.classpratice;

public class TestStuTea {

	public static void main(String[] args) {

		// 创建一个学生类
		Studen studen = new Studen();
		// 为学生类属性赋值
		studen.name = "张浩";
		studen.age = 10 ;
		studen.sclass = "S1班" ;
		studen.hobby = "篮球" ;
		// 调用学生类成员方法
		//studen.say();
		System.out.println(studen.getInfo());
		
		// 打印分割线
		System.out.println();
		System.out.println("*******************************");
		System.out.println();
		
		// 创建一个老师类
		Teacher teacher = new Teacher();
		// 为老师类属性赋值
		teacher.name = "王老师" ;
		teacher.major = "计算机" ;
		teacher.lesson = "使用Java语言理解程序逻辑" ;
		teacher.tage = 5;
		// 调用学生类成员方法
		teacher.say();
		
		
	}

}
