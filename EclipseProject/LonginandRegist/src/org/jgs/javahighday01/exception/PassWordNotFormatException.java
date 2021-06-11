package org.jgs.javahighday01.exception;
/**
 * 
 * @Description 用户名重复异常
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年5月10日下午3:01:14
 */
public class PassWordNotFormatException extends Exception {

	private static final long serialVersionUID = -4774765837717449238L;

	public PassWordNotFormatException(String password) {
		super("密码由六位数字或字母组成:"+password+"\n");
	}

	
	
	
	
}
