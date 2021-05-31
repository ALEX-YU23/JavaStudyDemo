package org.jgs.javahigh07;

/**
 * 1.创建一个会员类 Member
 * 属性:姓名(String)、ID(Integer)、账户余额(Double)
 * 2.使用List集合存放多个会员对象
 * 3.使用collections的sort方法对该集合进行排序
 * 1.先按照ID进行排序,ID位数越少越靠前
 * 2.再按照账户余额进行排序,余额越多越靠前
 * @Description
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年5月13日下午8:39:38
 */
public class Member {
	private String name;
	private Integer id;
	private Double balance;
	public Member() {
	}
	
	public Member(Integer id,String name, Double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", balance=" + balance + "]";
	}
	
}
