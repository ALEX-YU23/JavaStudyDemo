package org.jgs.day04;

/**
 * @Description :3.甲乙丙丁加工零件，加工的总数是370 
					如果甲加工的零件数多10
					如果乙加工的零件数少20
					如果丙加工的零件数乘以2
					如果丁加工的零件数除以2
					四个人的加工数量相等，求甲乙丙丁各自加工多少个零件
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年3月31日下午5:28:36
 */
public class Test03v1 {

	public static void main(String[] args) {
		int i;
		for (i=0; i < 370; i++) {
			if ((i-10)+(i+20)+(i/2)+(i*2)==370) {
				System.out.println(i);
				break;
			}
		}
		
		System.out.println("甲加工的零件数"+(i-10));
		System.out.println("乙加工的零件数"+(i+20));
		System.out.println("丙加工的零件数"+(i/2));
		System.out.println("丁加工的零件数"+(i*2));
	}
}
