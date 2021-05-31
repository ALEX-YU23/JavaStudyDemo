package org.jgs.day07;

public class Pets {
	
	private String name ;
	private int health ;
	private int love ;
	public Pets() {
	}
	public Pets(String name, int health, int love) {
		this.name = name;
		this.health = health;
		this.love = love;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public void print() {
		System.out.println("我是"+this.name+",健康值是："+this.health+"，与主人亲密度为"+this.love);
	}
}
