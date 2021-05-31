package org.jgs.pra01;

/**
 * @Description 定义职员类,继承员工类,并有自己的属性所属部门和月薪
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月28日上午9:36:35
 */
public class Clerk extends Employee {

	private String department;
	private double monthSalary;
	
	
	
	public Clerk(String name,int age,char sex,String department,double monthSalary) {
		super(name, age, sex);
		this.department = department;
		this.monthSalary = monthSalary;
	}
	
	public String showInfo() {
		return super.showInfo() + "、所属部门：" +this.department+ "、月薪：" + this.monthSalary; 
	}
	public void sp() {
		super.print();
		showInfo();
		name();
	}
	public static void name() {
		
	}
}
