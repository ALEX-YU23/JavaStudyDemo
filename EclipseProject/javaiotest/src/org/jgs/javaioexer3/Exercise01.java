package org.jgs.javaioexer3;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

public class Exercise01 {

	/*
		（一） 在电脑D盘下创建一个文件为HelloWorld.txt文件，判断他是文件还是目录，在创建一个目
		录IOTest,之后将HelloWorld.txt移动到IOTest目录下去；之后遍历IOTest这个目录下的文件
	 */
	@Test
	public void exer01() throws AWTException {
		//在电脑D盘下创建一个文件为HelloWorld.txt文件
		File file = new File("d://HelloWorld.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Robot r = new Robot();
		r.delay(5000);
		//判断HelloWorld.txt是文件还是目录
		if (file.isFile()) {
			//在创建一个目录IOTest
			File dir = new File("d://IOTest");
			dir.mkdir();
			File destFile = new File(dir.getAbsoluteFile()+"//"+file.getName());
			file.renameTo(destFile);
		}
	}
	/*
	 （二） 递归实现输入任意目录，列出文件以及文件夹，效果看图
	 */
	// 法1: 无返回值,仅做展示
	public void showFileList01(File file) {
		// 文件存在并且是一个文件夹
		if (file.exists()&file.isDirectory()) {
			// 输出文件夹名
			System.out.println("dir:"+file.getName());
			// .listfile获得文件夹内目录
			File[] listFiles = file.listFiles();
			// 判断文件夹是否为空
			if (listFiles.length>0) {
				// 遍历文件夹
				for (File subFile : listFiles) {
					// 递归调用本方法
					showFileList01(subFile);
				}
			}
			// 文件存在并且是一个文件
		} else if (file.exists()&file.isFile()){
			// 输出文件名
			System.out.println("file:"+file.getName());
		}
	}
	@Test
	public void exer02(){
		File file = new File("D:\\Mysoft\\软件\\Reader_v1.9.2.2");
		showFileList01(file);
	}
	// 法1: 返回file类的ArrayList
	public ArrayList<File> showFileList02(File file,ArrayList<File> filelist) {
		// 文件存在并且是一个文件夹
		if (file.exists() & file.isDirectory()) {
			// 将文件夹加入Arraylist
			// .listfile获得文件夹内目录
			File[] listFiles = file.listFiles();
			// 判断文件夹是否为空
			if (listFiles.length > 0) {
				// 遍历文件夹
				for (File subFile : listFiles) {
					// 递归调用本方法
					showFileList02(subFile,filelist);
				}
			}
		} else if (!file.exists()){
			return filelist;
		}
		
		filelist.add(file);
		return filelist;
	}
	@Test
	public void exer02_1(){
		File file = new File("D:\\Mysoft\\软件\\Reader_v1.9.2.2");
		ArrayList<File> fileList = showFileList02(file,new ArrayList<File>());
		for (File file2 : fileList) {
			System.out.println(file2);
		}
	}
	
	/*
	 （三） 递归实现列出当前工程下所有.java文件 
	 */
	@Test
	public void exer03_0(){
		File file = new File(".\\");
		ArrayList<File> fileList = showFileList02(file,new ArrayList<File>());
	
		for (File f : fileList) {
			if (f.getName().endsWith(".java")) {
				System.out.println(f);
			}
		}
	}
	// 返回只有.java的文件
	public ArrayList<File> javaFile(File file,ArrayList<File> filelist) {
		// 文件存在并且是一个文件夹
		if (file.exists() & file.isDirectory()) {
			// 将文件夹加入Arraylist
			// .listfile获得文件夹内目录
			File[] listFiles = file.listFiles();
			// 判断文件夹是否为空
			if (listFiles.length > 0) {
				// 遍历文件夹
				for (File subFile : listFiles) {
					// 递归调用本方法
					javaFile(subFile,filelist);
				}
			}
		}else if (file.getName().endsWith(".java")){
			filelist.add(file);
		}else if (!file.exists()){
			return filelist;
		}
		
		
		return filelist;
	}
	@Test
	public void exer03_1(){
		File file = new File(".\\");
		ArrayList<File> fileList = javaFile(file,new ArrayList<File>());
	
		for (File f : fileList) {
			System.out.println(f);
		}
	}
	
	/*
	 （四）从磁盘读取一个文件到内存中，再打印到控制台
	 */
	
	@Test
	public void exer04_0(){
		BufferedReader br = null;
		try {
			// 初始化输入流
			br = new BufferedReader(new FileReader(new File("hello.txt")));
			
			char[] cbuf = new char[64];
			int len ;
			while ((len=br.read(cbuf))!=-1) {
				System.out.println(new String(cbuf, 0, len));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	// TODO CharArrayReader改造一下程序
	@Test
	public void exer04_1(){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File("hello.txt")));
			
			char[] cbuf = new char[64];
			int len ;
			while ((len=br.read(cbuf))!=-1) {
				System.out.println(new String(cbuf, 0, len));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/*
	 五） 在程序中写一个"HelloJavaWorld你好世界"输出到操作系统文件Hello.txt文件中
	*/
	@Test
	public void exer05_0(){
		String str = "HelloJavaWorld你好世界";
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(new File("Hello.txt")));
			bw.write(str);
			System.out.println("写入完成");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/*
	 （六） 拷贝一张图片，从一个目录到另外一个目录下(PS:是拷贝是不是移动)
		 1.开启输入流将源文件读入
		 2.开启输出流将文件写到另一个地址
	 */
	@Test
	public void exer06_0(){
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			// 创建流
			bis = new BufferedInputStream(new FileInputStream(new File("小姐姐.jpg")));
			bos = new BufferedOutputStream(new FileOutputStream(new File("E:\\temp\\小姐姐.jpg")));
			// 实现复制
			byte[] data = new byte[64];
			int len;
			while ((len=bis.read(data))!=-1) {
				bos.write(data, 0, len);
			}
			System.out.println("复制完毕!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭流
			if (bis!=null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bos!=null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/*
	 （七） 统计一个文件calcCharNum.txt（见附件）中字母'A'和'a'出现的总次数
	 1.先将文件读入,再存入字符串
	 2.再统计字符串中字母'A'和'a'出现的总次数
	 3.输出
	 */
	//2.再统计字符串中字母'A'和'a'出现的总次数
	private int calCharAa(StringBuilder str) {
		int num=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='A'||str.charAt(i)=='a') {
				num++;
			}
		}
		return num;
	}
	@Test
	public void exer07_0(){
		BufferedReader bis = null;
		try {
			// 创建流
			bis = new BufferedReader(new FileReader(new File("E:\\temp\\calcCharNum.txt")));
			char[] data = new char[64];
			int len;
			StringBuilder sb = new StringBuilder();
			while ((len=bis.read(data))!=-1) {
				sb.append(data, 0, len);
			}
			int calCharAa = calCharAa(sb);
			System.out.println("字母'A'和'a'出现的总次数:"+calCharAa);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭流
			if (bis!=null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/*
	 （八）统计一个文件calcCharNum.txt（见附件）中各个字母出现次数：
	 A(8),B(16),C(10)...,a(12),b(10),c(3)....，括号内代表字符出现次数;
	 */
	private HashMap<Character, Integer> calCharLetter(StringBuilder str) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (((str.charAt(i)>'A'&&str.charAt(i)<'Z')||(str.charAt(i)>'a'&&str.charAt(i)<'z'))) {
				if (hashMap.containsKey(str.charAt(i))) {
					hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
				}else {
					hashMap.put(str.charAt(i), 1);
				}
			}
		}
		return hashMap;
	}
	@Test
	public void exer08_0(){
		BufferedReader bis = null;
		try {
			// 创建流
			bis = new BufferedReader(new FileReader(new File("E:\\temp\\calcCharNum.txt")));
			char[] data = new char[64];
			int len;
			StringBuilder sb = new StringBuilder();
			while ((len=bis.read(data))!=-1) {
				sb.append(data, 0, len);
			}
			HashMap<Character, Integer> calCharLetter = calCharLetter(sb);
			calCharLetter.forEach((c,i)->System.out.println(c + ":" + i));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭流
			if (bis!=null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/*
	（九）统计一个文件calcCharNum2.txt（见附件）中各个字符出现次数：
	A(8),B(16),C(10)...,a(12),b(10),c(3)....中(5),国(6)，括号内代表字符出现次数;

	 */
	private HashMap<Character, Integer> calChar(StringBuilder str) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (hashMap.containsKey(str.charAt(i))) {
				hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
			}else {
				hashMap.put(str.charAt(i), 1);
			}
		}
		return hashMap;
	}
	@Test
	public void exer09_0(){
		BufferedReader bis = null;
		try {
			// 创建流
			bis = new BufferedReader(new FileReader(new File("E:\\temp\\calcCharNum.txt")));
			char[] data = new char[64];
			int len;
			StringBuilder sb = new StringBuilder();
			while ((len=bis.read(data))!=-1) {
				sb.append(data, 0, len);
			}
			HashMap<Character, Integer> calChar = calChar(sb);
			calChar.forEach((c,i)->System.out.println(c + ":" + i));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭流
			if (bis!=null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/*
	 * （十） 使用随机文件流类RandomAccessFile将一个文本文件倒置读出。
	 */
	@Test
	public void exer10_0(){
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("data.txt", "rw");
			
			byte[] buff = new byte[32];
			// 数组输入流
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			int len;
			while ((len=raf.read(buff))!=-1) {
				baos.write(buff, 0, len);
			}
			// 文本倒置输出
			System.out.println(new StringBuilder(baos.toString()).reverse());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (raf!=null) {
				try {
					raf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/*
	 * （十一） 编写一个Java应用程序，可以实现Dos中的type命令，并加上行号。
	 * 即将文本文件在控制台上显示出来，并在每一行的前面加上行号。
	 * 1.用字符缓冲输入流,每次读入一行
	 * 2.再打印到控制台
	 */
	@Test
	public void test(){
		File file = new File("hello.txt");
		System.out.println(file.getParent());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
	}
	
	@Test
	public void exer11_0(){
		BufferedReader br = null;
		try {
			String path = ".\\src\\org\\jgs\\javaioexer3\\Exercise01.java";
			// 1.造字符输入流
			br = new BufferedReader(new FileReader(new File(path)));
			// 2.输出到控制台
			String data;
			int len = 1;
			while ((data=br.readLine())!=null) {
				// 编辑行号
				System.out.println(len+++":  "+data);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3.关闭流
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/*
	 * （十二）输入两个文件夹名称，将A文件夹内容全部拷贝到B文件夹，要求使用多线程来操作。
	 */
	
	/*
	 * （十三）查看D盘中所有的文件和文件夹名称，并且使用名称升序降序，文件夹在前和文件夹在
	 * 后，文件大小排序等。 
	 * 
	 * 1.考虑使用ArrayList来存储file对象
	 * 2.自定义排序规则
	 * 3.打印输出
	 */
	// 排序一个文件夹
	public void ls(File file,ArrayList<File> filelist) {
		if(file.exists()) {
			filelist.add(file);
			if(file.length()!=0&&file.isDirectory()){
				File[] listFiles = file.listFiles();
				if (listFiles==null) {
					return;
				}
				for (File f : listFiles) {
					ls(f, filelist);
				}
			}
		}
	}
	@Test
	public void exer13_0(){
		File file = new File("E:\\");
		ArrayList<File> filelist = new ArrayList<File>();
		
		ls(file,filelist);
		
		
		filelist.sort(new Comparator<File>() {

			@Override
			public int compare(File f1, File f2) {
				if (f1.isDirectory()&&f2.isDirectory()) {
					return f1.getName().compareTo(f2.getName());
				} else if (f1.isFile()&&f2.isFile()) {
					return (int)(f1.length()-f2.length());
				} else if (f1.isDirectory()&&f2.isFile()) {
					return -1;
				} else if (f1.isFile()&&f2.isDirectory()) {
					return 1;
				} 
				return 0;
			}
		});
		filelist.forEach(x->System.out.println(x.getName()));
	}
	/**
	 * 28．使用输入流读取试题文件，每次显示试题文件中的一道题目。
	 * 读取到字符“*”时暂停读取，等待用户从键盘输入
	 */
	@Test
	public void exer14_0(){
		
	}
}
