package org.jgs.day06;
/**
 * 
 * @Description  同一个包同一个类都能访问
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月20日上午10:01:35
 */
public class Aoo {

	private int pri = 10 ;
	int def = 20;
	protected int pro = 30 ;
	public int pub = 40;
	
	
	public static void main(String[] args) {
		Aoo aoo = new Aoo();
		System.out.println(aoo.pri);
		System.out.println(aoo.def);
		System.out.println(aoo.pro);
		System.out.println(aoo.pub);
	}
	
	
}
