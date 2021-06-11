package org.jgs.javahighday01;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.jgs.javahighday01.control.LGService;
import org.jgs.javahighday01.exception.PassWordNotFormatException;
import org.jgs.javahighday01.exception.UserListNullException;
import org.jgs.javahighday01.exception.UsernamePasswordMismatchException;
import org.jgs.javahighday01.exception.UsernameUniqueException;

/**
 * 使用ArrayList作为数据存储，实现用户注册和登录功能
 * 要求:
 * 1.使用User实体类保存用户信息:用户名、密码等
 * 2.注册时校验用户名是否重复                          ---|
 * 3.注册时校验用户密码是否是六为并且由字母和数字组成   ---|对应三个异常
 * 4.登录时校验用户名或者密码是否正确                  ---|
 * 5.所有错误信息使用白定义异常抛出
 * 
 */
public class Work01 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// 程序开始,循环之前读入数据
		LGService.readUserData();
		boolean flag = true;
		while (flag) {
			// 展示界面
			LGService.view();
			int choice = 0;
			System.out.print("请输入(1 or 2):");
			try {
				choice = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("InputMismatchException:"+e.getMessage());
				break;
			}
			
			switch (choice) {
			case 1:
				try {
					LGService.login();
				} catch (UsernamePasswordMismatchException e) {
					System.out.println(e.getMessage());
				} catch (InputMismatchException e) {
					System.out.println("\n输入不匹配:"+e.getMessage());
				} catch (UserListNullException e) {
					System.out.println(e.getMessage());
				}
				
				System.out.println("输入任意字符继续");
				input.next();
				break;
			case 2:
				try {
					LGService.regist();
				} catch (UsernameUniqueException | PassWordNotFormatException e) {
					System.out.println(e.getMessage());
				} catch (InputMismatchException e) {
					System.out.println("\n输入不匹配:"+e.getMessage());
				}
				break;
			case 3:
				flag = LGService.exit();
				break;
			default:
				break;
			}
		}
		// 程序结束前,循环之后写出数据
		LGService.writeUserData();
	}
	
	
	
}
