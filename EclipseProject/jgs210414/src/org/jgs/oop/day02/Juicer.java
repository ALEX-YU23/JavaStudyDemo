package org.jgs.oop.day02;
/**
 * 榨汁机
 * 品牌
 * 榨汁
 * 方法的语法：
 * 权限修饰符  返回值类型  方法名称 (参数列表){方法体}
 * @author mosin
 * @DATE 2021年4月15日
 */
public class Juicer {
	//品牌
	public String brand;
	
	//榨汁  携带参数  参数类型  参数名称    String fruit  形式参数
	public void juice(String fruit,int cup) {
		System.out.println(fruit+"汁 "+ cup+"杯");
	}
	/**
	 * juice方法构成了方法的重载
	 * 条件：
	 * 1.在同一个类中
	 * 2.方法名相同  参数列表不同  (参数数量不同 参数的顺序不同  参数类型不同)
	 * 3.与返回值以及修饰符无关
	 * @param fruit
	 */
	public void juice(String fruit) {
		System.out.println(fruit+"汁 ");
	}
	
	void juice(int cup,String fruit) {
		System.out.println(fruit+"汁 "+ cup+"杯");
	}
	
	
}
