package org.reflect.demo;

public class Student extends Person {

	public String id;
	public double score;
	
	public Student() {
		super();
	}

	public Student(String id, double score) {
		super();
		this.id = id;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	
	
}
