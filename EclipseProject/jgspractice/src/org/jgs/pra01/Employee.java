package org.jgs.pra01;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 
 * @Description 定义员工类,具有姓名、年龄、性别属性,并具有构造方法和显示数据方法。
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月28日上午9:12:20
 */
@Data
@AllArgsConstructor
public class Employee {
	
	
	private String name;
	private int age;
	private char sex;
	public String showInfo() {
		
		return "姓名:"+this.name+"、年龄:"+this.age+"、性别:"+this.sex;
	}
	public static void print() {
		
	}
	
}
