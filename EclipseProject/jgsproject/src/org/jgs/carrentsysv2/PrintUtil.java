package org.jgs.carrentsysv2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintUtil {
	
	
	/**
	 * 
	 * (1-6)
	 * 输入错误时打印提示语
	 * param:扫描器
	 */ 
	public static int scanCheck(Scanner scan) {
		int type = 0;
		try {
			type = scan.nextInt();
			while (type!=1&&type!=2&&type!=3&&type!=4&&type!=5&&type!=6) {
				System.out.print("您的输入有误,请重新输入:");
				type = scan.nextInt();
			}
			return type;
		} catch (InputMismatchException e) {
			System.err.println("您输入的不是数字，系统自动退出！！！！");
			System.exit(0);
		}
		
		return 0;
		
	}

	
	
	
	
}
