package org.jgs.day01;

import java.util.Scanner;

public class WhatSeason {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		int month = scan.nextInt();
		
		if(month==3|month==4|month==5) {
			System.out.println(month+"月是春季！");
		}else if(month==6|month==7|month==8) {
			System.out.println(month+"月是夏季！");
		}else if(month==8|month==9|month==10) {
			System.out.println(month+"月是秋季！");
		}else if(month==11|month==12|month==1) {
			System.out.println(month+"月是冬季！");
		}else {
			System.out.println(month+"月不是正确的月份！");
		}

	}

}
