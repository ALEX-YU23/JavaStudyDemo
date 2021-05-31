package org.jgs.day05;
/*
 * 要求用100元买100只鸡，其中公鸡五元一只，母鸡三元一只,小鸡1元三只，
 * 规定每种至少买一只，求购买方案
 */
public class Test05 {

	public static void main(String[] args) {
		//控制公鸡只数
		for (int i = 1; i < 20; i++) {
			//控制母鸡只数
			for (int j = 1; j < 34; j++) {
				//控制小鸡只数
				for (int k = 0; k < 98; k++) {
					if (k%3==0) {
						if (((i+j+k)==100)&&((i*5+j*3+k/3)==100)) {	
							
							System.out.println("购买公鸡的个数："+i+"只");
							System.out.println("购买母鸡的个数："+j+"只");
							System.out.println("购买小鸡的个数："+k+"只");
							
						}
					}
				}
				
			}	
		}
		

	}

}
