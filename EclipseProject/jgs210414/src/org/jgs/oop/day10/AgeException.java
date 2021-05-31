package org.jgs.oop.day10;
/*
 * 自定义异常  继承 Exception
 */
public class AgeException extends Exception{
	
	public AgeException(String msg) {
		super(msg);
	}

}
