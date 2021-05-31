package com.kgc.classd;

class Emp{
	private long empno;    //  员工编号
	private String ename;  //  员工姓名
	private String dept;   //  部门名称
	private double salary; //  基本工资
	public Emp() {
		this(9527L,"无名氏",null,0.0);
	}
	public Emp(long empno) {
		this(empno,"未定",null,0.0);
	}
	public Emp(long empno,String ename,String dept) {
		this(empno,ename,dept,2500.00);
	}
	public Emp(long empno,String ename,String dept,double salary) {
		this.empno = empno;
		this.ename = ename;
		this.dept  = dept;
		this.salary= salary;
	}
	//setter、getter略
	public String getInfo() {
		return "雇员编号： " + this.empno + 
			   "\t雇员姓名： " + this.ename + 
			   "\t所在部门： " + this.dept  + 
			   "\t基本工资： " + this.salary;
	}
}
public class ConstructionMethod {

	public static void main(String[] args) {
		Emp emp = new Emp(9527L,"史密斯","财政部");
		System.out.println(emp.getInfo());
	}

}
