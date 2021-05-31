package org.jgs.day06;

/**
 * @Description 案例:使用封装保证人类中,年龄在1-100岁之间,
 * 超出范围设置为默认值20 ,保证身高在150-220之间,不在范围
 * 内设置为默认值170 ,保证性别为男或者女，否则设置默认值为男。|
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月19日上午9:44:35
 */
public class Person {
	
	private int age ;
	private double height = 170 ;
	private char gender ;
	
	public void setAge(int age) {
		if (age < 0 || age > 100) {
			this.age = 20;
		}else {
			this.age = age;
		}
	}
	public void setHeight(double height) {
		if (height>150 && height < 220) {
			this.height = height;
		} 
	}
	public void setGender(char gender) {
		if (gender == '女') {
			this.gender = gender;
		} else{
			this.gender = '男';
		}
	}
	
	
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public double getHeight() {
		return height;
	}
	public String getInfo() {
		
		return "年龄是：" + this.age + ",身高：" + this.height + ",性别：" + this.gender ;
	}
	
	
}
