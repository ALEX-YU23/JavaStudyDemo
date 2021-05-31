package org.jgs.day05;
import org.jgs.day06.Aoo;
/**
 * 
 * @Description 测试不同包不同类
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月20日上午9:56:27
 */
public class TestAoo {

	public static void main(String[] args) {
		Aoo aoo = new Aoo();
		//System.out.println(aoo.pri);
		//System.out.println(aoo.def);
		//System.out.println(aoo.pro);
		System.out.println(aoo.pub); //public 能够访问

	}

}
