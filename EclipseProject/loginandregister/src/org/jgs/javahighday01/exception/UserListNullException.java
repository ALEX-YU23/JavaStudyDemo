package org.jgs.javahighday01.exception;
/**
 * 
 * @Description 用户名重复异常
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年5月10日下午3:01:14
 */
public class UserListNullException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = -1105018545070827272L;

	public UserListNullException() {
		super("用户列表为空!!请先注册在登录!");
	}

	
	
	
	
}
