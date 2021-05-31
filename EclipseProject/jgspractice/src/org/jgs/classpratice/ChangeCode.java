package org.jgs.classpratice;

import java.util.*;

class Code{
	 public String username = "9527" ;
	 public String password = "122" ;
	 
		/*
		 * public void judge(String user,String pw) { if (username.equals(user) &&
		 * password.equals(pw)) { Scanner scan = new Scanner(System.in);
		 * System.out.println("原密码正确，请修改"); System.out.print("请输入用户名："); username =
		 * scan.next(); System.out.print("请输入密码："); password = scan.next();
		 * scan.close(); }else { System.out.println("原密码错误！！不能修改"); } }
		 */
	 
	 public void showInfo() {
		 System.out.println("用户名：" + username);
		 System.out.println("密码：" + password);
	 }
}


public class ChangeCode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Code code = new Code();
		
		System.out.print("请输入用户名：");
		String username = scan.next();
		System.out.print("请输入密码：");
		String password = scan.next();
		

		if (username.equals(code.username) && password.equals(code.password)) {
			System.out.println("原密码正确，请修改");
			
			System.out.print("请输入密码：");
			code.password = scan.next(); 
			System.out.println("密码更新成功");
			System.out.println();
			
			
			code.showInfo();
			scan.close();
		}else {
			System.out.println("原密码错误！！不能修改");
		}
	}
	
}
