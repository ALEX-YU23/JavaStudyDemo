package org.jgs.oop.day06;
/**
 * 重写
 * 1.发生在父子类中
 * 2.方法名和参数列表保持一致
 * 3.权限修饰符要和父类保持一致或者不一致时保证不能严与父类
 * 4.返回值类型可以和父类保持一致也可以是父类返回值类型的子类型
 * 5.父类的构造方法不能被重写
 * 6.父类的静态方法不能被子类覆盖为非静态方法,父类的非静态方法不能被子类覆盖为静态方法
 * @author mosin
 * @DATE 2021年4月24日
 */
public class Student  extends Person{
	
	//不能重写父类的构造方法
//	public Person() {
//		
//	}
	
	// TODO 构成方法的重写  方法名和参数列表保持一致
	public String eat() {
		return "学生应该吃点好吃的";
		//System.out.println("学生应该吃点好吃的 ");
	}
	
//	public void  sleep() {
//		System.out.println("学生要保持充足的睡眠");
//	}
	
	//不能使用静态的方法来覆盖父类中的非静态方法
//	public static void  sleep() {
//		System.out.println("学生要保持充足的睡眠");
//	}
	
	//不能使用非静态的方法来覆盖父类中的静态方法
//	public  void say() {
//		System.out.println("人能说话");
//	}
	
//	public static void say() {
//		System.out.println("能说英语");
//	}
	
	public static void main(String[] args) {
		
		 Student student = new Student();
		 student.eat();
		 student.sleep();
		 student.say(); 
	}

	
}
