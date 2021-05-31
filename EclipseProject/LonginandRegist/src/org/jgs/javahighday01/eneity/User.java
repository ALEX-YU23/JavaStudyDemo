package org.jgs.javahighday01.eneity;

import java.io.Serializable;

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
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4939519881594346353L;
	
	private String username;
	private String password;

	
	
	
	
	
	
}
