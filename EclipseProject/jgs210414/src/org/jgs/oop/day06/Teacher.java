package org.jgs.oop.day06;
/**
 * 
 * 所有的类都是Object的子类
 * @author mosin
 * @DATE 2021年4月24日
 */
public class Teacher {

	
	  private String  name;
	  private int age;
	  
	  
	public Teacher() {
		super();
	}
	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//重写 toString() 改变对象打印输出的信息
	@Override
	public String toString() {
		return "Teacher(name="+this.name+",age="+this.age+")";
	}
	//重写equals  定义比较规则
	@Override
	public boolean equals(Object object) {
		//强制转换
		Teacher  teacher = (Teacher)object;
		//只要学生的年龄和名字相等 就认为是同一个对象
		return (this.name==teacher.name&&this.age== teacher.age);
		
	}
	
	
	
	
	
	
}
