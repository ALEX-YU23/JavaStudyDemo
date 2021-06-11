package org.jgs.reflect.day01;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

import org.junit.Test;

/**
 * 测试反射的相关操作
 * 1.获取反射的入口  类对象
 * 	Class.forName(全类名)  包名+类名
 * 	类名.class
 * 	对象.getClass()
 * 
 * @author mosin
 * @DATE 2021年6月2日
 */
@SuppressWarnings("all")
public class ReflectRTest {
	
	@Test
	public void test01() { //获取反射的入口

		try {
			/**
			 * Class.forName(全类名)  包名+类名
			 */
			Class clazz = Class.forName("org.jgs.reflect.day01.Student");
			System.out.println(clazz);
			
			/**
			 * 类名.class
			 */
			Class clazz2 = Student.class;
			System.out.println(clazz2);
			
			/**
			 * 对象名.getClass()
			 */
//			Student student = new Student();
//			Class clazz3 = student.getClass();
//			System.out.println(clazz3);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void test02() { //获取类对象所在的包名和类名
		try {
			Class clazz = Class.forName("org.jgs.reflect.day01.Student");
			//通过类对象获取包名
			Package package1 = clazz.getPackage();
			System.out.println(package1);
			//获取类名
			String simpleName = clazz.getSimpleName();
			System.out.println(simpleName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test
	public void test03() { //获取类对象的父类和实现的接口
		
		try {
			Class clazz = Class.forName("org.jgs.reflect.day01.Student");
			//获取父类
			Class superclass = clazz.getSuperclass();
			System.out.println(superclass);
		    //获取父接口
			Class[] interfaces = clazz.getInterfaces();
			//遍历数组  查看实现的所有接口
			for (Class interf : interfaces) {
				System.out.println(interf.getName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test04() { //获取类对象的构造方法
		try {
			Class clazz = Class.forName("org.jgs.reflect.day01.Student");
			//获取本类中公开构造方法
			Constructor[] constructors = clazz.getConstructors();
			//遍历数组 查看获取的构造方法
			for (Constructor constructor : constructors) {
				System.out.println(constructor);
			}
			
			System.out.println("*****************************");
		   //获取本类中所有构造方法  getDeclaredConstructors()  忽略了修饰符的限制
			Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
			for (Constructor constructor : declaredConstructors) {
				System.out.println(constructor);
			}
			System.out.println("*****************************");
			//获取指定参数的某个构造方法
			Constructor constructor = clazz.getConstructor(String.class);
			System.out.println(constructor);
			
			//获取指定参数的某个私有构造方法  该方法也能获取公开的构造方法
			Constructor declaredConstructor = clazz.getDeclaredConstructor(double.class);
			System.out.println(declaredConstructor);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

	@Test
	public void test05() { //获取类对象的构造方法  如何创建对象
		
		try {
			Class clazz = Class.forName("org.jgs.reflect.day01.Student");
			//通过类对象获取无参构造
			Constructor constructor = clazz.getConstructor();
			System.out.println(constructor);
			//通过获取的构造方法创建实例对象  newInstance()
			Object obj = constructor.newInstance();
			System.out.println(obj);
			
			System.out.println("********************************");
			//通过类对象获取有参构造
			Constructor constructor2 = clazz.getConstructor(String.class);
			Object obj2 = constructor2.newInstance("10001");
			System.out.println(obj2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void test06() { //获取类对象的属性 
		
		try {
			Class clazz = Class.forName("org.jgs.reflect.day01.Student");
			
			//获取类中的公开的属性  包括父类的属性
			Field[] fields = clazz.getFields();
			for (Field field : fields) {
				System.out.println(field);
			}
			System.out.println("***************************");
			//获取本类中所有的属性  包含私有
			Field[] declaredFields = clazz.getDeclaredFields();
			for (Field field : declaredFields) {
				System.out.println(field);
			}
			System.out.println("*******************************");
			//获取指定名字的属性
			//Field field = clazz.getField("name");
			Field field = clazz.getDeclaredField("score");
			System.out.println(field);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test
	public void test07() { //获取类对象的属性   如何赋值
		
		try {
			Class clazz = Class.forName("org.jgs.reflect.day01.Student");
			//获取类中的id属性 并赋值
			Field field = clazz.getField("id");
			//set(Object obj,Object ob)  第一个参数 实例对象   第二个参数 属性值
			Object obj = clazz.getConstructor().newInstance();
			field.set(obj, "10002");
			System.out.println(obj);
			//获取私有属性
			Field field2 = clazz.getDeclaredField("score");
			//设置私有的属性 可以直接赋值 
			field2.setAccessible(true);
			field2.set(obj, 88);//java.lang.IllegalAccessException
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test08() { //获取类对象的方法
		try {
			Class clazz = Class.forName("org.jgs.reflect.day01.Student");
			//获取类中所有公开的方法  包含父类
			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				System.out.println(method);
			}
			System.out.println("***************************************");
			//获取本类中所有的方法 包含私有
			Method[] declaredMethods = clazz.getDeclaredMethods();
			for (Method method : declaredMethods) {
				System.out.println(method);
			}
			System.out.println("***************************************");
			//获取指定的某个方法
			Method method = clazz.getMethod("myInterfaceMethod");
			System.out.println(method);
			System.out.println("***************************************");
			//获取某个私有的方法
			Method declaredMethod = clazz.getDeclaredMethod("studentMethod");
			System.out.println(declaredMethod);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void test09() { //获取类对象的方法  如何调用

		try {
			Class clazz = Class.forName("org.jgs.reflect.day01.Student");
			//获取公有的方法 并调用
			Method method = clazz.getMethod("myInterfaceMethod");
			Object obj = clazz.getConstructor().newInstance();
			method.invoke(obj);
			
			//获取私有的方法  并调用
			Method method2 = clazz.getDeclaredMethod("studentMethod");
			method2.setAccessible(true);
			method2.invoke(obj);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test10() { //测试反射工具类 创建对象
		
		try {
			Properties ps = new  Properties();
			ps.load(new FileInputStream("reflect.properties"));
			
			String className = ps.getProperty("classPath");
			String methodName = ps.getProperty("method");
			
			System.out.println(className);
			System.out.println(methodName);
			
			Object obj = ReflectUtile.createObject(className);
			System.out.println(obj);
			
			Method meth = ReflectUtile.createMethod(obj, methodName,double.class);
			meth.invoke(obj,88.8);
			
			System.out.println(obj);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	

}
