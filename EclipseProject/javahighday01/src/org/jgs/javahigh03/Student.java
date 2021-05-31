package org.jgs.javahigh03;

public class Student<E> {

	private E id;
	
	private String name;
	private char sex;
	
	public Student() {
		
	}
	public Student(E id,String name, char sex) {
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	public E getId() {
		return id;
	}
	public void setId(E id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public char getSex() {
		return sex;
	}
	@Override
	public String toString() {
		return "学生姓名是"+this.name+",性别为:"+this.sex;
	}
}
