package org.jgs.javahighday01.eneity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
public class User implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 435835482659262780L;


	private String username;
	private String password;
	
	
	
	
	
	
	
}
