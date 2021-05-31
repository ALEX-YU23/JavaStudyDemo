package org.jgs.classpratice;

public class Teacher {
	public String name ;
	public String major ;
	public String lesson ;
	public int tage ;
	
	public void say() {
		System.out.println(name);
		System.out.println("专业方向：" + major);
		System.out.println("教授课程：" + lesson);
		System.out.println("教龄：" + tage);
	}

}
