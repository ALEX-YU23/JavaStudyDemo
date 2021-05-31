package org.jgs.carrentsysv2;

import java.util.Scanner;

import org.junit.Test;

public class TestRentSys {

	@Test
	public void user() {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*******欢迎使用老司机租车系统******");
		System.out.println("\t  1.租赁车辆");
		System.out.println("\t  2.查看订单");
		System.out.println("\t  3.归还车辆");
		System.out.println("\t  4.删除订单");
		System.out.println("\t  5.查看余额");
		System.out.println("\t  6.退出系统");
		
		System.out.print("请选择：");
		
		int choice = PrintUtil.scanCheck(sc);
		
		
		switch (choice) {
		case 1:
			System.out.println("*******租赁车辆*******");
			break;
		case 2:
			System.out.println("*******查看订单*******");
			break;
		case 3:
			System.out.println("*******归还车辆*******");
			break;
		case 4:
			System.out.println("*******删除订单*******");
			break;
		case 5:
			System.out.println("*******查看余额*******");
			break;
		case 6:
			System.out.println("*******退出系统*******");
			break;

		default:
			break;
		}
		
	}

}
