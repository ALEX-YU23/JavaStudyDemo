package org.jgs.oop.day01;
/*
 * 描述用户类
 */
public class User {
	
	public String  userName;
	public int  age;
	
	//判定票价
	public int judgeTicket(int age) {
		if (age>18) {
			return 20;
		}else {
			return 0;
		}	
	}
}
