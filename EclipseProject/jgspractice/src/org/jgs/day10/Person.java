package org.jgs.day10;

/**
 * @Description  建立一个人类( Person)和学生类( Student),功能要求如下
 * (1) Person中包含4个私有型的数据成员name、addr、sex、age,分别为字符串
 * 型、字符串型、字符型及整型,表示姓名、地址、性别和年龄。一个4参构造方法
 * 个两参构造方法、一个无参构造方法、一个输出方法显示4种属性
 * (2) Studenta类继承 Person类,并增加成员math、 english存放数学和英语成绩。
 * 个6参构造方法、一个两参构造方法、一个无参构造方法和重写输出方法用于显
 * 示6种属性
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月28日上午8:38:49
 */
public class Person {

	private String name ;
	private String adrr ;
	private char sex ;
	private int age ;
	
	// 无参构造
	public Person() {
		
	}
	
	// 双参构造 调用四参构造
	public Person(String name,String adrr) {
		this(name,adrr,'男',0);
	}	
	
	// 四参构造
	public Person(String name,String adrr,char sex,int age) {
		this.name = name;
		this.adrr = adrr;
		this.sex = sex;
		this.age = age;
		
	}

	public void showInfo() {
		System.out.println("姓名:"+this.name+"、地址:"+this.adrr+"、性别:"+this.sex+"、年龄:"+this.age);
	}
	
}
