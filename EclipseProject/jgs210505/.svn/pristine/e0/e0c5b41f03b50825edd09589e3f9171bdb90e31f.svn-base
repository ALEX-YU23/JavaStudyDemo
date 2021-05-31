package org.jgs.collection.day05;

import java.math.BigDecimal;

import org.junit.Test;

/*
 * 包装类中的自动拆箱和自动装箱

 */
public class BZDemo {
	
	@Test
	public  void test01() {
		Integer i = 1;  //自动装箱
		Integer val1 = Integer.valueOf(1);
		
		int c = i; //自动拆箱
		int intValue = i.intValue();

	}
	
	
	@Test
	public  void test02() {//BigDecimal 的使用
		
		//创建对象1
		BigDecimal big1 = new BigDecimal("1");  //需要传递字符串类型的数值
		BigDecimal big2 = new BigDecimal("0.7");
		
		BigDecimal subtract = big1.subtract(big2);
		System.out.println(subtract);
		
		//创建对象2  推荐
		BigDecimal val1 = BigDecimal.valueOf(1);
		BigDecimal val2 = BigDecimal.valueOf(0.7);
		
		BigDecimal subtract2 = val1.subtract(val2);
		System.out.println(subtract2);
		
		BigDecimal add = val1.add(val2);
		System.out.println(add);
		
		BigDecimal multiply = val1.multiply(val2);
		System.out.println(multiply);
		//divide(需要操作的数字,保留的小数位,设置数字的保留规则)
		BigDecimal divide = val1.divide(val2,2,BigDecimal.ROUND_HALF_DOWN);
		System.out.println(divide);

	}

}
