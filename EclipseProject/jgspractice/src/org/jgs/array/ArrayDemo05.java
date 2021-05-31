package org.jgs.array;
class Car {
	private String name ;
	private double price ;
	private Person person ; // 一辆车有一个人
	// Person 不能放到构造方法里面，不然就必须给车配一个人
	public Car(String name,double price) {
		this.name = name;
		this.price = price;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Person getPerson() {
		return person;
	}
	public String getInfo() {
		return "汽车品牌型号：" + this.name + "、汽车价值：" + this.price ;  
	}
}
class Person{
	private String name ;
	private int age ;
	private Car car;  // 一个人有一辆车
	private Person children[];  // 一个人有多个孩子
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void setChildren(Person[] children) {
		this.children = children;
	}
	public Person[] getChildren() {
		return children;
	}
	public void setCar(Car car) {
		this.car = car ;
	}
	public Car getCar() {
		return car;
	}
	public String getInfo() {
		return "姓名：" + this.name + "、年龄" + this.age ;
	}
	
	// setter、getter略
}

public class ArrayDemo05 {

	public static void main(String[] args) {
		// 第一步：声明对象并且设置彼此的关系
		Person person = new Person("张祥", 24);
		Person childA = new Person("许晴", 16);
		Person childB = new Person("刘浩", 23);
		childA.setCar(new Car("BMW X1",2000000.0));   // 匿名对象
		childB.setCar(new Car("法拉利",28010000.0));  // 匿名对象
		person.setChildren(new Person [] {childA,childB}); // 一个人可以有多个孩子
		Car car = new Car("宏碁", 200000000.0);
		person.setCar(car);    // 一个人有一辆车
		car.setPerson(person); // 一辆车属于一个人
		// 第二步：根据关系获取数据
		System.out.println(person.getCar().getInfo());   // 代码链
		System.out.println(car.getPerson().getInfo());   // 代码链
		// 根据人找到所有的孩子以及孩子对应的汽车
		for (int x = 0; x < person.getChildren().length; x++) {
			System.out.println("\t|- " + person.getChildren()[x].getInfo());
			System.out.println("\t\t|- " + person.getChildren()[x].getCar().getInfo());
		}
	}
}

















