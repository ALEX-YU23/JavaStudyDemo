package org.jgs.datetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.Callable;

import org.junit.Test;

public class DateTest {

	@Test
	public void test() {
		// 构造器一：Date()：创建一个对应当前时间的Date对象
//		Date date = new Date();
//		System.out.println(date);

		// 构造器二：创建指定毫秒数的Date对象
		Date date1 = new Date(1550306204104l);
		System.out.println(date1);

		System.out.println(date1.getTime());

		java.sql.Date date3 = new java.sql.Date(35235325345L);
		System.out.println(date3);// 1971-02-13
		// 如何将java.util.Date对象转换为java.sql.Date对象

		// 情况一
		Date date = new java.sql.Date(35235325345L);
		System.out.println(date instanceof Date);

		java.sql.Date sDate = (java.sql.Date) date;
		System.out.println(sDate instanceof java.sql.Date);
	}

	@Test
	public void test01() throws ParseException {
//		SimpleDateFormat对日期Date类的格式化和解析
//		1.两个操作：
//		1.1 格式化：日期 --->字符串
//		1.2 解析：格式化的逆过程，字符串 ---> 日期
//
//		2.SimpleDateFormat的实例化:new + 构造器

		SimpleDateFormat sDF = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date date = new Date();
		String format = sDF.format(date);
		System.out.println(format);

		Date parse = sDF.parse("1997年11月07日 12:34:57");
		System.out.println(parse);

	}

	// 练习一：字符串"2020-09-08"转换为java.sql.Date
	@Test
	public void test02() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date parseDate = sdf.parse("2020-09-08");
		java.sql.Date sqlDate = new java.sql.Date(parseDate.getTime());
		System.out.println(sqlDate);
	}

	@Test
	public void test03() throws ParseException {
		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse("1997-12-23");
		Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse("1998-01-23");

		System.out.println(date1.before(date2));
		System.out.println(date1.after(date2));
		System.out.println(date2.before(date1));
		System.out.println(date2.after(date1));

	}

	/**
	 * 
	 * 输入生日（yyyy-MM-dd）计算已经生存了多少天，生存20000天的纪念日是哪一天
	 */
	@Test
	public void test04() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date brithday = sdf.parse("1997-11-07");

		Date now = new Date();

		long ago = (now.getTime() - brithday.getTime()) / (1000 * 60 * 60 * 24);

		System.out.println("已经生存了" + ago + "天");

		Date momeryDay = new Date((20000l * 1000 * 60 * 60 * 24) + brithday.getTime());

		System.out.println("生存20000天的纪念日是" + sdf.format(momeryDay));

	}

	@Test
	// Calendar类：日历类、抽象类
	// 1.实例化
	// 方式一：创建其子类（GregorianCalendar的对象
	// 方式二：调用其静态方法getInstance()
	public void test05() throws ParseException {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);

		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

		// set()
		// calendar可变性
		calendar.set(Calendar.DAY_OF_MONTH, 8);

		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

		// add()
		calendar.add(Calendar.DAY_OF_MONTH, -8);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

		// getTime():日历类---> Date
		Date time = calendar.getTime();
		System.out.println(time);

		// setTime():Date ---> 日历类
		Date date = new Date();
		calendar.setTime(date);
	}

	// 打印月历 // 日一二三四五六
	@Test
	public void test06() throws ParseException {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");

		System.out.print("请输入年月：");

		Date date = sdf.parse(scan.next());

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		// 计算一个月有多少天
		calendar.add(Calendar.MONTH, +1); // 先给月份加一
		calendar.add(Calendar.DAY_OF_MONTH, -1); // 再给日期减一
		// 得到这个月天数
		int days = calendar.get(Calendar.DAY_OF_MONTH);

//		System.out.println(calendar.get(Calendar.DATE));
		// 星期转换
		calendar.set(Calendar.DAY_OF_MONTH, 1); //将日期设置为本月一号
		int week = (calendar.get(Calendar.DAY_OF_WEEK)==1)?7:calendar.get(Calendar.DAY_OF_WEEK)-1;
		// 获得一号是星期几
//		System.out.println(week);
		
		System.out.println("一\t二\t三\t四\t五\t六\t日");
		// 打印留白
		for (int j = 1; j < week; j++) {
			System.out.print(" \t");
		}
		
		for (int day = 1; day <= days; day++) {
			calendar.set(Calendar.DAY_OF_MONTH, day);
			week = (calendar.get(Calendar.DAY_OF_WEEK)==1)?7:calendar.get(Calendar.DAY_OF_WEEK)-1;
			
			System.out.print(day+"\t");
			
			if (week%7==0) {
				System.out.println();
			}
		}
		
		scan.close();

	}

	// 打印月历
	@Test
	public void test07() throws ParseException {

		Scanner input = new Scanner(System.in);

		Calendar calendar = Calendar.getInstance();

		System.out.println("请输入年份：");
		calendar.set(Calendar.YEAR, input.nextInt());

		System.out.println("请输入月份：");
		// Calendar中月份从零开始
		calendar.set(Calendar.MONTH, input.nextInt() - 1);

		// 获取本月一号是周几
		calendar.set(Calendar.DATE, 1);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		week = (week==1)?7:(week-1);
		// 获取本月有多少天
		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//		int thisMonthDay = calendar.get(Calendar.DAY_OF_YEAR);
//		calendar.add(Calendar.MONTH, 1);
//		int nextMonthDay = calendar.get(Calendar.DAY_OF_YEAR);
//		int days = nextMonthDay - thisMonthDay;

		// 循环遍历月历
		System.out.println("一\t二\t三\t四\t五\t六\t日");
		
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
		}
		
		for (int i = 1; i <= days; i++) {
			calendar.set(Calendar.DATE, i);
			System.out.print(i+"\t");
			if (calendar.get(Calendar.DAY_OF_WEEK)==1) {
				System.out.println();
			}
			
		}

		input.close();

	}

	@Test
	public void test08() throws ParseException {
		/**
		 * 案例2：计算超市商品的促销日（输入商品的生产日期（yyyy-MM-dd）保质期天数，
		 * 经过计算输出商品的促销日（yyyy-MM-dd），商品的促销日是商品过期日的前两周的周三）
		 */
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("请输入商品的生产日期（yyyy-MM-dd）:");
		Date productDate = sdf.parse(input.next());
		System.out.println("请输入商品的保质期天数:");
		int shelfLife = input.nextInt();
		
		Calendar productCal = Calendar.getInstance();
		productCal.setTime(productDate);
		productCal.add(Calendar.DAY_OF_MONTH, shelfLife);
		
		// 打印过期的日期
//		System.out.println(sdf.format(productCal.getTime()));
		
		//商品过期的前两周日期
		productCal.add(Calendar.WEEK_OF_YEAR, -2);
//		System.out.println(sdf.format(productCal.getTime()));
	    
		// 星期转换
		int i = (productCal.get(Calendar.DAY_OF_WEEK)==1)?7:productCal.get(Calendar.DAY_OF_WEEK)-1;
//		System.out.println(i);
		
		// 将日期设置为星期三
		productCal.set(Calendar.DAY_OF_WEEK, 4);
		if (i==7) {  // 若是星期日则星期减一
			productCal.add(Calendar.WEEK_OF_YEAR, -1);
		}
		//商品的促销日
		System.out.println("该商品的促销日为:");
		System.out.println(sdf.format(productCal.getTime()));
	}
}
