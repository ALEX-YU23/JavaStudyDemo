package org.jgs.day01;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char username = scan.next().charAt(0);
		int  password = scan.nextInt();
		
		if(username=='青'&&password==12345) {
			System.out.println("欢迎你，青");
		}else {
			System.out.print("对不起，你不是青");
		}
		
		
		
		
	}

}
