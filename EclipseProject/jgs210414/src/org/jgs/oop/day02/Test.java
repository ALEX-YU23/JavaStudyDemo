package org.jgs.oop.day02;

/**
 * 作用域案例
 * 局部变量的优先级高于成员变量
 * @author mosin
 * @DATE 2021年4月16日
 */
public class Test {

	public int score1 = 88;
	public int score2 = 98;
	public int avg;

	public void calcAvg() {
		//局部变量
		int avg;
		avg = (score1 + score2) / 2;
	}

	public void showAvg() {
		System.out.println("平均分是： " + avg);
	}

	public static void main(String[] args) {

		Test test = new Test();
		//先调用calcAvg
		test.calcAvg();
		//showAvg()
		test.showAvg();
	}

}
