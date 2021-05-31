package org.jgs.iodemo.day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.Test;

/**
 * 
 * class FileWriter extends OutputStreamWriter
 * 字符输出流 可以直接创建对象 不依赖其他的流
 * FileWriter 
 * 1.构造方法
 * FileWriter(File file)
 * FileWriter (String filename)
 * 
 * FileReader  
 * 1.构造方法
 * FileReader (File file)
 * FileReader (String filename)
 * 
 * @author mosin
 * @DATE 2021年5月25日
 */
public class FileWriter_Reader {//文件字符输出流
	@Test
	public void test01() throws Exception {
		//创建流  无法指定写出的编码  只能按照系统默认的编码写出
		FileWriter fw = new FileWriter("fw.txt");
		//使用流 写出数据  并没有真正的写出 
		fw.write("北大青鸟");
		//关闭流
		fw.close();
	}
	
	@Test
	public void test02() throws Exception {//文件字符输入流
		// 无法指定读取的编码格式 
		FileReader fr = new FileReader("fw.txt");
		//创建数组 指定每次读取的字符数
		char[] cs = new char[3];
		//使用流  读取字符
		//int read = fr.read();
		//实际读取的字符的长度
		int read = fr.read(cs);
		//System.out.println((char)read);
		System.out.println(read);
		//将读出的字符数组转换成字符串
		System.out.println(new String(cs,0,read));
		read = fr.read(cs);
		System.out.println(read);
		System.out.println(new String(cs,0,read));
		//读取到文件最后 返回-1
		read = fr.read(cs);
		System.out.println(read);
		//关闭流
		fr.close();
	}
	
	@Test
	public void test03() throws Exception {//复制文本文件 验证字符流的效率
		
		FileReader fr = new  FileReader("E:/fw.txt");
		FileWriter fw = new FileWriter("E:/copy.txt");
		
		int len = -1;
		System.out.println("开始复制");
		long start = System.currentTimeMillis();
		while((len = fr.read())!=-1) {
			fw.write(len);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制结束，用时："+(end-start)+"ms");//738
		//流使用完毕以后  要关闭 释放资源 否则可能存在复制文件大小不一致的情况
		fw.close();
		fr.close();

	}
	
	
	@Test
	public void test04() throws Exception {//复制文本文件 验证字符缓冲流的效率
		
		FileReader fr = new  FileReader("E:/fw.txt");
		FileWriter fw = new FileWriter("E:/copy.txt");
		
		//创建字符缓冲流对象
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedReader br = new BufferedReader(fr);
		
		int len = -1;
		System.out.println("开始复制");
		long start = System.currentTimeMillis();
		while((len = br.read())!=-1) {
			bw.write(len);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制结束，用时："+(end-start)+"ms");//389
		//流使用完毕以后  要关闭 释放资源 否则可能存在复制文件大小不一致的情况
		fw.close();
		fr.close();

	}
	
	@Test
	public void test05() throws Exception {//字符缓冲流中的特有方法
		
		FileReader fr = new  FileReader("bw.txt");
		FileWriter fw = new FileWriter("bw.txt");
		
		//创建字符缓冲流对象
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedReader br = new BufferedReader(fr);
		
		//使用字符缓冲流 写出数据
		bw.write("合肥一元");
		//bw.write("\r\n");
		//实现字符的换行
		bw.newLine();
		//没有真正的写出到文件
		bw.write("合肥一元");
		
		//bw.flush();
		bw.close();
		
		//使用字符缓冲输入流 读取文件内容
		String readLine = br.readLine();
		System.out.println(readLine);
		br.close();
	}
	
	

	@Test
	public void test06() throws Exception {//使用字符缓冲流读取java文件  写出到控制台
		
		
		FileReader fr = new FileReader("src/org/jgs/iodemo/day01/FileDemo.java");
		//创建字符缓冲流对象
		BufferedReader br = new  BufferedReader(fr);
		
		String line = null;
		while((line= br.readLine())!=null) {
			
			System.out.println(line);
			
		}
		
		br.close();
		
	}
	
	

}
