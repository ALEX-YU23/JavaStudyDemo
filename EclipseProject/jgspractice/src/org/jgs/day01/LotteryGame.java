package org.jgs.day01;

import java.util.Scanner;

public class LotteryGame {
	
	public static byte[] split(byte num) {
		
		byte hight = (byte)(num/10);
		byte low = (byte)(num%10);
		
		byte[] nums = new byte[2];
		nums[0] = hight;
		nums[1] = low;
		
		return nums;
		
		
		
	}

	public static void main(String[] args) {

		byte luckNum = (byte)(Math.random()*90+10);
		
//		System.out.println(luckNum);
		
		Scanner scan = new Scanner(System.in);
		
		byte userNum = scan.nextByte();
		
		
		/*
		 * System.out.println(luckNum); System.out.println(userNum);
		 */
		
		byte[] luckNums = split(luckNum);
		
		byte[] userNums = split(userNum);
//		System.out.println(userNums[0]+","+userNums[1]);
		
		if(luckNum == userNum) {
			System.out.println("奖金10000美金");
		}else if(luckNums[0] == userNums[1] && luckNums[1] == userNums[0]) {
			System.out.println("奖金3000美金");
		}else if (luckNums[0] == userNums[0] || luckNums[1] == userNums[1]) {
			System.out.println("奖金1000美金");
		}else if (luckNums[0] == userNums[1] || luckNums[1] == userNums[0]) {
			System.out.println("奖金500美金");
		}else {
			System.out.println("谢谢惠顾");
		}
		System.out.println("中奖号码是："+luckNum);
	}

}
