package org.jgs.reflect.day01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
/**
 * 反射工具类
 * @author mosin
 * @date 2021年6月3日
 */
@SuppressWarnings("all")
public  final class ReflectUtile {
	
	public static Object createObject(String className) {
		
		try {
			//通过全类名 创建对象
			Class clazz = Class.forName(className);
			//获取构造方法
			Constructor declaredConstructor = clazz.getDeclaredConstructor();
			declaredConstructor.setAccessible(true);
			return declaredConstructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Method createMethod(Object obj, String methodName,Class...clazz) {
		
		try {
			Class clzz = obj.getClass();
		    return clzz.getDeclaredMethod(methodName, clazz);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
