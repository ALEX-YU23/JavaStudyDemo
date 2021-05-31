package org.jgs.iodemo.day01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Test;

/**
 * 使用数据流 将基本类型的数据 直接写出到文本  
 * 或者直接读取一个基本类型的值
 * DataInputStream
 * 1.构造方法
 * DataInputStream(Inputstream in)
 * 
 * DataOutputStream
 * 1.构造方法
 * DataOutputStream(OutputStream out)
 * 
 * @author mosin
 * @DATE 2021年5月26日
 */
public class DataStreamDemo {
	//  @before  @after  
	@Test
	public void test01() throws Exception {
		
		FileOutputStream fos = new  FileOutputStream("data.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		//调用方法 写出数据
		dos.writeInt(97);
		dos.writeDouble(20.5);
		dos.writeBoolean(true);
		dos.writeUTF("合肥");
		//关闭流 释放资源
		dos.close();
	}
	
	@Test
	public void test02() throws Exception {
		
		FileInputStream fis = new FileInputStream("data.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		//调用方法 读取数据  按照写出的顺序读取  
		int readInt = dis.readInt();
		System.out.println(readInt);
		double readDouble = dis.readDouble();
		System.out.println(readDouble);
		boolean readBoolean = dis.readBoolean();
		System.out.println(readBoolean);
		String readUTF = dis.readUTF();
		System.out.println(readUTF);
		
		dis.close();
		
	}
		
	
	
	

}
