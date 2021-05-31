package org.jgs.javaioexer2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyBoard {

	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public int inputInt(){
		Integer integer = 0;
		try {
			integer = Integer.valueOf(in.readLine());
		} catch (NumberFormatException e) {
			System.err.println("输入的不是整数,系统退出");
			System.exit(0);
		} catch (IOException e) {
			System.err.println("IO异常!");
			System.exit(0);
		}
		return integer;
	}
	
	public Byte inputByte(){
		Byte b = 0;
		try {
			b = Byte.valueOf(in.readLine());
		} catch (NumberFormatException e) {
			System.err.println("输入的不是整数,系统退出");
			System.exit(0);
		} catch (IOException e) {
			System.err.println("IO异常!");
			System.exit(0);
		}
		return b;
	}
	
	public char inputChar(){
		char ch = 0;
		try {
			ch = (char) in.read();
		} catch (NumberFormatException e) {
			System.err.println("输入的不是整数,系统退出");
			System.exit(0);
		} catch (IOException e) {
			System.err.println("IO异常!");
			System.exit(0);
		}
		return ch;
	}
	
	public Short inputShort(){
		Short s = 0;
		try {
			s = Short.valueOf(in.readLine());
		} catch (NumberFormatException e) {
			System.err.println("输入的不是整数,系统退出");
			System.exit(0);
		} catch (IOException e) {
			System.err.println("IO异常!");
			System.exit(0);
		}
		return s;
	}
	
	public Long inputLong(){
		Long l = 0l;
		try {
			l = Long.valueOf(in.readLine());
		} catch (NumberFormatException e) {
			System.err.println("输入的不是整数,系统退出");
			System.exit(0);
		} catch (IOException e) {
			System.err.println("IO异常!");
			System.exit(0);
		}
		return l;
	}
	
	public Float inputFloat(){
		Float f = 0f;
		try {
			f = Float.valueOf(in.readLine());
		} catch (NumberFormatException e) {
			System.err.println("输入的不是整数,系统退出");
			System.exit(0);
		} catch (IOException e) {
			System.err.println("IO异常!");
			System.exit(0);
		}
		return f;
	}
	
	public Double inputDouble(){
		Double d = 0d;
		try {
			d = Double.valueOf(in.readLine());
		} catch (NumberFormatException e) {
			System.err.println("输入的不是整数,系统退出");
			System.exit(0);
		} catch (IOException e) {
			System.err.println("IO异常!");
			System.exit(0);
		}
		return d;
	}
	
	public String input(){
		String str = null;
		try {
			str = in.readLine();
		} catch (NumberFormatException e) {
			System.err.println("输入的不是整数,系统退出");
			System.exit(0);
		} catch (IOException e) {
			System.err.println("IO异常!");
			System.exit(0);
		}
		return str;
	}
	
	public void close() {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
