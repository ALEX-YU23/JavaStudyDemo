package org.jgs.apidemo.day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/**
 * Calendar
 * Calendar（格里高利历）是一个日历类，提供了很多操作日期的API，
 * 该类是一个抽象类，不能直接创建对象，但是该类提共了一个getInstance（）方法
 * 可以获取一个对象的实例
 * 
 * @author mosin
 * @DATE 2021年5月20日
 */
public class CalendarDemo {

	@Test
	public void test01() {
		/*
		 * getInstance() 使用默认时区和区域设置获取日历
		 */

		Calendar cd = Calendar.getInstance();
		System.out.println(cd);
		
		//通过 Calendar对象获取对应的Date
		Date time = cd.getTime();
		System.out.println(time);

		/*获取时间分量 年 月 日 时 分 秒
		 * get(int field) 返回给定日历字段的值
		 * */
		//		int i = cd.get(1);
		int i = cd.get(Calendar.YEAR);
		System.out.println(i);
		//int j = cd.get(2);
		//获取月份的值 要加1  才是真正的月份  JANUARY = 0
		int j = cd.get(Calendar.MONTH) + 1;
		System.out.println(j);

		/*获取日
		 * DAY_OF_MONTH
		 * DAY_OF_YEAR
		 * DAY_OF_WEEK
		 * DATE
		 */
		//int k = cd.get(Calendar.DAY_OF_MONTH);
		int k = cd.get(Calendar.DATE);
		System.out.println(k);

		//获取星期几  第一天是sunday  1
		int l = cd.get(Calendar.DAY_OF_WEEK);
		String[] weekDay = { "日", "一", "二", "三", "四", "五", "六" };
		System.out.println("星期" + weekDay[l - 1]);

		//时
		int m = cd.get(Calendar.HOUR);
		System.out.println(m);
		//分
		int n = cd.get(Calendar.MINUTE);
		System.out.println(n);
		//秒
		int o = cd.get(Calendar.SECOND);
		System.out.println(o);
		//毫秒
		int p = cd.get(Calendar.MILLISECOND);
		System.out.println(p);

	}

	@Test
	public void test02() {//设置时间分量
		
		Calendar cd = Calendar.getInstance();
		cd.set(Calendar.YEAR, 2020);
		System.out.println(cd.get(Calendar.YEAR));
		cd.set(Calendar.MONTH, 4);
		System.out.println(cd.get(Calendar.MONTH));
		cd.set(Calendar.DATE, 20);
		System.out.println(cd.get(Calendar.DATE));
	}
	
	@Test
	public void test03() {//日期相关计算操作
		/*
		 * add(int field, int amount) 
		 * 根据日历的规则，将指定的时间量添加或减去给定的日历字段
		 * 计算 2年5个月20天12时12分12秒之后的日期
		 */
		Calendar cd = Calendar.getInstance();
		
		cd.add(Calendar.YEAR, 2);
		cd.add(Calendar.MONTH, 5);
		cd.add(Calendar.DATE, 20);
		cd.add(Calendar.HOUR, 12);
		cd.add(Calendar.MINUTE, 12);
		cd.add(Calendar.SECOND, 12);
		
		System.out.println(cd.getTime());

	}


	@Test
	public void test04() throws ParseException {
		/*
		 * 计算超市商品的促销日（输入商品的生产日期（yyyy-MM-dd）保质期天数，
		 * 经过计算输出商品的促销日（yyyy-MM-dd），
		 * 商品的促销日是商品过期日的前两周的周三）
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入生产日期(yyyy-MM-dd)");
		String date = scanner.next();
		System.out.println("请输入保质期");
		int  day = scanner.nextInt();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date parseDate = sdf.parse(date);
		
		Calendar cd = Calendar.getInstance();
		cd.setTime(parseDate);
		//计算保质期到期的日期
		cd.add(Calendar.DAY_OF_YEAR, day);
		
		cd.add(Calendar.DAY_OF_YEAR, -14);
		
		cd.set(Calendar.DAY_OF_WEEK, 4);
		
		//将日历类转换为date
		Date time = cd.getTime();
		String format = sdf.format(time);
		System.out.println(format);

	}
	@Test
	public void test05() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date parseDate = sdf.parse("2021-5-23"); 
		Calendar cd = Calendar.getInstance();
		cd.setTime(parseDate);
		cd.set(Calendar.DAY_OF_WEEK, 4);
		
		Date time = cd.getTime();
		System.out.println(time);
		
		
		
	}
	

}
