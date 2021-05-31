package org.jgs.day01;

import java.util.Scanner;

public class ZodiacIssues {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = scan.nextInt();
		
		int zodiac = year % 12;
		
		switch(zodiac) {
		case 1:
			System.out.println(year+"年："+"鸡");
			break;
			
		case 2:
			System.out.println(year+"年："+"狗");
			break;
			
		case 3:
			System.out.println(year+"年："+"猪");
			break;

		case 4:
			System.out.println(year+"年："+"鼠");
			break;
			
		case 5:
			System.out.println(year+"年："+"牛");
			break;

		case 6:
			System.out.println(year+"年："+"虎");
			break;

		case 7:
			System.out.println(year+"年："+"兔");
			break;

		case 8:
			System.out.println(year+"年："+"龙");
			break;

		case 9:
			System.out.println(year+"年："+"蛇");
			break;
			
		case 10:
			System.out.println(year+"年："+"马");
			break;

		case 11:
			System.out.println(year+"年："+"羊");
			break;

		case 0:
			System.out.println(year+"年："+"猴");
			break;
		
		default:
			System.out.println("程序错误");
		}
		
		
		
		
		
		
		

	}

}
