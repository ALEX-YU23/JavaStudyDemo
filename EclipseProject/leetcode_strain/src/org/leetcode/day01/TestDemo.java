package org.leetcode.day01;

import org.junit.Test;

public class TestDemo {

	@Test
	public void TestSolution1011() {
		
		int weights[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int D = 5;
		
		
		int s =Solution1011.shipWithinDays(weights, D);
		System.out.println(s);
	}
}
