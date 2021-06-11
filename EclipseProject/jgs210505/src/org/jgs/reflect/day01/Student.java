package org.jgs.reflect.day01;

import java.io.Serializable;

public class Student extends Person implements MyInterface, Serializable{

	private double score;
	public String id;

	private Student() {

	}

	private Student(double score) {
		this.score = score;
	}

	public Student(String id) {
		this.id = id;

	}

	public Student(double score, String id) {
		this.score = score;
		this.id = id;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void myInterfaceMethod() {

		System.out.println("myInterfaceMethod()....");

	}
	public void myInterfaceMethod(int a) {

		System.out.println("myInterfaceMethod()...."+a);

	}
	
	public void myInterfaceMethod(int a,String str) {

		System.out.println("myInterfaceMethod()...."+a+":"+str);

	}

	@Override
	public String toString() {
		return "Student [score=" + score + ", id=" + id + "]";
	}
	
	private  void studentMethod() {
		System.out.println("studentMethod()");
	}

}
