package org.jgs.test02;

public abstract class Animal {
	private int s;
	public int getS() {
		return s;
	}
	public abstract void setS(int s) ;
	public void eat() {
		
		System.out.println("生着吃");

	}
}

class Father extends Animal{
	public void eat() {
		
		System.out.println("吃馒头");

	}

	@Override
	public void setS(int s) {
		
	}
}
class Son extends Father{
	public void eat() {
		
		System.out.println("吃面包");

	}
}

