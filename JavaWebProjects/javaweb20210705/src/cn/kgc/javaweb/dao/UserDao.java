package cn.kgc.javaweb.dao;

import cn.kgc.javaweb.entity.User;

/**
 * 用户数据的持久化层
 * @author mosin
 * @date 2021年7月6日
 * @version  1.0
 */
public interface UserDao {

	int  addUser(User user);
	
}
