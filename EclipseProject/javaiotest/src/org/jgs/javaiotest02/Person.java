package org.jgs.javaiotest02;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * Person需要满足如下的要求，方可序列化
	 * 1.需要实现接口: Serializable
	 * 2.当前类提供-一个全局常量: serialVersionUID
	 * 3.除了当前Person类需要实现Serializable接口之外，还必须保证其内部所有属性
	 * 也必须是可序列化的。(默认情况下， 基本数据类型可序列化)
	 * 补充:ObjectOutputStream和ObjectInputStream不能序列化static和transient修饰的成员变量

	 */
	private static final long serialVersionUID = 8406453944617986546L;
	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
