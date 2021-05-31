package org.jgs.iotest.day01;
/**
 * 封装注册逻辑 工具类
 * 
 * @author mosin
 * @DATE 2021年5月27日
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public  final class Regist {
	

	//将方法写成 静态方法方便调用  判定用户名是否存在
	public static boolean  checkUserName(String username){
		try {
			
			//创建字符输入流
			FileReader fr = new FileReader("user.txt");
			BufferedReader br = new  BufferedReader(fr);
			
			String line = null;
			while((line = br.readLine())!=null) {
				
				String[] userInfo = line.split(":");
				List<String> userList = Arrays.asList(userInfo);
				if(userList.contains(username)) {
					return true;
				}
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}

	
	public static void regist(String username,String pwd){
		
		
		try {
			//创建字符输出流
			FileWriter fw = new FileWriter("user.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(username+":"+pwd);
			bw.newLine();
			bw.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
