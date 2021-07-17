package org.jgs.javaweb.dao;

import java.util.List;

import org.jgs.javaweb.entity.User;


/***
 * 用户数据的持久化层
 * @author AlexYU
 *
 */
public interface UserDao {

	// 添加一个用户
	int addOne(User user);
	
	// 查找一个用户
	User findUserByUsernameAndPassword(String usename,String password);

	List<User> showUserList();

	int deleteOne(int id);

	User findOne(String username);
	
	// 删除一个用户
	//int deleteOneById(int id);
	
	// 修改用户信息
}
