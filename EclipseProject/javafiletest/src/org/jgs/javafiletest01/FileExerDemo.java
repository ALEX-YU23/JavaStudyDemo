package org.jgs.javafiletest01;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
@SuppressWarnings("unused")
public class FileExerDemo {

//	Constructor and Description 
  
 

 

	
	public static void main(String[] args) throws URISyntaxException {
//		test01();
//		test00();
//		test02();
//		test03();
		File file = new File("E:\\temp - 副本");
		
//		System.out.println(file.delete());
		
		
		boolean deleteBlankFiles = deleteBlankFiles(file);
		if (deleteBlankFiles) {
			System.out.println("删除成功");
		}else {
			System.err.println("文件路径不存在，请输入正确的路径");
		}

	}
	
	/**
	 * 
	 * 删除空文件夹和空白文件（包括子文件和文件夹）
	 */
	private static boolean deleteBlankFiles(File file) {
		if (!file.exists()) {
			return false;
		}
		if (file.isDirectory()) { // 判断文件是否为文件夹
			File[] listFiles = file.listFiles();
			for (File subfile : listFiles) {
				deleteBlankFiles(subfile); // 递归调用删除子文件夹
			}
			// 删除自身
			if (file.delete()) {
				
				System.out.println(file+":  为空");
			}
		}else if(file.length()==0){
			file.delete();
		}
		return true;
	}
	
	
	
	
	
	/**
	 * 
	 * 删除空文件夹（包括子文件和文件夹）
	 */
	private static boolean deleteBlankDirs(File file) {
		if (!file.exists()) {
			return false;
		}
		if (file.isDirectory()) { // 判断文件是否为文件夹
			File[] listFiles = file.listFiles();
			for (File subfile : listFiles) {
				deleteBlankDirs(subfile); // 递归调用删除子文件夹
			}
			// 删除自身
			if (file.delete()) {
				
				System.out.println(file+":  为空");
			}
		}
		return true;
	}

	/**
	 * 
	 * 删除文件夹（包括子文件和文件夹）
	 */
	private static boolean deleteDirs2(File file) {
		if (!file.exists()) {
			return false;
		}
		if (!file.delete()) { // 尝试删除文件，若删除失败则file为非空文件夹
			File[] listFiles = file.listFiles();
			for (File subfile : listFiles) {
				deleteDirs2(subfile); // 递归调用删除子文件夹
				file.delete(); // 删除自身
			}
		}
		return true;
	}
	
	
	
	/**
	 * 
	 * 删除文件夹（包括子文件和文件夹）
	 */
	private static void deleteDirs(File file) {
		
		
		if (!file.delete()) { // 尝试删除文件，若删除失败则file为非空文件夹
			File[] listFiles = file.listFiles();
			try {
				for (File subfile : listFiles) {
					deleteDirs(subfile); // 递归调用删除子文件夹
				}
				file.delete(); // 删除自身
			} catch (java.lang.NullPointerException e) {
				System.err.println("请输入正确的路径");
				System.exit(0);
			}

		}

	}

	/**
	 * 
	 * 删除文件夹（包括子文件和文件夹）
	 */
	private static void deleteDirs1(File file) {
		if (!(file.isFile())) { // 判断是否是文件夹
			File[] listFiles = file.listFiles();
			if (listFiles.length!=0) { // 判断是否空文件夹
				for (File subfile : listFiles) {
					deleteDirs1(subfile);  // 递归调用
				}
			}
		}
		file.delete();  // 删除文件或者文件夹
		
	
	}
	
	/**
	 * File(URI uri) 
	 * 通过将给定的 file: URI转换为抽象路径名来创建新的 File实例。
	 * @Description
	 * @author AlexYU 
	 * @date 2021年5月22日上午11:51:05
	 * @throws URISyntaxException
	 */
	private static void test03() throws URISyntaxException {
		URI uri = new URI("https://github-releases.githubusercontent.com/64713769/05799280-b0fd-11eb-8455-370acd7efd97?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAIWNJYAX4CSVEH53A%2F20210522%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20210522T032606Z&X-Amz-Expires=300&X-Amz-Signature=839a79566738fc81cfed23f59e532bfa066147879b3bdd25893e6e354fc52d04&X-Amz-SignedHeaders=host&actor_id=39024096&key_id=0&repo_id=64713769&response-content-disposition=attachment%3B%20filename%3DScreenToGif.2.30.Setup.msi");
		File file = new File(uri);
		System.out.println(file);
		
	}
//	File(String parent, String child) 
//	从父路径名字符串和子路径名字符串创建新的 File实例。

	private static void test02() {
		File file = new File("e:\\temp","tobenum1.txt");
		System.out.println(file);
		
	}
//	File(File parent, String child) 
//	从父抽象路径名和子路径名字符串创建新的 File实例。
	private static void test00() {
		File file = new File("e:\\temp");
		File tobenum1 = new File(file, "tobenum1.txt");
		System.out.println(tobenum1);
	}
	
//	File(String pathname) 
//	通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
	private static void test01() {
		File file = new File("e:\\temp");
		System.out.println(file);
	}

	

}
