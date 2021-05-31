package org.jgs.apidemo.day01;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

import org.junit.Test;

/**
 * java8中的新日期类
 * java.time包 时间处理类
 * LocalDateTime/LocalDate/LocalTime
 * LocalDateTime
 * 
 * @author mosin
 * @DATE 2021年5月21日
 */
public class LocalDateTimeDemo {

	@Test
	public void test01() {
		/*
		 * now() 从默认时区的系统时钟获取当前的日期时间  
		 */
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//获取对应的时间分量
		int year = now.getYear();
		System.out.println(year);
		//获取月份  枚举类型
		Month month = now.getMonth();
		String name = month.name();
		System.out.println(name);
		System.out.println(month.ordinal());
		System.out.println(month.getValue());
		//日
		int dayOfMonth = now.getDayOfMonth();
		System.out.println(dayOfMonth);
		
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println("**************************");
		System.out.println(now.getDayOfWeek().getValue());

	}
	
	@Test
	public void test02() {

		/*
		 * 该方法是静态的方法
		 * public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second) 
				从年，月，日，小时，分钟和秒获得 LocalDateTime的实例，将纳秒设置为零
		 */
		LocalDateTime of = LocalDateTime.of(2020, 5, 20,20,20,20);
		System.out.println(of);
	}
	
	@Test
	public void test03() {
		
		//Date -> LocalDateTime  纳秒值
		 Date date = new Date();
		//获取时间戳  Instant  纳秒值   toInstant()  1.8
		Instant instant = date.toInstant();
		//ZoneId.systemDefault()  获取系统所在的时区
		LocalDateTime localDateTime = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
		
		
		
		//LocalDateTime -> Date
		LocalDateTime now = LocalDateTime.now();
		//时间戳  中间桥梁
		Instant instant2 = now.atZone(ZoneId.systemDefault()).toInstant();
		//调Date中的from方法获取Date时间对象
		Date from = Date.from(instant2);
		System.out.println(from);

	}
	
	@Test
	public void test04() {//时间戳  Instant
		//获取的时间戳 比现在的系统时间晚八个小时
		Instant now = Instant.now();
		System.out.println(now);
	}
	
	@Test
	public void test05() {
		
		Date date = new Date();
		LocalDateTime time = MyUtil.dateToLocalDateTime(date);
		System.out.println(time);
		
		
		LocalDateTime now = LocalDateTime.now();
		Date dateTime = MyUtil.localDateTimeToDate(now);
		System.out.println(dateTime);

	}
	
	@Test
	public void test06() {//日期的计算  plus()
		
		//一系列的plus方法
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime plusYear = now.plusYears(1);
		System.out.println(plusYear);
		
		LocalDateTime plusMonths = now.plusMonths(2);
		LocalDateTime plusMonths2 = plusYear.plusMonths(2);
		System.out.println(plusMonths);
		System.out.println(plusMonths2);
		
		LocalDateTime plusDays = plusMonths2.plusDays(2);
		System.out.println(plusDays);

	}
	
	

	
}
