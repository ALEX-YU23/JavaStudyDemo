package org.jgs.day06;

public class JavaDemo01 {

	public static void main(String[] args) {
		
		Person person = new Person();

		person.setAge(113);
		person.setHeight(9);
		person.setGender('男');
		
		System.out.println(person.getAge());
		System.out.println(person.getHeight());
		System.out.println(person.getGender());
		
		System.out.println(person.getInfo());
		
	}

}
