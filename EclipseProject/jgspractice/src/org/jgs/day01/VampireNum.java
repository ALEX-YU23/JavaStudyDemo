package org.jgs.day01;

import java.util.Arrays;

public class VampireNum {

	public static void main(String[] args) {

		
		lab:for (int i = 1000; i < 10000; i++) {
			
			if(i%100==0) {
				continue;
			}
			
			for (int j = 10; j < 100; j++) {
				for (int j2 = 10; j2 < 100; j2++) {
					if(i==j*j2) {
						
						String[] a = String.valueOf(i).split("");           //将x拆分成String数组
						String[] b = String.valueOf(j+""+j2).split(""); //将y+z 拆分成String[],注意拼接时的""要放中间
						
						Arrays.sort(a);                                    //这次用数据的工具排序，
						Arrays.sort(b);                                    //这次用数据的工具排序，
						 if(Arrays.equals(a, b)){
							 System.out.println(i);
							 continue lab;            //去除重复项
						 }

					}
				}
			}
			
			
//			String strNum = Integer.toString(i);
			
//			f
			/*
			 * thousand = i/1000; hundred = (i-thousand*1000)/100; ten = (i%100)/10; one =
			 * i%1000;
			 */
			
			
			
			
//			System.out.print(strNum.charAt(0));
//			System.out.print(strNum.charAt(1));
//			System.out.print(strNum.charAt(2));
//			System.out.print(strNum.charAt(3));
//			System.out.println();
		}
		
		
		
		

	}

}
