package org.jgs.day04;

/**
 * @Description : 
 * 4.鸡兔同笼  一共50只 ，脚160 ，求鸡多少只 ，兔子多少只！
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年3月31日下午6:15:55
 */
public class Test04 {

	public static void main(String[] args) {
		
//		int chicken = 0, rabbit = 0;
		for (int chicken = 1; chicken < 50; chicken++) {
			for (int rabbit = 1; rabbit < 50; rabbit++) {
				if (chicken + rabbit == 50 && 2*chicken+4*rabbit==160) {
					System.out.println("鸡"+chicken+"只 ，兔子"+rabbit+"只！");
				}
			}
		}
		
		
		

	}

}
