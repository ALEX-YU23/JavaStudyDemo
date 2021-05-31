package org.jgs.day04;
/*
 * 输出1000以内的水仙花数
 * 如果一个三位数 abc=a*a*a+b*b*b+c*c*c 则该数字是一个水仙花数
 */
public class Test07 {

	public static void main(String[] args) {
		//生成1000以内的数字
		for (int i = 100; i < 1000; i++) {
			
			//获取个位数字
			int gw = i%10;
			//获取十位数字
			int sw = (i/10)%10;
			//获取百位数字
			int bw = i/100;
			
			//判定是不是水仙花数
			if (((gw*gw*gw)+(sw*sw*sw)+(bw*bw*bw))==i) {
				System.out.println(i);
			}
		}
	}

}
