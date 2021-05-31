package org.jgs.demo01;
/**
 * 
 * @author mosin
 * @DATE 2021年3月24日
   @version 1.0
   银行存储1000元 利率5% 一年以后的本息和
 */
public class Demo01 {

	/*
	 * 变量命名的规则
	 * 1.26个字母 数字 0-9 下划线_ 美元$   （￥ 中文 不推荐）
	 * 2.不能以数字开头
	 * 3.不能使用关键字和保留字
	 * 4.见名知意  age 
	 * 5.驼峰命名法  小驼峰   首字母小写 myName  name
	 * 
	 * 类名的规则 可以参照变量名的规则 但是类名使用大驼峰命名法
	 * 大驼峰:单词的首字母全部大写
	 */
	public static void main(String[] args) {
		
//		//声明变量
//		int money;
//		double rate;
//		double result;
//		//赋值
//		money = 1000;
//		rate=0.05;
		
		//变量声明的第二种方式
		int money = 1000;
//		int ￥ = 1000;
		double rate = 0.05;
		double result = money*(1+rate);
		//输出结果
		System.out.println(result);
		

	}

}
