package org.jgs.javaiotest02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

/*
 * RandomAccessFile的使用
 * 1. RandomAccessFile直接继承于java. lang. object类，实现了DataInput和DataOutput接口
 * 2. RandomAccessFile既可以作为一个输入流， 又可以作为一个输出流
 * 3.如果RandomAccessFile作为输出流时，写出到的文 件如果不存在，则在执行过程中自动创建
 *  如果写出到的文件存在，则会对原有文件内容进行覆盖。(默认情况下， 从头覆盖)
 * 4.可以通过相关的操作，实现RandomAccessFile"插入”数据的效果
 */
public class RandomAccessFileTest {

	//RandomAccessFile既可以作为一个输入流， 又可以作为一个输出流
	@Test
	public void testRandomAccessFileInput() {
		RandomAccessFile raf1 = null;
		RandomAccessFile raf2 = null;
		try {
			raf1 = new RandomAccessFile(new File("小姐姐.jpg"),"r");
			raf2 = new RandomAccessFile(new File("小姐姐_1.jpg"),"rw");
			
			byte[] buff = new byte[1024];
			int len;
			while ((len = raf1.read(buff))!=-1) {
				raf2.read(buff, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (raf1!=null) {
				try {
					raf1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (raf2!=null) {
				try {
					raf2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	@Test
	public void test1() {
		RandomAccessFile raf1 = null;
		try {
			raf1 = new RandomAccessFile(new File("hello.txt"),"rw");
			
			// 指定覆写位置
			raf1.seek(3);
			raf1.write("xllsb".getBytes());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (raf1!=null) {
				try {
					raf1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/*
	 使用RandomAccessFile实现数据的插入效果
	*/
	@Test
	public void test1_0() {
		RandomAccessFile raf1 = null;
		try {
			File file = new File("hello.txt");
			raf1 = new RandomAccessFile(file,"rw");
			
			// 指定覆写位置
			raf1.seek(3);
			//保存指针3后面的所有数据到StringBuilder中
			StringBuilder sB = new StringBuilder((int)file.length());
			byte[] buff = new byte[1024];
			int len ;
			while ((len=raf1.read(buff))!=-1) {
				sB.append(new String(buff, 0, len));
			}
			// 指定覆写位置
			raf1.seek(3);
			
			raf1.write("xllsb".getBytes());
			// 将sb中字符写到后面
			raf1.write(sB.toString().getBytes());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (raf1!=null) {
				try {
					raf1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	//思考:将StringBuilder 替换为ByteArrayoutputStream
	@Test
	public void test1_1() {
		RandomAccessFile raf1 = null;
		try {
			File file = new File("hello.txt");
			raf1 = new RandomAccessFile(file,"rw");
			
			// 指定覆写位置
			raf1.seek(3);
			//保存指针3后面的所有数据到StringBuilder中
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] buff = new byte[1024];
			int len ;
			while ((len=raf1.read(buff))!=-1) {
				baos.write(buff, 0, len);
			}
			// 指定覆写位置
			raf1.seek(3);
			
			raf1.write("ddddddd".getBytes());
			// 将sb中字符写到后面
			raf1.write(baos.toString().getBytes());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (raf1!=null) {
				try {
					raf1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
