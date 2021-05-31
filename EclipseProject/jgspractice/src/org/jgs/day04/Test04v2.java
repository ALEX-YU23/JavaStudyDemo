package org.jgs.day04;

/**
 * @Description : 
 * 4.鸡兔同笼  一共50只 ，脚160 ，求鸡多少只 ，兔子多少只！
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年3月31日下午6:15:55
 */
public class Test04v2 {

	public static void main(String[] args) {
		
//		int chicken = 0, rabbit = 0;
		for(int i=1;i<40;i++){
			if((i*4)+(50-i)*2==160){
				System.out.println("兔子有"+i+"只");
				System.out.println("鸡有"+(50-i)+"只");
				break;
		
			}
		}

	}
}

