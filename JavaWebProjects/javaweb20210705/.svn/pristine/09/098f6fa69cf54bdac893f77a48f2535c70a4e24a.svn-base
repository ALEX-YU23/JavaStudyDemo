package cn.kgc.javaweb.service;

import cn.kgc.javaweb.dao.UserDao;
import cn.kgc.javaweb.dao.UserDaoImpl;
import cn.kgc.javaweb.entity.User;

public class UserServiceImpl  implements UserService{

	private UserDao UserDao = new UserDaoImpl();
	@Override
	public boolean register(User user) {
		int line = UserDao.addUser(user);
		return line==1;
	}

}
