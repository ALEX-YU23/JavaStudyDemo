package org.jgs.apidemo.day01;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * 日期转换工具类
 * 
 * 工具类一般都是被final所修饰的  不能被其他的类继承，保证了方法的唯一性
 * 工具类中的方法一般都是静态的   方便调用
 * @author mosin
 * @DATE 2021年5月21日
 */
public final class MyUtil {

	//Date -> LocalDateTime
	public static LocalDateTime  dateToLocalDateTime(Date date) {
		
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}
	
	// LocalDateTime -> Date 
	public static Date localDateTimeToDate(LocalDateTime localDateTime) {
	
		return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
		
	}
	
	
	
}
