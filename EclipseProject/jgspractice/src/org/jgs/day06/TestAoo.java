package org.jgs.day06;
/**
 * 
 * @Description 同一个包不同类
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月20日上午10:00:28
 */
public class TestAoo {

	public static void main(String[] args) {
		Aoo aoo = new Aoo();
		//System.out.println(aoo.pri);  //private不能被访问
		System.out.println(aoo.def);
		System.out.println(aoo.pro);
		System.out.println(aoo.pub);

	}

}
