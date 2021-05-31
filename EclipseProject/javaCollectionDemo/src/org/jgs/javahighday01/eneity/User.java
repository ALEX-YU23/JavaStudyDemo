package org.jgs.javahighday01.eneity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @Description 用户实体类
 * @author AlexYU Email:alex2354629991@gmail.com
 * @version
 * @date 2021年5月9日下午3:50:38
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private String username;
	private String password;
	private String realname;
	private String phonenum;
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", realname=" + realname + ", phonenum="
				+ phonenum + "]";
	}
	
	
	
	
	
}
