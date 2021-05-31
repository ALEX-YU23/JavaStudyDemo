package org.jgs.iodemo.day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

import org.junit.Test;

/**
 * 转换流的使用 可以将字节流转换成字符流 方便文本文件的操作  
 * OutputStreamWriter 
	1.构造方法
	OutputStreamWriter(OutputStream out)
	OutputStreamWriter(OutputStream out,String  charset)  可以指定写出的编码格式
 * InputStreamReader
 * 1.构造方法
 * InputStreamReader(InputStream  in)
 * OutputStreamWriter(OutputStream out,String  charset)
 * @author mosin
 * @DATE 2021年5月25日
 */
public class OutputStreamWriterDemo {
	@Test
	public  void test01() throws Exception {  //转换输出流的使用
		
		//创建字节输出流
		FileOutputStream fos = new FileOutputStream("a.txt",true);
		//创建转换流对象  需要传递一个低级流作为参数  fis
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		//获取流的编码格式
		String encoding = osw.getEncoding();
		System.out.println(encoding);
		//写出数据到文本
		String str = "合肥一元";
		//没有真正的写出数据到文本
		osw.write(str);
		//关闭流 释放资源 清空流
		osw.close();
	}
	
	@Test
	public  void test02() throws Exception {  //转换输出流的使用  使用指定的字符编码格式写出
		//创建字节输出流
		FileOutputStream fos = new FileOutputStream("a.txt");
		//创建转换流对象  需要传递一个低级流作为参数  fis 第二个参数是 字符编码格式
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		//获取流的字符编码格式
		String encoding = osw.getEncoding();
		System.out.println(encoding);
		//写出数据到文本
		String str = "合肥一元";
		// osw.write(str); //直接写出字符串
//		char[] charArray = str.toCharArray();
//		System.out.println(Arrays.toString(charArray));
		
		 osw.write(str.toCharArray());  //写出字符数组
		//osw.write(str.toCharArray(),0,1);  //写出字符数组一部分
		osw.close();
	}
	
	@Test
	public  void test03() throws Exception {//字符输入转换流
		
		FileInputStream fis = new FileInputStream("a.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		//查看流的编码
		String encoding = isr.getEncoding();
		System.out.println(encoding);
		//使用转换流  读取文本内容  读取一个字符
		int len = -1;
		while((len = isr.read())!=-1) {
			System.out.println((char)len);
		}
		isr.close();
	}
	
	@Test
	public  void test04() throws Exception {//字符输入转换流  按照指定编码格式读取文件
		
		FileInputStream fis = new FileInputStream("a.txt");
		InputStreamReader isr = new InputStreamReader(fis,"gbk");
		//查看流的编码
		String encoding = isr.getEncoding();
		System.out.println(encoding);
		//使用转换流  读取文本内容  读取一个字符
		int len = -1;
		while((len = isr.read())!=-1) {
			System.out.println((char)len);
		}
		isr.close();
	}
	

}
