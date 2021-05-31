package org.jgs.day03;

import java.util.Scanner;

/*
 * 根据性别和体重计算输血量。女性体重不超过50kg的输血量为200毫升，
 * 否则250毫升；男性不超过60kg的输血量为250毫升，否则300毫升
 */
public class Test03 {

	public static void main(String[] args) {
		
		//创建扫描器
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入您的性别：");
		String sex = scan.next();
		System.out.println("请输入您体重：");
		double weight = scan.nextDouble();
		
		//判定性别
		if("男".equals(sex)) {
			//判定体重
			if(weight>60) {
				System.out.println("300ml");
			}else {
				System.out.println("250ml");
			}
		}else{
			//判定体重
			if(weight>50) {
				System.out.println("250ml");
			}else {
				System.out.println("200ml");
			}
		}
		
		
		

	}

}
