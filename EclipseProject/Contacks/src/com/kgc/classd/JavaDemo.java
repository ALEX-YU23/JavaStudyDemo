package com.kgc.classd;
/**
 * @Description 实现属性的自动命名处理
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月1日下午6:45:01
 */
class Book{
	private String title ;
	private static int count = 0 ;
	public Book() {
		this("NOTITLF-" + count++);
	}
	public Book(String title) {
		this.title = title;
		
	}
	public String getTitle() {
		return this.title;
	}
}
public class JavaDemo{
	public static void main(String[] args){
		System.out.println(new Book("JSP").getTitle());
		System.out.println(new Book("时间简史").getTitle());
		System.out.println(new Book("埋雷").getTitle());
		System.out.println(new Book().getTitle());
		System.out.println(new Book().getTitle());
	}
}
