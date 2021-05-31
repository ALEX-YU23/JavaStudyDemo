package org.jgs.oop.day05;
/**
 * 描述教师类
 * @author mosin
 * @DATE 2021年4月22日
 */
public class Teacher {

//	public int  age;
//	public String name;
//	public double salary;
//	public double weight;
//	public char sex;
	
	private int  age;
	private String name;
	private double salary;
	private double weight;
	private char sex;
	
	//无参构造器  语法  修饰符 方法名(){}  方法名和类名保持一致
    public Teacher() {
    	this(25, "zsan", 2500, 120, '男');
    	this.teach();
    	System.out.println("Teacher()");
    }
    
    
	
	public Teacher(int age, String name, double salary, double weight, char sex) {
		//this();
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.weight = weight;
		this.sex = sex;
		
	}


	public void  teach() {
		//this();
	}
	
	public int getAge() {
		return age;
	}

	//int age 形式参数
	public void setAge(int age) {
		
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public char getSex() {
		return sex;
	}


	public void setSex(char sex) {
		this.sex = sex;
	}


	//用于测试 不属于teacher本身
	public static void main(String[] args) {
		 Teacher teacher = new Teacher();
		 //对象名.属性名  无法保证数据的合理性
		 teacher.age= 20;
		 
		//调用有参构造 实现创建对象的同时完成赋值
//		Teacher teacher = new Teacher(25, "zsan", 2500, 120, '男');
//		System.out.println(teacher.age);
//		System.out.println(teacher.name);
		 
		  
	}
	
}
