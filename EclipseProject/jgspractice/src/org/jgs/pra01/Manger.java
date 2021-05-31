package org.jgs.pra01;

/**
 * @Description 定义管理层类，继承员工类，并有职务和年薪属性。
 * 
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月28日上午9:28:31
 */
public class Manger extends Employee {

	private String position;
	private double annualSalary;
	
	public Manger(String name,int age,char sex,String position,double annualSalary) {
		super(name, age, sex);
		this.position = position;
		this.annualSalary = annualSalary;
	}
	
	public String showInfo() {
		return super.showInfo() + "、职务："+this.position+"、年薪；" + this.annualSalary;
	}
}
