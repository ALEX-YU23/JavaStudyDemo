package org.jgs.day03;



/**
 * break 和 continue 关键字的使用
 * break：结束循环       结束整个循环  离break最近的一个for循环
 * continue：结束循环    结束本次循环  进入下一次循环
 * @author mosin
 * @DATE 2021年3月31日
 */
public class ForDemo02 {

	public static void main(String[] args) {
		
		for (int i = 1; i <100; i++) {
			for (int j =1; j < 100; j++) {
				if (j%10==0) {
					break;
					//continue;
				}
				System.out.println(j);
			}
		}
	}
}
