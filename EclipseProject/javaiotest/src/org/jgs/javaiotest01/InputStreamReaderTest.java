package org.jgs.javaiotest01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;
/*
 * 处理流之二:
 * 1.转换流 : 属于字符流
 * 	InputStreamReader  将一个字节的输入流转换为字符的输入流
 * 	OutputStreamWriter 将一个字符的输出流转换为字节的输出流
 * 		以字节流输入以字符流输出,中间将字节的输入流转换成字符的输入流,
 * 		操作完成后,再将字符的输出流转换成字节的输出流
 * 
 * 2.作用:提供字节流与字符流之间的转换
 * 
 * 3.解码:字节、字节数组--->字符数组、字符串
 *   编码:字符数组、字符串--->字节、字节数组
 *   
 * 4.字符集
 */
public class InputStreamReaderTest {

	/*
	 * 将文本文件以字节流读入,在转换成字符流进行操作
	 * 使用转换流 InputStreamReader
	 */
	@SuppressWarnings("resource")
	@Test
	public void test() {
		// 字节输入流
		FileInputStream fis=null;
		InputStreamReader isr = null;
		try {
			// 输入转换流
			fis = new FileInputStream("hello.txt");
			// 参数2指明了字符集,具体使用哪个字符集，取决于原文件保存时使用的字符集
			isr = new InputStreamReader(fis,"utf-8");

			// 输出到控制台
			char[] data = new char[24];
			int len; // 每次读取字符的个数
			StringBuilder sb = new StringBuilder();
			while((len = isr.read(data))!=-1) {
				sb.append(data, 0, len);
			}
			System.out.println(sb);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭资源 关闭外层即可
			if (isr!=null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
	//异常处理还是得用try-catch-finally处理,此处抛出是为了节省时间

	@Test
	public void test01() throws IOException {
		// 文件节点
		File scrFile = new File("hello.txt");
		File destFile = new File("hello_gbk.txt");
		// 将一个字节的输入流转换为字符的输入流
		FileInputStream fis = new FileInputStream(scrFile);
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		
		//将一个字符的输出流转换为字节的输出流
		FileOutputStream fos = new FileOutputStream(destFile);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
		
		char[] cbuf = new char[24];
		int len ; // 记录每次读入的字符个数
		while((len=isr.read(cbuf))!=-1) {
			osw.write(cbuf, 0, len);
		}
		
		osw.close();
		isr.close();
	}
}
