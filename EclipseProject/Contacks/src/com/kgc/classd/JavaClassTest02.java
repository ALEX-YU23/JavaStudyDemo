package com.kgc.classd;

/**
 * @Description ： 声明static属性
 * 
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月1日上午9:16:24
 */

class Person1 {  //  创建所有同一个国家的类
    private String name ;
    private int age ;
    private static String country = "中华民国" ;    //  国家， 暂时不封装
    public Person1(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public static void setCountry(String c) {
		country = c;
	}
    // setter、getter略
    public String getInfo() {
        return "姓名：" + this.name + "、年龄：" + this.age + "、国家: " + this.country;
    }
}
public class JavaClassTest02 {
	
	public static void main(String[] args) {
		Person1.setCountry("中国人民共和国");
	    Person1 per = new Person1("张三",10) ;
	    System.out.println(per.getInfo());
	}
}
