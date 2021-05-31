package org.jgs.carrentsystem;

import java.util.Arrays;

public class Test {

	public static void del(int[] arr) {
		arr[arr.length-1]=0;
	}
	
	@org.junit.Test
	public void test01() {
		int[] arr = {1,2,3,4};
		del(arr);
		System.out.println(Arrays.toString(arr));
	}

}
