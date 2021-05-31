package org.jgs.day03;

import java.util.Scanner;

/**
 * @Description:根据性别和体重计算输血量。女性体重不超过50kg的输血量为200毫升，否则250毫升；
 * 				男性不超过60kg的输血量为250毫升，否则300毫升
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年3月30日下午7:53:14
 */
public class BloodTransfusionVolume {

	public static void main(String[] args) {
		
		// 从键盘扫描输入
		Scanner scan = new Scanner(System.in);
		// 输入性别
		System.out.println("请输入你的性别（男/女）：");
		String gender = scan.next();
		// 输入体重
		System.out.println("请输入你的体重：");
		double weight = scan.nextDouble();
		switch (gender) {
		case "男":
			if (weight<60) {
				System.out.println("输血量为250毫升");
			}else {
				System.out.println("输血量为300毫升");
			}
			break;
		case "女":
			if (weight<50) {
				System.out.println("输血量为200毫升");
			}else {
				System.out.println("输血量为250毫升");
			}
			break;
		default:
			System.out.println("请输入正确的");
			break;
		}

	}

}
