package org.jgs.iodemo.day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/**
 * 字节输出流  OutputStream  abstract  抽象类 不能直接创建对象
 * 要想创建对象需要使用已知的子类 FileOutputStream
 * 1.构造方法
 * 	FileOutputStream(String name)
 *  FileOutputStream(String name,boolean append);  实现追加写
 * @author mosin
 * @DATE 2021年5月24日
 */
public class OutputStreamDemo {
	@Test
	public  void test01() {
		FileOutputStream fos = null;
		//创建字节输出流对象  相对路径  当前项目
		try {
			//1.创建流
			fos = new  FileOutputStream("fos.txt");
			//2.写出数据到文件  
			fos.write(97);
			
		} catch (FileNotFoundException e) {//文件不存在
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//关闭流 释放资源
			try {
				if(fos!=null) {
					fos.close();
				}	
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	@Test
	public  void test02() throws Exception {
		
		//输出名字的拼音到文件   覆盖写操作
		//FileOutputStream fos = new  FileOutputStream("fos.txt");
		//开启文件的追加效果
		FileOutputStream fos = new  FileOutputStream("fos.txt",true);
//		fos.write(109);
//		fos.write(101);
		byte[] name = {109,101,110,103,95,115,104,117,110};
		//一次性的写出一个数组
		//fos.write(name);
		//写出数组的一部分  int off  起始位置  int len  长度
		fos.write(name, 0, 4);
		//关闭流  释放资源
		fos.close();
		
	}
	
	@Test
	public  void test03() throws Exception {//写出自己的名字
		
		FileOutputStream fos = new  FileOutputStream("fos.txt");
		String name = "孟顺";
		byte[] bytes = name.getBytes();
//		byte[] bytes = name.getBytes("gbk");//乱码
		fos.write(bytes);
		fos.close();
		
	}
	@Test
	public  void test04() throws Exception {// 实现图片文件的拷贝
		
		//创建字节输入流和字节输出流 
		FileOutputStream fos = new FileOutputStream("E:/copy.jpg");
		FileInputStream  fis = new  FileInputStream("E:/4.jpg");
		
		
		//实现拷贝  一次读取一个字节 效率是非常慢的 放大了硬件之间的差异
		int len  = -1;
		System.out.println("开始复制");
		//获取系统当前的毫秒值
		long start = System.currentTimeMillis();
		while ((len = fis.read())!=-1) {
			fos.write(len);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕,用时:"+(end-start)+"ms");
		//关闭流 释放资源  先关闭输出 
		fos.close();
		fis.close();
	}
	
	@Test
	public  void test05() throws Exception {//以字节数组的形式 复制文件
		//创建字节输入流和字节输出流 
		FileOutputStream fos = new FileOutputStream("E:/copy.jpg");
		FileInputStream  fis = new  FileInputStream("E:/4.jpg");
		
		//用于存放读取的数据
		byte[] bs = new byte[1024];
		//  len 存储的是 实际读取的数据长度
		int len = -1;
		System.out.println("开始复制");
		//获取系统当前的毫秒值
		long start = System.currentTimeMillis();
		while ( (len =fis.read(bs))!=-1) {
			//指定写出的位置和长度
			fos.write(bs,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕,用时:"+(end-start)+"ms");
		
		fos.close();
		fis.close();
		
	}

}
