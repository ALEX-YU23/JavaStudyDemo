package org.jgs.javaiotest01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/**
 * 测试FileInputStream 和File0utpuStream的使用
 * 结论:
	1.对于文本文件(. txt, .java,.c,.cpp)，使用字符流处理
	2.对于非文本文件(. jpg, .mp3, . mp4, .avi, .doc, .ppt,...)，使用字节流处理

 * 
 * @author AlexYU Email:alex2354629991@gmail.com
 * @date 2021年5月23日下午12:22:38
 */
public class FileInputOutputStreamtest {

	@Test
	public void testFileInputStream() {
		// 创建流
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("hello.txt");
			// 读数据
			byte[] buffer = new byte[6];
			int len; //记录每次读到的字节数
			while ((len = fis.read(buffer)) != -1) {
				String str = new String(buffer, 0, len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			// 关闭流
			if (fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/**
	 * 二进制文件复制
	 * @Description
	 * @author AlexYU 
	 * @throws IOException 
	 * @date 2021年5月23日下午12:52:05
	 */
	public void copyFile(String srcPath,String destPath) {
		
		// 造流
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(srcPath);
			fos = new FileOutputStream(destPath);

			//复制操作
			byte [] buffer = new byte[1024]; 
			int len ; //记录每次读入字节个数
			while ((len=fis.read(buffer))!=-1) {
				fos.write(buffer, 0, len);
			}
			System.out.println("复制成功!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			// 关闭流
			if (fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	@Test
	public void copyFileTest() {
		long time = System.currentTimeMillis();
		copyFile("小姐姐.jpg", "小姐姐_copy.jpg");
//		copyFile("hello.txt", "hello_copy.txt");
		
		time = (System.currentTimeMillis() - time);
		System.out.println("Spend:"+time + "ms");//57s  2048
		//Spend:95.646s  1024
		
	}
	
}
