package org.jgs.oop.day10;

public class Person {

	
	private int  age;
	
	
	public void setAge(int  age)throws Exception {
		
		if(age>1&&age<100) {
			this.age = age;
		}else{
			//通过throw抛出异常
//			throw  new Exception("年龄不合理");
			throw  new AgeException("年龄不合理");
		}
		
	}
	
	public int getAge() {
		return age;
	}
	
	
	public static void main(String[] args) {
		
		Person person = new  Person();
		
		try {
			person.setAge(-10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(person.getAge());
		
		
		
	}
}
