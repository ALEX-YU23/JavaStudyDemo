package org.jgs.day01;

public class NarcissusNum {

	public static void main(String[] args) {
		
		int a,b,c;
		
		for (int i = 100; i < 1000; i++) {
			
			a = i/100;
			b = (i-a*100)/10;
			c = i%10;
			
			if(i==Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3)) {
				System.out.println(i);
			}
			
		}

	}

}
