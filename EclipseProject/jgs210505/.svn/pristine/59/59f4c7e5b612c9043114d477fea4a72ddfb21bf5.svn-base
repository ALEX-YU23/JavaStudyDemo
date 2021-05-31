package org.jgs.iodemo.day01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.StringBufferInputStream;

import org.junit.Test;

/**
 * 字节缓冲流的使用
 * BufferedInputStream  字节缓冲输入流
 * BufferedOutputStream 字节缓冲输出流 
 * 缓冲流提高了字节的读写效率  当前的两个流都是高级流 不能单独使用 必须依赖低级流
 * 
 * 1.构造方法 
 * 	BufferedOutputStream(OutputStream  out)
 * 	BufferedInputStream(InputStream in)
 * 
 * BufferedInputStream(InputStream in,int size)
 * BufferedOutputStream(OutputStream  out,int size)
 * @author mosin
 * @DATE 2021年5月25日
 */
public class BufferedInputStream_OutputstreamDemo {

	@Test
	public void test01() throws Exception {//使用字节缓冲流实现图片的复制
		
		FileInputStream  fis = new FileInputStream("E:/4.jpg");
		FileOutputStream fos = new FileOutputStream("E:/copy.jpg");
		
		//创建缓冲流对象
		BufferedOutputStream bos = new BufferedOutputStream(fos);
	    BufferedInputStream bis = new BufferedInputStream(fis);
	    
	    //循环读取数据 并写出
	    int len = -1;
	    System.out.println("开始复制");
		//获取系统当前的毫秒值
		long start = System.currentTimeMillis();
	    while((len = bis.read())!=-1) {
	    	bos.write(len);
	    }
	    long end = System.currentTimeMillis();
		System.out.println("复制完毕,用时:"+(end-start)+"ms");
		
		//关闭资源 
		bos.close();
		bis.close();
	}
	
	@Test
	public void  test02()throws Exception  {
		
		FileOutputStream fos = new FileOutputStream("a.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//输入内容到文件  并没有真正的将数据写出到文本 写出到缓冲区
		bos.write(97);
		//强制刷新 将流中的数据写出  清空流  不推荐使用 会降低流的效率
		//bos.flush();
		//关闭流 释放资源  flush()
		bos.close();
	
	}
	
	
}
