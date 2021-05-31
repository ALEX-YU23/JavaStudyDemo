package org.jgs.javafiletest;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class FileTest {

	@Test
	public void test() {
		
		String filePath = "e:\\temp";
		
		File temp = new File(filePath);
		
		boolean exists = temp.exists();
		
		if (!exists) {
			// 创建文件夹
			temp.mkdirs();
		}
		
		System.out.println(exists);
	}
	
	@Test
	public void test01() {
		String filePath = "e:\\temp";
		File file = new File(filePath);
		// 获得文件夹内文件列表（文件类型）
		File[] listFiles = file.listFiles();
		for (File f : listFiles) {
			// 获得文件名
			System.out.println(f.getName());
			// 获得文件大小
			System.out.println(f.length());
			// 获得父级文件路径
			System.out.println(f.getParent());
			// 获得文件路径路径
			System.out.println(f.getPath());
			// 获得文件绝对路径
			System.out.println(f.getAbsolutePath());
			
			System.out.println();
		}
	}
	@Test
	public void test02() {
		String filePath = "e:\\temp";
		File file = new File(filePath);
		String[] list = file.list();
		for (String string : list) {
			System.out.println(string);
		}
	}
	@Test
	public void test03() {
		String filePath = "e:\\temp\\out1.txt";
		File file = new File(filePath);
		// 文件重命名
		file.renameTo(new File(file.getParent()+"\\"+file.getName().replace('1', '9')));
		
	}
	@Test
	public void test04() {
		String filePath = "e:\\temp\\test";
		File file = new File(filePath);
		// delete只能删除空文件夹
		boolean delete = file.delete();
		System.out.println(delete);
	}
	@Test
	public void test05() throws IOException {
		File file = new File("E:\\temp\\out9.txt");
		// file同路径下新建一个文件或者文件目录
		//String newFileString = file.getParent()+"\\"+"new_out.txt";
		//File file2 = new File(newFileString);
		File file2 = new File(file.getParentFile(), "new_out1.txt");
		File file3 = new File(file.getParentFile(), "new_out11");
//		file2.createNewFile();
		boolean mkdir = file3.mkdir();
		if (mkdir) {
			System.out.println("创建成功");
		}
		file2.delete();
	}
//	2.判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
	//  .+\.jpg
	
	@Test
	public void test06() throws IOException {
		File file = new File("E:\\temp\\");
		String[] list = file.list();
		for (String fname : list) {
			if (fname.matches(".+\\.jpg")) {
				System.out.println(fname);
			}
		}
	}
	@Test
	public void name() {
		boolean matches = "x遍地撒生鲜电商vvvv.jpg".matches(".+\\.jpg");
		System.out.println(matches);
	}
	
	



	@Test
	public void test07() throws IOException {
		File file = new File("E:\\temp - 副本 (2)");
		delete1(file);
	}
//	3.遍历指定目录所有文件名称，包括子文件目录中的文件。
	public void traverse(File listFiles) {
		
		for (File f : listFiles.listFiles()) {
			if (f.isDirectory()) {
				traverse(f);
			} else {
				System.out.println(f.getName());
			}
			
		}
	}
//	拓展1:并计算指定目录占用空间的大小
	public double count(File listFiles) {
		double mm = 0;
		for (File f : listFiles.listFiles()) {
			if (f.isDirectory()) {
				mm+=count(f);
			} else {
				mm+=f.length();
			}
			
		}
		return mm/1024/1024;
		
	}
//	拓展2:删除指定文件目录及其下的所有文件
	public void delete(File files) {
//		int mm = 0;
		File[] listFiles = files.listFiles();
		if (listFiles.length==0) {
			System.out.println(files+"   空");
			files.delete();
		} else {
			for (File file : listFiles) {
				System.out.println(file);
				if (file.isDirectory()) {
					delete(file);
				} else {
					file.delete();
				}
			}
		}
		
		files.delete();
//		return mm;
		
	}
	public void delete1(File files) {
//		int mm = 0;
		File[] listFiles = files.listFiles();
		for (File file : listFiles) {
			System.out.println(file);
			if (file.isDirectory()) {
				delete1(file);
			} else {
				file.delete();
			}
		}
		
		files.delete();
//		return mm;
		
	}
	
	
}
