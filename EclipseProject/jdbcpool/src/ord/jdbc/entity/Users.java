package ord.jdbc.entity;

import java.util.Date;

public class Users {

	private String username;
	private String password;
	private int age;
	private Date birthday;
	private Date createTime;
	
	public Users() {
		
	}
	
	public Users(String username, String password, int age, Date birthday, Date createTime) {
		this.username = username;
		this.password = password;
		this.age = age;
		this.birthday = birthday;
		this.createTime = createTime;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", age=" + age + ", birthday=" + birthday
				+ ", createTime=" + createTime + "]";
	}
	
	
	
	
}
