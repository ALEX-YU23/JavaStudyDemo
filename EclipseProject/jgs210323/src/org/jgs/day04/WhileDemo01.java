package org.jgs.day04;

import java.util.Scanner;

/*
 * 
 * 猜数字小游戏  用户猜数字 猜不对 一直猜  输入0结束循环
 * 
 *  已知循环次数
 * for (int i = 0; i <100; i++) {
			
	}
	
	while(判定条件){
		//代码块
	}
	条件为true时 执行语句块
	
	执行的次数  有可能一次不执行
 * 
 */
public class WhileDemo01 {

	public static void main(String[] args) {
		
		int num =100;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您猜的数字：");
		int guessNum = scanner.nextInt();
		
		boolean flag = true;
		
		while(guessNum!=num) {
			
			if (guessNum==0) {
				flag = false;
				break;
			}
			//提示用户数字的大小
			if (guessNum>num) {
				System.out.println("数字猜大了");
			}else{
				System.out.println("数字猜小了");
			}
			System.out.println("请继续输入您猜的数字：");
			guessNum = scanner.nextInt();
			
		}
		
		if (flag) {
			System.out.println("恭喜你猜对了");
		}else {
			System.out.println("谢谢参与！");
		}
		
		
		
		
		

	}

}
