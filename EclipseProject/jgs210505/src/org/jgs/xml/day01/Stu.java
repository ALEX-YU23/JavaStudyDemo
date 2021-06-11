package org.jgs.xml.day01;
/**
 * 封装从xml解析出的数据
 * @author mosin
 * @DATE 2021年6月3日
 */
public class Stu {
	
	private int age;
	private double score;
	private String name;
	
	public Stu() {


	}

	public Stu(int age, double score, String name) {
		
		this.age = age;
		this.score = score;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stu [age=" + age + ", score=" + score + ", name=" + name + "]";
	}
	
	

}
