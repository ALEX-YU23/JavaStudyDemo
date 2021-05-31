package org.jgs.day07;

public class Penguin extends Pets {
	private char sex ;

	public Penguin() {
		super();
	}

	public Penguin(String name, int health, int love,char sex) {
		super(name, health, love);
		this.sex = sex ;
		
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public void print() {
		System.out.println("企鹅的名字是" + super.getName() + ",健康值是" 
                + super.getHealth() + ",性别是" + this.sex);
	}
	
}
