package org.jgs.day04;
/*
 * 
 甲乙丙丁加工零件，加工的总数是370， 如果甲加工的零件数多10，如果乙加工的零件数少20
如果丙加工的零件数乘以2，如果丁加工的零件数除以2，四个人的加工数量相等，
求甲乙丙丁各自加工多少个零件

思路：
	1.假设加工数量相等时为 x
	2.每个工人的加工数量  甲 x-10  乙 x+20 丙 x/2 丁 x*2
	3.加工的总数是370
 */
public class Test03 {

	public static void main(String[] args) {
		
		for (int i =1; i <370; i++) {
			
			if(((i-10)+(i+20)+(i/2)+(i*2))==370) {
				System.out.println("甲加工的数量是:"+(i-10));
				System.out.println("乙加工的数量是:"+(i+20));
				System.out.println("丙加工的数量是:"+(i/2));
				System.out.println("丁加工的数量是:"+(i*2));
			}
			
		}

	}

}
