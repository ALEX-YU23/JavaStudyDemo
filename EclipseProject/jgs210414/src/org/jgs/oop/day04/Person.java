package org.jgs.oop.day04;

public class Person {
	
	private int age;
	String name;
	protected double height;
	public char sex;
	public double weight;
	
	public Person(){
		System.out.println("Person的无参构造方法被调用");
	}

	public Person(double height){
		this.height = height;
		System.out.println("Person的无参构造方法被调用");
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void eat() {

	}

	public void sleep() {

	}
	
}
