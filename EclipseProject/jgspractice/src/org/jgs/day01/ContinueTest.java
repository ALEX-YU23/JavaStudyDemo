package org.jgs.day01;

import java.util.Iterator;

/**
 * @author AlexYU
 * @version
 * 
 * 
 * 打印 1-100 之间数 ，其中3、5、7的倍数不打印（continue）
 * 
 * 
 * */



public class ContinueTest {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			if(i%3==0||i%5==0||i%7==0) {
				continue;
			}else {
				System.out.println(i);
			}
		}
		
		
		

	}

}
