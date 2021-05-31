package org.jgs.classpratice;

import java.util.Scanner;

/**
 * @Description : 抢30游戏
 * 				从 1开始报数（必须连着报）可以报 1 或者1 2
 * 				如果第一个人报1 第二个人可以报2或者2 3
 * 				。。。。。。
 * 				到最后报到30就结束
 * 				并输出 赢家
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月2日下午2:49:17
 */
public class Game01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num=0,count=0;
		do {
			
			System.out.println("请玩家输入：");
			num = scan.nextInt();
			System.out.println("count="+count);
			System.out.println("num="+num);
			String numString =  String.valueOf(num);
			int numLen = numString.length();
			switch (numLen) {
			case 1:
//				if (count!=1&&num!=count) {
//					System.out.println("请玩家输入"+num+"的下一位数字"+(num+1));
//				}
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;

			default:
				break;
			}
			
			count = num;
			
			
		} while (num!=30);
		
		
		
		
		
		
	}

}
