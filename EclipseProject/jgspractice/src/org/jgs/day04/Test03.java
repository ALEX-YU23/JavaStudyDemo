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
public class Test03 {

	public static void main(String[] args) {
		// a:甲;b:乙;c:丙;d:丁;
		int a = 0,b = 0,c = 0,d = 0;
		for (a = 0; a < 370; a++) {
			for (b = 0; b < 370; b++) {
				for (c = 0; c < 370; c++) {
					for (d = 0; d < 370; d++) {
						//  a+10==b-20==c*2==d/2
						if(a+b+c+d==370&&a+10==b-20&&c*2==d/2&&b-20==c*2) {
							System.out.println(a+","+b+","+c+","+d+"\n");
						}
						
					}
					
				}
				
			}
			
		}
		

	}

}
