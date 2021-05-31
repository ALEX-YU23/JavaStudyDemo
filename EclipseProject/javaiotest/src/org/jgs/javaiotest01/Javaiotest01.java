package org.jgs.javaiotest01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;
/**
 * 	一、流的分类:
		1.操作数据单位:字节流、字符流
		2.数据的流向:输入流、输出流
		3.流的角色:节点流、处理流
	二、流的体系結构
抽象基类			节点流(或文件流)		缓冲流(处理流的一-种)
InputStream		FileInputStream		BufferedInputStrea
OutputStream	FileOutputStream	Buffered0utputStre
Reader			FileReader			BufferedReader
Writer			FileWriter			BufferedWriter

 * @Description
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年5月23日下午12:10:56
 */
public class Javaiotest01 {

	@Test
	/*
	将hello.txt文件内容读入程序中，并输出到控制台
	说明点:
		1. read()的理解:返回读入的一个字符。如果达到文件末尾，返回-1
		2.异常的处理:为了保证流资源一定可以执行关闭操作。需要使用try-catch-finally处理
		3.读入的文件一定要存在，否则就会报FileNotFoundException.|
	*/
	public void testFileReader() {
		// 1.实例化File类的对象，指明要操作的对象
		File file = new File("Hello1.txt");
		// 2.提供具体的流
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			// 3.数据读入过程
			// read():返回读入的一个字符。如果达到文件末尾，返回-1
			// 方式一
//			int read = fr.read();
//			while (read != -1) {
//				System.out.print((char)read);
//				read = fr.read();
//			}
			// 方法二: 方式一的简化
			int data;
			while ((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4.流的关闭操作
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 对read（）操作升级：使用read的重载方法
	@Test
	public void testFileReader01(){
		// 1.File类的实例化
		File file = new File("Hello.txt");
		// 2.FileReader流的实例化
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			// 3.文件的读入操作
			//read(char[] cbuf): 返回每次读入cbuf数组中的字符的个数。
			//如果达到文件末尾，返回-1
			char[] cbuf = new char[5];
			int len;
			while ((len = fr.read(cbuf)) != -1) {
				// 法1:正确的写法:
				//for (int i = 0; i < len; i++) {
				//	System.out.print(cbuf[i]);
				//}
				
				// 法2:错误的写法
				//for (int i = 0; i < cbuf.length; i++) {
				//	System.out.print(cbuf[i]);
				//}
				
				// 法3:对应法2错误的写法
				//String string = new String(cbuf);
				//System.out.println(string);
				
				// 法3正确写法
				String str = new String(cbuf,0,len);
				System.out.print(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}finally {
			// 4.流的关闭
			try {
				if (fr != null) 
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/*
	 * 从内存中写出数据到硬盘的文件里。
		说明:
		1.输出操作，对应的File可以不存在的。并不会报异常
		File对应的硬盘中的文件如果不存在，在输出的过程中，会自动创建此文件。
		File对应的硬盘中的文件如果存在:
		如果流使用的构造器是: 
			Filewriter(file,false) / Filewriter(file):
				对原有的覆盖
		如果流使用的构造器是: 
			FileWriter(file, true):
				不会对原有文件覆盖，而是在原有文件基础上追加内容

	 */
	@Test
	public void testFileWriter() throws IOException {
		// 1.提供File类的对象,指明写出到的文件
		File file = new File("hello1.txt");
		// 2.创建FileWriter对象并实例化
		FileWriter fw = new FileWriter(file,true);
		// 3.文件的写入操作
		fw.write("你问我爱你有多深\n");
		fw.write("我爱你有几分\n");
		fw.write("我的情也真\n");
		fw.write("我的爱也真\n");
		fw.write("月亮代表我的心");
		// 4.流的关闭
		fw.close();
	}
	/*
		文本文件的复制
	 */
	@Test
	public void testFileReaderFileWriter() {
		// 1. 提供file对象,指明要读写的文件
		File file1 = new File("hello1.txt");
		File file2 = new File("hello2.txt");
		// 2. 流的创建
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("tupic.jpg");
			fw = new FileWriter("hello2.jpg");
			char data[] = new char[10];
			int len; // 记录每次读入数组中的字符个数
			while ((len = fr.read(data)) != -1) {
				// 每次写出len个
				fw.write(data, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4.流的关闭
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/*
	二进制文件的复制
 */
@Test
public void testReaderFileWriter() {
	//  流的创建
	FileInputStream fis = null;
	FileOutputStream fos = null;
	try {
		fis = new FileInputStream("tupic.jpg");
		fos = new FileOutputStream("tupic_copy.jpg");
		byte data[] = new byte[10];
		int len; // 记录每次读入数组中的字符个数
		while ((len = fis.read(data)) != -1) {
			// 每次写出len个
			fos.write(data, 0, len);
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		// 4.流的关闭
		if (fos != null) {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (fis != null) {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
}
}
