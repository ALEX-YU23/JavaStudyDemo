package org.jgs.test02;

public class Test{
	@org.junit.Test
	public void test() {
		
		Father father = new Father();
		Animal a1 = father;
		a1.eat();
		System.out.println(new Father() == new Father());
	}
}