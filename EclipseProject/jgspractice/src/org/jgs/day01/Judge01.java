package org.jgs.day01;

import java.util.Scanner;

/*
 * 要求用户输入两个数a和b，如果a能被b整除或者a加b大于1000，则输出a；否则输出b。
 * */
public class Judge01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		Double b = scan.nextDouble();
		
		if(a % b == 0||(a+b)>1000) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
	}

}
