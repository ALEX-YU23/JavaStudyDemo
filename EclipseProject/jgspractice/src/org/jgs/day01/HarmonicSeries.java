package org.jgs.day01;

/*
 * 
 * 求调和级数中从第多少项开始大于10
 * 
 * */


public class HarmonicSeries {

	public static void main(String[] args) {
		
		double i = 1,j = 0,count=0;
		
		while(count<10) {
			
			count+=1/i;
			i++;
		}
		System.out.println("从第"+i+"项开始大于10"+"此时count为："+count);
		
		

	}

}
