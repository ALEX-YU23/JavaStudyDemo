package org.jgs.javafiletest;

import java.io.File;

public class HowManyFiles {

	public static int filesCount = 0;
	public static int dirsCount = 0;
	
	public static void main(String[] args) {
		File scShortDir = new File("D:\\Java21111\\LearNote\\test");
		System.out.println(scShortDir.getName());
		
		countfiles(scShortDir);
		
		System.out.println("filesCount :"+filesCount+"个文件");
		System.out.println("dirsCount :"+dirsCount+"个目录");
		
		
	}
	
	public static void countfiles(File scShortDir) {
		
		
		File[] listFiles = scShortDir.listFiles();
		
		
		
		for (File file : listFiles) {
			if (file.isFile()) {
				filesCount++;
			}else {
				dirsCount++;
				countfiles(file);
			}
		}

		
	}

}
