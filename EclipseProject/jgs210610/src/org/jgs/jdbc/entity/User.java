package org.jgs.jdbc.entity;
/*
 * 创建用户类 用于封装查询的数据结果
 */

import java.util.Date;

public class User {
	
	private int id;
	private String username;
	private String password;
	private Date birth;
	private Date createTime;
	public User() {
	
	}
	public User(int id, String username, String password, Date birth, Date createTime) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.birth = birth;
		this.createTime = createTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("set方法被调用");
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", birth=" + birth
				+ ", createTime=" + createTime + "]";
	}

}
