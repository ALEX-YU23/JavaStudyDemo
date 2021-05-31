package org.jgs.collection.day04;

import org.junit.Test;

/*
 * 测试坐标点
 */
public class TestPoint {
	@Test
	public void test01() {
		
		//Point point = new Point(1, 2);  // "一","二"
		
//		Point<String> point = new Point<>();
		
//		point.setX("1");
//		point.setY("2");
		
		
//		Point<Integer> point2 = new Point<Integer>(3, 4);
//		
//		System.out.println(point2.getX());
//		System.out.println(point2.getY());
		
		
		Point<Integer, String> point = new Point<Integer, String>(1, "二");
		System.out.println(point.getY());
		System.out.println(point.getX());
		
		
	}

}
