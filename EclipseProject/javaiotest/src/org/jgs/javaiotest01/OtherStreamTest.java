package org.jgs.javaiotest01;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Inet4Address;
import java.util.Scanner;

import javax.sound.midi.VoiceStatus;

import org.junit.Test;

/*
 * 其他流的使用
	1.标准的输入、输出流
	2.打印流
	3.数据流

 */
public class OtherStreamTest {

	/*
	  1.标准的输入。输出流
		1.1
		System. in:标准的输入流，默认从鍵盘输入
		System. out:标准的输出流，默认从控制台输出
		1.2
		System类的setIn(InputStream is) / setOut(PrintStream ps) 方式重新指定输入和输出的流

		1.3练习:
		从链盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续进行输入操作，
		直至当输入"e"或者"exit"时，退出程序。

	  方法1:使用Scanner实现，调用next()返回一个字符串
	  方法2:使用System.in实现  System.in --->> BufferedReader.的readLine()
	 */
	@Test
	public void test1_3() {
		//方法1:使用Scanner实现
		Scanner input = new Scanner(System.in);
		System.out.println("请输入字符串:");
		String str = input.next();
		
		while (!"e".equals(str)&&!"exit".equals(str)) {
			System.out.println(str.toUpperCase());
			System.out.println("请输入字符串:");
			str = input.next();
		}
		input.close();
	}
	@Test
	public void test1_3_1() {
		//方法2:使用System.in实现  System.in --->> BufferedReader.的readLine()
		System.out.println("请输入字符串:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String len ;
		
		try {
			while ((len = br.readLine())!= null && !"e".equals(len)&&!"exit".equals(len)) {
				
				System.out.println(len.toUpperCase());
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("程序结束");
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	// TODO 自己造一个Scanner类
	
	/*
	 * 2.打印流: PrintStream 和Printwriter
		2.1 提供了一-系列重载的print() 和println()
		2.2练习:

	 * 
	 */
	@Test
	public void test2(){
		PrintStream ps = null;
		try {
			FileOutputStream fos = new FileOutputStream(new File("hello.txt"));
			//创建打印输出流，设置为自动刷新模式(写入换行符或字节'\n' 时都会刷新输出缓冲区)
			ps = new PrintStream(fos,true);
			if (ps != null) {// 把标准输出流(控制台输出)改成文件
				System.setOut(ps);
			}
			for(int i=40;i<=100;i++){//输出ASCII字符.
				System.out.print((char)i);
				if (i % 26 == 0){//每50个数据一行
					System.out.println(); //换行
				}
			}
		} catch (FileNotFoundException e) {
			e. printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}
	
	/*
	3.数据流
	3.1 DataInputStream 和DataOutputStream
	3.2作用:用于读取或写出基本数据类型的变量或字符串
	*/
	@Test
	public void test03() {
		//写出基本数据类型的变量或字符串到文件中
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("data.txt"));
			dos.write(989998);
			dos.writeBoolean(false);
			dos.writeDouble(34222.9088d);
			dos.writeChars("hello");
			dos.writeUTF("但孝玉");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			dos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test04() {
		//读取基本数据类型的变量或字符串
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("data.txt"));
			
			int read = dis.read();
			System.out.println(read);
			boolean readBoolean = dis.readBoolean();
			System.out.println(readBoolean);
			double readDouble = dis.readDouble();
			System.out.println(readDouble);
			char[] readChar = new char[5];
			readChar[0] = dis.readChar();
			readChar[1] = dis.readChar();
			readChar[2] = dis.readChar();
			readChar[3] = dis.readChar();
			readChar[4] = dis.readChar();
			System.out.println(readChar);
			String readUTF = dis.readUTF();
			System.out.println(readUTF);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
