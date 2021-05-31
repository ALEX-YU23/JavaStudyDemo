package org.jgs.classpratice;

/**
 * @Description 案例分析六
 * 声明了个图书类，其数据成员为书名、编号（利用静态变量实现自动编号）、
 * 书价，并拥有静态数据成员册数、记录图书册数，在构造方法中利
 * 用此静态变量为对象的编号赋值，在主方法中定义多个对象，并求出总册数。
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月6日下午7:40:25
 */
public class Book{
    private int bid;  // 编号
    private String title;  // 书名
    private static int count = 0;
    private double price;  // 价格
    public Book(String title,double price){
        this.bid = ++ count ;  // 先赋值再自增
        this.title = title;
        this.price = price;
    }
    // setter、getter略
    public String getInfo(){
        return "编号："+this.bid+"\t书名："+title+"\t价格："+price;
    }
    public static int getCount() {
    	return count;
    }
}
