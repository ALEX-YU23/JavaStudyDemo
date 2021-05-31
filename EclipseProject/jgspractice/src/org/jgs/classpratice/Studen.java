package org.jgs.classpratice;

public class Studen {
	public String name ;
	public int  age ;
	public String sclass ;
	public String hobby ;
	
	public void say() {
		
		System.out.println(name + "\n年龄 ：" + age + "\n就读于：" + sclass + "\n爱好：" + hobby);

	}
	
	public String getInfo() {
		return name + "\n年龄 ：" + age + "\n就读于：" + sclass + "\n爱好：" + hobby;
	}
}
