package org.jgs.day05;

public class TestCal {

	public static void main(String[] args) {
		
		int a = 100,b = 20;
		double q = 2.1,w = 7.9;
		long l = 888800l;
		float f = 23.90f;
		
		Calculator cal = new Calculator();
		
		System.out.println("a+b="+cal.add(a, b));
		System.out.println("a-b="+cal.reduce(a, b));
		System.out.println("q+w="+cal.add(q, w));
		System.out.println("a+l+f="+cal.add(a, l, f));
		
		
	}

}
