package org.jgs.day01;

import java.util.Random;
import java.util.Scanner;

/**
 * @author AlexYU
 * @version 1.0
 * 
 * 猜数字游戏
 * 随机生成一个100以内的数，然后让用户从键盘输入数，如果大了提示大了，如果小了提示小了，如果猜对了，就不再猜了
 * 并统计猜了多少次
 * */
public class GuessTheNumber {
	public static void main(String[] args) {
		//随机生成一个100以内的数字
		 Random rand = new Random();
		 int num = rand.nextInt(100);
		 Scanner scan = new Scanner(System.in);
		 int total   = 1;
		 while(true){
			 

			 //从键盘输入一个100以内数字
			 int userNum = scan.nextInt();
			 
			 
			 if(userNum>num) {
				 System.out.println("大了");
			 }else if(userNum<num) {
				 System.out.println("小了");
			 }else {
				 System.out.println("猜对了");
				 break;
			 }
			 total++;
		 }
		 System.out.println("猜了"+total+"次");
		
		
	}
}
