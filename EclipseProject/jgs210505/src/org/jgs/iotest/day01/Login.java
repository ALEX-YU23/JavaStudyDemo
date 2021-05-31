package org.jgs.iotest.day01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

/**
 * 登录逻辑
 * @author mosin
 * @DATE 2021年5月27日
 */
public final  class Login {
	
	
	public static boolean login(String username ,String pwd) {
		
		try {
			//创建字符输入流
			FileReader fr = new FileReader("user.txt");
			BufferedReader br = new  BufferedReader(fr);
			String userInfo = username+":"+pwd;
			String line = null;
			while((line = br.readLine())!=null) {
				
				if(userInfo.equals(line)) {
					return true;
				}
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	

}
