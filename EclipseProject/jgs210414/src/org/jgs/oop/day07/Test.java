package org.jgs.oop.day07;
/*
 *  测试多态
 */

public class Test {

	public static void main(String[] args) {
	
		
//	    //创建学生对象
//		Student student = new  Student(1001,23,"张三");
//		//访问属性
//		System.out.println(student.age);
//		System.out.println(student.name);
//		System.out.println(student.stuId);
//		student.study();
//		
//		//多态  引用类型  向上造型
    	Person person  = new  Student(1001,23,"张三");
//		System.out.println(person.age);
//		System.out.println(person.name);
//		//能点出什么 要看引用类型   父类的引用是不能访问子类中的特有属性
//		//System.out.println(person.stuId);
		
    	//向下造型  如何判定  person的类型  instanceof
    	
    	System.out.println(person instanceof Student);
    	if(person instanceof Student) {
    		Student stu = (Student)person;
    	}
  
//		/*
//		 * 父类的引用去调用方法时，要先查看子类中是否重写了该方法，如果重写了，则调用子类
//		 * 重写后的方法，如果没有重写，则调用父类的方法
//		 */
//		person.eat(); //学生吃饭
//		person.sleep();//学生睡觉
//		//父类的引用是不能访问子类中的特有方法
//		//person.study();
		
		
		
		//  this  super
//		Student student = new  Student();
//		System.out.println(student.name); // lisi
//		
//		Person person = new  Student();
//		System.out.println(person.name); //张三 
		
		
		//创建小猫对象
//		Cat cat = new Cat();
//		cat.name = "小花";
		//创建人的对象
//		Person person = new Person();
//		CatFood catFood = new CatFood();
//		catFood.name = "猫粮";
//		person.feed(cat,catFood);
		
		
		DogFood dogFood = new DogFood();
//		dogFood.name = "狗粮";
//		dogFood.name = "骨头";
		
		
		
//		person.feed(dog, dogFood);
	
	}


}
