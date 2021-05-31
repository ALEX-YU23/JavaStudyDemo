package org.jgs.Test01;

/**
 * @Description :5.要求用100元买100只鸡，其中公鸡五元一只，母鸡三元一只，
 *				小鸡1元三只，规定每种至少买一只，求购买方案
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月2日上午9:49:48
 */
public class LoopTest05 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 20; i++) {
			for (int j = 1; j < 34; j++) {
				for (int k = 1; k < 99; k++) {
					if (k%3==0) {
						if (((i+j+k)==100)&&(5*i+3*j+k/3==100)) {
							System.out.println("公鸡买"+ i +"只");
							System.out.println("母鸡买"+ j +"只");
							System.out.println("小鸡买"+ k +"只");
							System.out.println();
							break;
							}
					}
					
				}
			}
		}

	}

}
