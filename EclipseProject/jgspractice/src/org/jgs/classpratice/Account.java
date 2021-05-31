package org.jgs.classpratice;

public class Account {
	private String name;
	private double balence;
	public Account() {}
	public Account(String name) {
		this(name,0.0);  // 调用双参构造
	}
	public Account(String name,double balence) {
		this.name = name;
		this.balence = balence;
	}
	public double getBalence() {
		return balence;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalence(double balence) {
		this.balence = balence;
	}
	public String getInfo() {
		return "账户名称：" + this.name + "\n账户余额：" + this.balence;

	}
}
