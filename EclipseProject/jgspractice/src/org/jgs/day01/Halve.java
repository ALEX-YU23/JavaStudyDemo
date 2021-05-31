package org.jgs.day01;

import java.util.Scanner;

public class Halve {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int rope = scan.nextInt();
		int day = 0;
		
		while(rope>5) {
			rope/=2;
			System.out.println(rope);
			day++;
		}
		System.out.println(day);
		

	}

}
