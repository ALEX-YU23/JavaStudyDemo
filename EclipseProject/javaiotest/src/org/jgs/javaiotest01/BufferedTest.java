package org.jgs.javaiotest01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;
/*
	处理流之- :缓冲流的使用
	1.缓冲流:
		BufferedInputStream
		BufferedOutputStream
		BufferedReader
		BufferedWriter
	2.作用:提供流的读取、写入的速度
		提高读写速度的原因:内部提供了- -个缓冲区
	3.处理流，就是“套接”在已有的流的基础上。
*/
 
public class BufferedTest {

	/*
	 * 实现非文本文件的复制
	 */
	@Test
	public void testBufferInputStream() {
		long start = System.currentTimeMillis();
		// 1.造文件
		File srcFile = new File("小姐姐.jpg");
		File destFile = new File("tupic_copy.jpg");
		
		// 2.造字节流
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(srcFile);
			fos = new FileOutputStream(destFile);
			// 3.造缓冲流
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			// 4.复制操作
//			byte data[] = new byte[4112];
			int len ; // 记录每次读到的字节个数
			while ((len = bis.read())!=-1) {
				bos.write(len);
			}
			start = System.currentTimeMillis() - start;
			System.out.println("复制成功!!");
			System.out.println("spend:"+start+"ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			// 关闭流
			if (bos!=null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bis!=null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			//说明:关闭外层流的同时，内层流也会自动的进行关闭
			//。关于内层流的关闭，我们可以省略|
			//fos.close();
			//fis.close();
		}
	}
	// 实现文件复制的方法 缓冲流
	public void copyFileWithBufferd(String scrPath, String destPath) {
		long start = System.currentTimeMillis();
		// 2.造字节流
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(scrPath);
			fos = new FileOutputStream(destPath);
			// 3.造缓冲流
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			// 4.复制操作
			byte data[] = new byte[1024];
			int len; // 记录每次读到的字节个数
			while ((len = bis.read(data)) != -1) {
				bos.write(data, 0, len);
			}
			start = System.currentTimeMillis() - start;
			System.out.println("复制成功!!");
			System.out.println("spend:" + start + "ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭流
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			// 说明:关闭外层流的同时，内层流也会自动的进行关闭
			// 。关于内层流的关闭，我们可以省略|
			// fos.close();
			// fis.close();
		}
	}
	@Test
	public void testCopyFileWithBufferd() {
		
		String src = "小姐姐.jpg";
		String dest = "小姐姐_copy.jpg";
		copyFileWithBufferd(src,dest);
		//spend:51s
	}
	//使用BufferedReader和BufferedWriter实现文本文件的复制
	@Test
	public void testBufferdReaderWriter() {
		long start = System.currentTimeMillis();
		// 造文件
		File srcFile = new File("hello.txt");
		File destFile = new File("hello_copy.txt");
		
		// 造字符流
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw =null;
		try {
			fr = new FileReader(srcFile);
			fw = new FileWriter(destFile);

			// 造缓冲流
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			// 复制的细节
			char[] data = new char[1024];
			int len;
			while (((len=br.read(data))!=-1)) {
				bw.write(data, 0, len);
			}
			start = System.currentTimeMillis() - start;
			System.out.println("复制成功!!");
			System.out.println("spend:" + start/1000d + "s");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			// 关闭资源
			if (bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	@Test
	public void testBufferdReaderWriter1() {
		long start = System.currentTimeMillis();
		// 造流
		BufferedReader br= null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader(new File("hello.txt")));
			bw = new BufferedWriter(new FileWriter(new File("hello1_txt")));
			// 复制的细节
			// 方式一
//			char[] data = new char[1024];
//			int len;
//			while (((len=br.read(data))!=-1)) {
//				bw.write(data, 0, len);
//			}
			// 方式二
			String data = null;
			while ((data=br.readLine())!=null) {
				// 方法1
				//bw.write(data + "\n");
				// 方法2
				bw.write(data);
				bw.newLine();//换行
			}
			
			start = System.currentTimeMillis() - start;
			System.out.println("复制成功!!");
			System.out.println("spend:" + start/1000d + "s");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭资源
			if (bw!=null ) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			if (br!=null ) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		
	}
}
