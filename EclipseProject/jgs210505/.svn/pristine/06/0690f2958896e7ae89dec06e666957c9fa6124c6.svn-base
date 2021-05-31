package org.jgs.iodemo.day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * 对象输入流和输出流的使用
 * ObjectOutputStream(OutputStream out) 
	创建一个写入指定的OutputStream的ObjectOutputStream
 * 
 * @author mosin
 * @DATE 2021年5月26日
 */
public class ObjectStreamDemo {
	
	@Test
	public void test01() throws Exception {//对象的序列化
		
		FileOutputStream fos= new  FileOutputStream("student.txt");
		//创建对象输出流
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//创建学生对象  然后写出到文件
		Student student = new Student();
		student.setAge(20);
		student.setName("zsan");
		student.setSex('男');
		student.setStuno(1);
		//student.setWeight(70);
		student.setOtherInfo("张三是一个好学生");
		
		//  序列化 调用对象流的相关方法 将student对象写出  当前对象必须要是已经序列化的对象  
		oos.writeObject(student);//java.io.NotSerializableException
		oos.close();

	}
	
	@Test
	public void test02() throws Exception {//对象的反序列化
		
		//创建字节输入流
		FileInputStream fis = new FileInputStream("student.txt");
		//创建对象输入流
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//使用对象流实现反序列化
		
		Object obj = ois.readObject();//java.io.InvalidClassException
		Student student = (Student)obj;
		System.out.println(student);
		ois.close();
		
		
	}

}
