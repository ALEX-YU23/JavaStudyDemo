package org.javaweb.util;
/**
 * 统计网站访问人数类
 * @author AlexYU
 *
 */
public final class CountUtil {

	private static long count;
	
	private CountUtil() {}
	
	public static synchronized void add() {
		count++;
	}
	
	public static synchronized void sub() {
		count--;
	}
	
	public static synchronized long getCount() {
		return count;
		
	}
}
