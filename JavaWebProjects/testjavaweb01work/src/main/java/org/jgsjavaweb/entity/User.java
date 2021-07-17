package org.jgsjavaweb.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	private Integer id;
	private String username;
	private String password;
	private Date birthday;
}
