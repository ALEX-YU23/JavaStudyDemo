package org.jgs.array;

import java.util.Arrays;

import javax.security.auth.x500.X500Principal;

public class ArrayDemo03 {

	public static void main(String[] args) {
		
		int [] nums = new int [] {12,1,32,21,65,24,23,56,2};
		
		System.out.println(Arrays.toString(nums));
		
//		Arrays.stream(nums).forEach(x -> System.out.println(x));
		
//		Arrays.stream(nums).forEach(x -> {
//			x+=9;
//			System.out.println(x);
//		});
		
		Arrays.stream(nums).filter(x -> x>18).forEach(x -> System.out.println(x));;

	}

}
