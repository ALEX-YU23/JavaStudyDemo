package org.jgs.day01;

import java.util.Scanner;

public class Judge02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		if(score >= 90) {
			System.out.println("等级：A");
		}else if(score >= 70) {
			System.out.println("等级：B");
		}else if(score >= 60) {
			System.out.println("等级：C");
		}else if(score < 60) {
			System.out.println("等级：D");
		}
		
		
		
	}
}
