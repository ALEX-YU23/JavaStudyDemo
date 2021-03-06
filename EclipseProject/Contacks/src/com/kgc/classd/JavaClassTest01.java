package com.kgc.classd;

/**
 * @Description ： 简单Java类
 * 
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月1日上午9:16:24
 */
class Dept{		// 类名称可以明确描述出某类事物
    private long deptno ;
    private String dname ; 
    private String loc ;
    public Dept(){};     // 必须提供有无参
    public Dept(long deptno,String dname,String loc){
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }
    public String getInfo(){
        return "【部门信息】部门编号：" + this.deptno + "、部门名称：" + this.dname + "、部门位置" + this.loc ; 
    }
    public void setDeptno(long deptno) {
        this.deptno = deptno;
    }
    public void setDname(String dname){
        this.dname = dname;
    }
    public void setLoc(String loc){
        this.loc = loc;
    }
    public long getDeptno(){
        return this.deptno;
    }
    public String getDname(){
        return this.dname;
    }
    public String getLoc(){
        return this.loc;
    }
}
public class JavaClassTest01 {
	
	public static void main(String[] args) {
		Dept dept = new Dept(10,"技术部","北京");
		System.out.println(dept.getInfo());
	}
}
