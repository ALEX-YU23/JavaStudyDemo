package org.reflect.exer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Test;
/**
 * 案例1：动态创建任意的对象和调用方法 使用配置文件
 * 案例2：使用反射实现万能的set方法
 * @author AlexYU
 * @date 2021年6月2日下午2:40:22
 */
public class Exercise {

	@Test
	/*
	 * 案例1：动态创建任意的对象和调用方法 使用配置文件
	 */
	public void test() {
		// 1.读取配置文件,
		BufferedReader br = null;
		ArrayList<String> instructions = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(new File("config.txt")));
			
			String instr = null;
			
			while ((instr=br.readLine())!=null) {
				instructions.add(instr);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		//1.2获取要创建对象的类名和其方法名
		String className = "class";
		String mehtodName = "method";
		
		for (String str : instructions) {
			String[] split = str.split("=");
			if (split[0].equals(className)) {
				className = split[1];
			}else if (split[0].equals(mehtodName)) {
				mehtodName = split[1];
			}
		}
		
		// 2.通过类名获取类对象,创建实例
		Class<?> newClass = null;
		Object newInstance = null;
		Method method = null;
		try {
			newClass = Class.forName(className);
			newInstance = newClass.getConstructor().newInstance();
			// 3.通过对象名和方法名调用方法
			// 获取对象的方法
			// 错误写法
//			boolean canAccess = method.canAccess(newClass);
//			if (canAccess) {
//				// 不是私有方法   类对象调用
//				method = newClass.getMethod(mehtodName);
//			}else {
//				// 是私有方法
//				method = newClass.getDeclaredMethod(mehtodName);
//				method.setAccessible(true);
//			}
			
//			try {
//				// 调用本类的所有方法.不包括继承方法
//				method = newClass.getDeclaredMethod(mehtodName);
//			} catch (Exception e) {
//				// 调用本类的所有方法.包括继承方法,但不包括私有方法
//				method = newClass.getMethod(mehtodName);
//			}
			// 不调用私有的方法
			method = newClass.getMethod(mehtodName);
			method.setAccessible(true);
			
			// 方法调用
			method.invoke(newInstance);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	/*
	 * 案例2：使用反射实现万能的set方法
	 */
	public void test1() {
//		universalSet();
		Dog dog = new Dog();
		System.out.println(dog);
		
//		Class<? extends Object> class1 = dog.getClass();
//		try {
//			Method method = class1.getDeclaredMethod("setStrain",String.class);
//			method.invoke(dog, "你大爷的");
//		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
//			e.printStackTrace();
//		} catch (NoSuchMethodException e) {
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			e.printStackTrace();
//		}
		
		universalSet(dog, "setStrain", "连个屁");
		System.out.println(dog);
	}


	public <O, V> void universalSet(O o,String setwhat,V v) {
		// 1.创建类对象;
		// 2.获得实例
		// 3.设置属性值
		Class<? extends Object> oclass = o.getClass();
		try {
			Method method = oclass.getDeclaredMethod(setwhat,v.getClass());
			method.invoke(o, v);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}

	
	
}
