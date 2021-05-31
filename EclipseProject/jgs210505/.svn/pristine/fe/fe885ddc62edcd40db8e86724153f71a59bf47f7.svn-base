package org.jgs.iodemo.day01;

import java.io.Serializable;

/**
 * 学生类 演示对象流的使用   标准的java bean
 * @author mosin
 * @DATE 2021年5月26日
 */
public class Student implements Serializable {
	/**
	 * 不写序列化号 系统会默认的生成一个
	 * 如果自己不维护序列化号 一旦类做了修改那么序列化号就会改变 
	 * 会导致反序列化失败 ，所以 ，一般情况下会自己维护一个序列化号
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int age;
	private String name;
	private char sex;
	private int stuno;
	//序列化时 忽略某个属性  transient
	private transient String otherInfo;
	//private double weight;
	
	
	
	
	
//	public double getWeight() {
//		return weight;
//	}
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}
	public Student() {
		
	}
	
	
//	public Student(int age, String name, char sex, int stuno, String otherInfo, double weight) {
//		super();
//		this.age = age;
//		this.name = name;
//		this.sex = sex;
//		this.stuno = stuno;
//		this.otherInfo = otherInfo;
//		this.weight = weight;
//	}
	
	
	public int getAge() {
		return age;
	}
	public Student(int age, String name, char sex, int stuno, String otherInfo) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
		this.stuno = stuno;
		this.otherInfo = otherInfo;
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
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getStuno() {
		return stuno;
	}
	public void setStuno(int stuno) {
		this.stuno = stuno;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}


	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", sex=" + sex + ", stuno=" + stuno + ", otherInfo="
				+ otherInfo + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Student [age=" + age + ", name=" + name + ", sex=" + sex + ", stuno=" + stuno + ", otherInfo="
//				+ otherInfo + ", weight=" + weight + "]";
//	}
	
	
	


}
