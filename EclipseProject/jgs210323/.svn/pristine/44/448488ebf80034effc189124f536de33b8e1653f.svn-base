package org.jgs.day03;

import java.util.Scanner;

/**
 * 多分支结构
 * 语法：  条件表达式1  最终结果要是布尔值
 * 	if(条件表达式1){
 * 		语句1
 *  }else if(条件表达式2){
 *  	语句2
 *  }....
 *  esle{
 *  
 *  	语句3
 *  }
 *  
 *  流程：条件表达式1  true  语句1   false  继续往下判定
 *  
 *  	 如果条件都不满足 则执行语句3
 * @author mosin
 * @DATE 2021年3月30日
 */
public class IfDemo02 {
	/**
	 * 成绩等级判定
	 * >=90  优秀
	 * >=80  良好
	 * >=70  中等
	 * >=60  及格
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的成绩:");
		int score = scanner.nextInt();
		 
		scanner.close();
		//判定成绩
		/**
		 * 断点调试  在程序执行的时候 需要暂停的位置 需要打一个断点
		 * 程序运行到断点处时会停止  用户可以使用F5和F6进行调试
		 */
		if(score>=90) {
			System.out.println("优秀");
		}else if (score>=80) {
			System.out.println("良好");
		}else if (score>=70) {
			System.out.println("中等");
		}else if (score>=60) {
			System.out.println("及格");
		}else {
			System.out.println("不及格");
		}
		System.out.println("程序结束");

	}

}
