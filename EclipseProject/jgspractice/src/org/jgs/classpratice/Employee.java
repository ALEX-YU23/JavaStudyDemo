package org.jgs.classpratice;

/**
 * @Description
 *  案例分析二
 * 		定义并测试一个代表员工的Employee类。员工
 * 属性包括“编号”、“姓名”、“基本薪水”、“薪水增长
 * 率”，还包括计算薪水增长额及计算增长后的工资总额
 * 的操作方法。
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月6日下午5:02:04
 */
public class Employee {
	private long code;
	private String name;	
	private double salary;
	private double rate;
	public Employee () {}
	public Employee (long code,String name,double salary,double rate) {
		this.code = code;
		this.name = name;
		this.salary = salary;
		this.rate = rate;
	}
	// 得到薪水增长额度
	public double salaryIncValue() {
		return this.salary * this.rate ;
	}
	// 计算薪水增长总额
	public double salaryIncResult() {
		
		this.salary = this.salary + this.salaryIncValue();
		
		return this.salary ;
	}
	public String getInfo() {
		return "编号:" + this.code + "、姓名:" + name + "、基本薪水:" + salary + "、薪水增长率:" + rate;
	// setter、getter略
	}
}
