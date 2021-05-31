package org.jgs.day03;


/**
 * for循环
 * 语法结构
 * for(初始化变量;条件表达式;改变变量的值){
 * 
 * 		//循环体
 * 
 * }
 * 
 * 初始化变量：计数器
 * 条件表达式：是否结束循环
 * 改变变量的值：改变变量的初始值
 * 
 * 流程：
 * 
 * for (;;) {
			System.out.println("hello");
		}
 * for (int i = 0;;i++ ) {
			System.out.println("hello");
		}
	for (int i = 0;i<10; ) {
		System.out.println("hello");
	}
	
	以上三种形式 会进入死循环
 * 
 * int i = 0;
 * for (;i<10;i++ ) {
		System.out.println("hello");
	}
	正常执行
 * @author mosin
 * @DATE 2021年3月31日
 */
public class ForDemo01 {

	public static void main(String[] args) {
		
		//打印3次hello
//		for (int i = 0;i<10;i++) {
//			System.out.println("hello");
//		}
		
		//打印9*9乘法表
		//外层循环控制行数
		for (int i = 1; i <10; i++) {
			//内层循环控制每行打印的次数
			for (int j = 1; j <=i; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}

}
