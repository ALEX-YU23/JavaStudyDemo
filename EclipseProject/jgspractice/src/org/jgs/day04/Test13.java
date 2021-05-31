package org.jgs.day04;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		
		int count = 0, i;
		
		for (i = 1; i < 101; i++) {
			count += i;
			
		}
		System.out.println(count);
		
		count = 0;
		i = 1;
		while (i < 101) {
			count+=i;
			i++;
		}
		System.out.println(count);
		
		
		count = 0;
		i = 1;
		do {
			count+=i;
			i++;
		} while (i < 101);

		System.out.println(count);
	}

}
