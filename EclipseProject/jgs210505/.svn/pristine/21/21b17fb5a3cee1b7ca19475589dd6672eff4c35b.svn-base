package org.jgs.iodemo.day01;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Date;

import org.junit.Test;

/**
 * IO  java.io
 * 
 * File 文件和目录路径名的抽象表示     只能访问文件的属性 不能访问文件的内容
 * File实例对象简单理解为文件系统中的普通文件和文件夹
 * 
 * 1.构造方法
 * 	File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例
 * 	给定的路径可以是真实存在，也可以是虚拟的
 * 	绝对路径： 完全路径  从盘符开始的路径  D:\a\b.txt  linux 没有盘符概念
 *  相对路径:  简化路径  相对当前项目的根目录  b.txt
 * 	File(String parent, String child) 从父路径名字符串和子路径名字符串创建新的 File实例
	使用两个参数创建对象 会更加的灵活
	File(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例
	File对象的形式传递参数  那么可以使用File中封装的一些方法   便于对File对象进行操作
 * @author mosin
 * @DATE 2021年5月22日
 */
public class FileDemo {
	
	@Test
	public void test01() {
		
		//创建File对象
		File file = new File("E:\\a\\a.txt");
		//判定路径指代的对象是否存在
		boolean exists = file.exists();
		System.out.println(exists);
		
		String parent = "E:\\a\\";
		String child = "a.txt";
		
		//File(String parent, String child)
		File file2 = new File(parent,child);
		//查看file2的具体路径
		String path = file2.getPath();
		System.out.println(path);
		
		//File(File parent, String child) 
		 File parent2 = new File(parent);
		 File file3 = new File(parent2,child);
		//查看这种方式创建对象的路径
		 String path3 = file3.getPath();
		System.out.println(path3);
		//查看文件夹中的详细目录
		File[] listFiles = file.listFiles();
			
	}
	
	@Test
	public  void test02() {//文件分隔符，路径分隔符
		/*
		 * 1.pathSeparator 与系统相关的路径分隔符字符，为方便起见，表示为字符串
		   2.separator 系统相关的默认名称 - 分隔符字符，以方便的方式表示为字符串
		 */
		
		System.out.println("系统默认的文件分割符:"+File.separator);
		System.out.println("路径分隔符:"+File.pathSeparator);  //;
		
		//使用系统默认的分割符 创建file对象 E:\a\a.txt
		
		File file = new File("E:"+File.separator+"a"+File.separator+"a.txt");
		System.out.println(file.getPath());
		
	}
	
	@Test
	public  void test03() throws IOException { //常用方法介绍
		
		File file = new File("E:\\a");
		//查看对象是否存在
		if( !file.exists()) {
			//创建文件
			boolean b = file.createNewFile();
			//boolean mkdir = file.mkdir();
			System.out.println("文件创建成功:"+b);
		}
		
		//获取文件的名字
		String name = file.getName();
		System.out.println("文件的名字:"+name);
		//获取文件的大小
		long length = file.length();
		System.out.println("文件的大小:"+length);
		//看文件是否可读可写
		System.out.println("可读:"+file.canRead());
		System.out.println("可写:"+file.canWrite());
		//查看文件是否隐藏
		System.out.println("是否隐藏:"+file.isHidden());
		//查看文件的路径
		System.out.println("文件的路径:"+file.getAbsolutePath());
		//查看文件的最后一次修改时间
		long lastModified = file.lastModified();
		System.out.println("最后一次修改时间:"+new Date(lastModified));
		//判定文件是普通文件还是文件夹
		System.out.println("文件是文件夹:"+file.isDirectory());
		System.out.println("是普通的文件:"+file.isFile());
		
	}
	
	@Test
	public  void test04() throws IOException { //删除文件
		
		File file = new File("E:\\a");
		if( !file.exists()) {
			//创建文件
			//boolean b = file.createNewFile();
			// boolean mkdir = file.mkdir();
			//递归的创建文件夹 父目录可以不存在 不存在会自动创建
			file.mkdirs();
		}
		//删除文件  只能删除空文件夹
		file.delete();
	}
	
	@Test
	public  void test05() throws IOException { //删除非空文件夹
		
		File file = new File("E:/a");
		delete(file);
		System.out.println("删除完毕");
	}
	
	
	public void delete(File file) {//删除文件的方法
		
		//判定文件的类型
		if(file.isDirectory()) {
			//查看目录中的内容
			File[] files = file.listFiles();
			//遍历数组 查看文件的属性 
			for (File file2 : files) {
				//调用delete方法  递归思想  使用递归必须添加判定条件  否则会是死循环
				delete(file2);
			}
		}
		//删除文件或者清空的文件夹
		file.delete();
	}
	
	@Test
	public  void test06() throws IOException { //获取文件夹中的内容
		//指代的就是项目所在的根目录
		File file = new File("./");
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			System.out.println(file2.getName());
		}
	}
	
	
	@Test
	public  void test07() throws IOException { //获取文件夹中指定的内容
		//指代的就是项目所在的根目录
		File file = new File("./");
		File[] listFiles = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {//获取文件名字长度大于5的文件
				String name = pathname.getName();
				return name.length()>5;
			}
		});
		for (File file2 : listFiles) {
			System.out.println(file2.getName());
		}
	}
	
	@Test
	public  void test08() throws IOException {
		//指代的就是项目所在的根目录
		File file = new File("./");
		File[] listFiles = file.listFiles(f-> f.getName().startsWith("."));
		for (File file2 : listFiles) {
			System.out.println(file2.getName());
		}
	}

}
