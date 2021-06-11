package org.jgs.jdbc.service;

import org.jgs.jdbc.dao.UserDao;
import org.jgs.jdbc.entity.User;

/**
 * 用户的业务层 只做业务分析 不做和数据相关的任何操作
 * @author mosin
 * @date 2021年6月10日
 */
public class UserService {
	private  UserDao userDao = new UserDao();
	
	public boolean register(User user) {
		//数据的持久化
		int line = userDao.addUser(user);
		return line==1;
	}
	
	
	public boolean login(String username,String password) {
		//数据的查询
		User user = userDao.selectUserByUsernameAndPassword(username, password);
		return user!=null;
	}
	

}
