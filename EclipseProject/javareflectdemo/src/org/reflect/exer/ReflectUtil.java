package org.reflect.exer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 
 * @Description 反射工具类
 * 
 * @author AlexYU
 * @date 2021年6月3日上午8:45:55
 */
public final class ReflectUtil {

	// 通过全类名创建对象
	@SuppressWarnings("unchecked")
	public static <T> T creatObject(String path) {
		try {
			Class<?> clazz = Class.forName(path);
			Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
			declaredConstructor.setAccessible(true);
			return (T) declaredConstructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// 创建方法
	public static Method creatMethod(Object obj,String name,Class...clazz) {
		
		try {
			Class clzz = obj.getClass();
			return clzz.getDeclaredMethod(name, clazz);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
