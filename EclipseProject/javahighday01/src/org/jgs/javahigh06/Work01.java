package org.jgs.javahigh06;

import org.junit.Test;
/**
 * 案例2：java学习阶段定义枚举：L1，L2，L3，分别表示第1，2，3个阶段，输出每个阶段的学习目标，
 * @Description
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年5月13日下午7:07:30
 */
public class Work01 {

	@Test
	public void test() {
		for (int i = 0; i < StudyPlan.values().length; i++) {
			System.out.println(StudyPlan.values()[i]+":"+StudyPlan.values()[i].getPhase());
		}
	}

	@Test
	public void test01() {
		 Integer x =Integer.valueOf(9);
         Double c = Double.valueOf(5);
         Float a = Float.valueOf("80");              

         Integer b = Integer.valueOf("245666",36);   // 使用 36 进制

         System.out.println(x);
         System.out.println(c);
         System.out.println(a);
         System.out.println(b);
	}
	
}
