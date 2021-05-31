package org.jgs.javahigh05;

import java.util.Scanner;

import org.junit.Test;

public class Work01 {

	public static Scanner scan = new Scanner(System.in);
	@Test
	public void test01() {
		while (true) {
			
			printPlan();
		}
		
	}
	/**
	 * 案例1：根据星期几，给出工作计划  valueOf()	将普通字符串转换为枚举实例
	 * @Description
	 * @author AlexYU 
	 * @date 2021年5月13日下午6:28:29
	 */
	public static void printPlan() {
		
		System.out.println("请输入星期几（如:1）：");
		
		String weekday = scan.next();
		WeekDayEnum weekDayE = WeekDayEnum.valueOf(weekday);
		
		System.out.println(weekDayE+":"+weekDayE.getPlan());
//		switch (weekDayE) {
//		case 星期日:
//			System.out.println(weekDayE+":"+weekDayE.getPlan());
//			break;
//		case 星期一:
//			System.out.println(weekDayE+":"+weekDayE.getPlan());
//			break;
//		case 星期二:
//			System.out.println(weekDayE+":"+weekDayE.getPlan());
//			break;
//		case 星期三:
//			System.out.println(weekDayE+":"+weekDayE.getPlan());
//			break;
//		case 星期四:
//			System.out.println(weekDayE+":"+weekDayE.getPlan());
//			break;
//		case 星期五:
//			System.out.println(weekDayE+":"+weekDayE.getPlan());
//			break;
//		case 星期六:
//			System.out.println(weekDayE+":"+weekDayE.getPlan());
//			break;
//
//		default:
//			break;
//		}
		
		
	}
	@Test
	public void test02() {
		while (true) {
			System.out.println("请输入星期几（如:星期二）：");
			
			WeekDayEnum2 weekDayE = WeekDayEnum2.valueOf(scan.next());
			
			switch (weekDayE) {
			case 星期日:
				System.out.println(weekDayE+":找对象玩");
				break;
			case 星期一:
				System.out.println(weekDayE+":学java");
				break;
			case 星期二:
				System.out.println(weekDayE+":学js");
				break;
			case 星期三:
				System.out.println(weekDayE+":学C#");
				break;
			case 星期四:
				System.out.println(weekDayE+":学设计模式");
				break;
			case 星期五:
				System.out.println(weekDayE+":学数据结构");
				break;
			case 星期六:
				System.out.println(weekDayE+":休息");
				break;
			}
		}
	}
	@Test
	public void test03() {
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入星期几（如:1）：");
			int weekday = scan.nextInt();
			
			WeekDayEnum.printPlan(weekday);
		}

	}

}
