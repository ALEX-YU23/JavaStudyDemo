package org.jgs.javaioexer2;

import org.junit.Test;

public class KeyBoardTest {

	@Test
	public void test(){
		
		KeyBoard keyBoard = new KeyBoard();
		System.out.println("请输入一个整数:");
		System.out.println(keyBoard.inputInt());
		
		System.out.println("请输入一个String:");
		System.out.println(keyBoard.input());
		
		keyBoard.close();
		
	}

}
