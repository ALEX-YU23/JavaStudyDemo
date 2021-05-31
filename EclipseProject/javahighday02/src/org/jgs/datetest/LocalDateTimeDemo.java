package org.jgs.datetest;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {

//		test();
		test1();
	}

	private static void test1() {
		LocalDateTime of = LocalDateTime.of(1997, 11, 7, 12, 12);
		System.out.println(of);
		System.out.println(of.getYear());
		System.out.println(of.getMonthValue());
		System.out.println(of.getDayOfMonth());
		System.out.println(of.getDayOfWeek().getValue());
		System.out.println(of.getHour());
		System.out.println(of.getMinute());
		System.out.println(of.getSecond());
		
	}

	private static void test() {
		//静态方法，根据当前时间创建对象/指定时区的对象
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.toString().replace('T', ' '));
	}

}
