package org.jgs.javaweb.service;

import java.util.List;

import org.jgs.javaweb.dao.UserDaoImp;
import org.jgs.javaweb.entity.User;


public class UserServiceImp implements UserService {

	private UserDaoImp userDaoImp = new UserDaoImp();
	
	@Override
	public Boolean register(User user) {
		return userDaoImp.addOne(user)==1;
	}

	@Override
	public User login(String username, String password) {
		return userDaoImp.findUserByUsernameAndPassword(username, password);
	}
	
	@Override
	public List<User> showAllUsers() {
		return userDaoImp.showUserList();
	}
	
	@Override
	public Boolean delete(int id) {
		return userDaoImp.deleteOne(id)==1;
	}
	
	@Override
	public boolean checkUser(String username) {
		return userDaoImp.findOne(username)!=null;
	}
}
