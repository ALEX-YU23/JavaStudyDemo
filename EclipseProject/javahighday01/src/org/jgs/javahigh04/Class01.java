package org.jgs.javahigh04;
/**
 * 测试方法使用泛型
 * @Description
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年5月12日下午7:26:53
 */

public class Class01 {
	
	public <T> void hello(T t) {
		System.out.println(t);
		System.out.println(t.getClass());
	}
	
}
