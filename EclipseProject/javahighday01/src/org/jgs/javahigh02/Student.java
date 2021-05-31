package org.jgs.javahigh02;

public class Student<E> {

	private String name;
	private E id;
	private double score;
	private int age;
	public Student() {
	}
	public Student(String name, E id, double score, int age) {
		this.name = name;
		this.id = id;
		this.score = score;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public E getId() {
		return id;
	}
	public void setId(E id) {
		this.id = id;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", score=" + score + ", age=" + age + "]";
	}
//	@Override
//	public int compareTo(Student stu) {
//		
//		return (int)(stu.score - this.score) ;
//	}
	
}
