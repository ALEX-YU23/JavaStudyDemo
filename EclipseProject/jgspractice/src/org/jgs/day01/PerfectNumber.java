package org.jgs.day01;

public class PerfectNumber {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1;i < 100; i++) {
			for(int j = 1;j < i; j++) {
				if(i % j == 0) {
					sum += j;
//					System.out.println(sum);
				}
				
			}
			if(sum == i) {
				System.out.println(i);
			}
			sum = 0;
		}

	}

}
