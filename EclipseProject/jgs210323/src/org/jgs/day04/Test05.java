package org.jgs.day04;
/*
 * 输出100以内的素数，素数是只能被1和自身整除的数
 */
public class Test05 {

	public static void main(String[] args) {
		
		//得到100以内的数字
		for (int i = 2; i <100; i++) {
			//生成的每一个除数
			boolean flag = true;
			for (int j =2; j <i; j++) {
				
				if(i%j==0) {
					flag = false;
					break;
				}
				
			}
			if(flag) {
				System.out.println(i);
			}
			
			
			
		}
		
	}

}
