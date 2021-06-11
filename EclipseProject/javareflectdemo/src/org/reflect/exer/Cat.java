package org.reflect.exer;

public class Cat  extends Pets{

	
	
	public Cat() {
		super();
	}

	public Cat(String name, char sex, int health, int love) {
		super(name, sex, health, love);
	}

	public void eat() {
		System.out.println("小猫吃鱼");
	}
	
	public void cry() {
		System.out.println("小猫叫");
	}
	
	

}
