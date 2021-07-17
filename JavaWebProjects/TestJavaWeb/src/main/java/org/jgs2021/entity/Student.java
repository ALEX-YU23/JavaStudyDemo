package org.jgs2021.entity;

public class Student {
	private String name;
	private Integer age;
	private Character gender;
	private Double score;
	
	public Student() {
	}
	
	public Student(String name, Integer age, Character gender, Double score) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", score=" + score + "]";
	}
	
	
}
