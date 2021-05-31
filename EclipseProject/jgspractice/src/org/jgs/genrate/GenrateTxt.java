package org.jgs.genrate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @Description  输出到文档里
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年4月16日下午4:41:08
 */
public class GenrateTxt {

	public static void main(String[] args) {
		// 创建一个文件
		File fouput=new File("e://out1.txt");
		// 创建输出流
        FileOutputStream fileOutputStream = null;
		try {
			// 实例化文件输出流
			fileOutputStream = new FileOutputStream(fouput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// 将文档流设置进打印流
        PrintStream printStream = new PrintStream(fileOutputStream);
        // 设置打印流
        System.setOut(printStream);
        
        String finput = "e:\\out.txt";
        String[] readTxtFile = ReadTxt.readTxtFile(finput);
        
        for (int i = 0; i < readTxtFile.length; i++) {
        	System.out.println((i+1) + ". " + readTxtFile[i]);
			
		}
        System.out.println(readTxtFile.length);

	}

}
