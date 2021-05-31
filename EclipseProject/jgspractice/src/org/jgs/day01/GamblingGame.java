package org.jgs.day01;

import java.util.Scanner;

public class GamblingGame {

	public static void main(String[] args) {

		int dice1 = (int) ((Math.random()+1) * 3);
		int dice2 = (int) ((Math.random()+1) * 3);
		int dice3 = (int) ((Math.random()+1) * 3);

		int count = dice1 + dice2 + dice3;

		

		System.out.print("1.押大\t");
		System.out.print("2.押小\t");
		System.out.println("3.押豹子");

		System.out.print("请输入对应数字：");
		Scanner scan = new Scanner(System.in);
		int chioce = scan.nextInt();

		switch (chioce) {
		case 1:
			if (count > 9) {
				System.out.println("押中大了");
			} else {
				System.out.println("押大没中");
			}
			break;
		case 2:
			if (count <= 9) {
				System.out.println("押中小了");
			} else {
				System.out.println("押小没中");
			}
			break;
		case 3:
			if (dice1 == dice2&&dice2 == dice3) {
				System.out.println("押中豹子了");
			} else {
				System.out.println("押豹子没中");
			}
			break;
		default:
			System.out.println("请输入正确的数字");
		}
		
		
		System.out.print(dice1 + "," + dice2 + "," + dice3);
		
		if (count > 9) {
			System.out.println("\t大");
		}else if (count <= 9) {
			System.out.println("\t小");
		}else if (dice1 == dice2&&dice2 == dice3) {
			System.out.println("\t豹子");
		}
	}

}
