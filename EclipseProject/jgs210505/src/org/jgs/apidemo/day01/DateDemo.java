package org.jgs.apidemo.day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

/**
 * Date日期类的使用  操作时间的类
 * 1.构造方法  很多的构造方法已经弃用
 * 	Date() 分配一个 Date对象，并初始化它,得到的是当前系统时间对象
 * 	Date(long date)  毫秒值

 * @author mosin
 * @DATE 2021年5月19日
 */
public class DateDemo {
	@Test
	public void test01() {
		//创建日期对象   获取的是当前的系统时间对象
		Date date = new  Date();//Wed May 19 11:21:05 CST 2021
		System.out.println(date);
		
		//获取当前日期的格林威治毫秒数
		long time = date.getTime();
		System.out.println(time);//1621394684374
		
		
		Date date2 = new  Date();
		date2.setTime(1678394684374L);
		//比较时间的先后
		boolean after = date.after(date2);
		System.out.println(after);
		boolean before = date.before(date2);
		System.out.println(before);
		
		
	}
	
	@Test
	public void test02() {
		//创建一个指定日期的date对象
		Date date = new  Date(1621394684374L);
		System.out.println(date);
		
		Date date2 = new  Date(Long.MAX_VALUE);
		System.out.println(date2);
		
		//重新设置毫秒数 获取新的时间
		date.setTime(1678394684374L);
		System.out.println(date);

	}
	
	@Test
	public void test03() throws ParseException { //日期格式化
		//new SimpleDateFormat("格式字符串")
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-d");
		Date date = new Date();
		System.out.println(date);
		
		String formatTime = sdf.format(date);
		System.out.println(formatTime);
		
		//将字符串对象 转换成日期对象 方便后期时间的操作  ParseException
		String strdate = "2020-5-20";
		Date parse = sdf.parse(strdate);
		System.out.println(parse);

	}

}
