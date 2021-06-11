package org.reflect.exer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.junit.Test;

public class ReflectUtilTest {

	@Test
	public void test() {
		//测试反射工具类
		Properties ps = new Properties();
		try {
			ps.load(new FileInputStream(new File("config.properties")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 获取全类名
		String className = ps.getProperty("class");
		// 获取方法名
		String method = ps.getProperty("method");
		//System.out.println(className+":"+method);
		//org.reflect.exer.Dog:sayName
		
		Object creatObject = ReflectUtil.creatObject(className);
		System.out.println(creatObject);
		
		Method method2 = ReflectUtil.creatMethod(creatObject, method,String.class);
		try {
			method2.invoke(creatObject,"已经尿裤子了");
			System.out.println(creatObject);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
