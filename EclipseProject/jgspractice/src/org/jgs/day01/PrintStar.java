package org.jgs.day01;

public class PrintStar {
	public static void main(String[] args){

		for (int i = 1; i < 7; i++) {
			for(int j = 6; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
