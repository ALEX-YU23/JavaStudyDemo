package org.jgs.iodemo.day01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import org.junit.Test;

/**
 * 字节输入流 InputStream  抽象类 不能直接创建对象
 * 使用子类创建对象  常用的子类  FileInputStream
 * 1.构造方法
 * 	FileInputStream(String name);
 * @author mosin
 * @DATE 2021年5月24日
 */
public class InputStreamDemo {
	@Test
	public void test01() throws Exception { //字节输入流
		
		//创建对象
		FileInputStream fis = new FileInputStream("fos.txt");
		//使用对象  read() 每次读取一个字节
//		int read = fis.read();
//		System.out.println(read);
//		read = fis.read();
//		System.out.println(read);
//		read = fis.read();
//		System.out.println(read);
//		read = fis.read();
//		System.out.println(read);
//		//返回值为-1  说明读取到了文件的末尾
//		read = fis.read();
//		System.out.println(read);
		
		//使用循环读取文件中的每一个字节
		
//		while(fis.read()!=-1) {
//			System.out.println(fis.read());
//		}
		
		int len = -1;
		while( (len = fis.read())!=-1) {
			System.out.println(len);
		}
		fis.close();
		
	}
	
	@Test
	public void test02() throws Exception {//一次读取多个字节
		
		//创建对象
		FileInputStream fis = new FileInputStream("fos.txt");
		//使用对象
		byte [] bs = new byte[512];
		//读出的数据放进 bs数组中  查看内容可以遍历bs数组 返回值是实际读取的长度 读取到文件的末尾返回-1
		int read = fis.read(bs);
		System.out.println(read);
		read = fis.read(bs);
		System.out.println(read);
		//遍历数组  查看读取的内容
		for (byte b : bs) {
			System.out.println(b);
		}
		fis.close();
	}
	
	@Test
	public void test03() throws Exception {
		//创建对象
		FileInputStream fis = new FileInputStream("fos.txt");
		int len = -1;
		byte[] bs = new byte[3];
		while((len = fis.read(bs))!=-1) {
			
			System.out.println( new String(bs));
			
		}
		fis.close();
	}

}
