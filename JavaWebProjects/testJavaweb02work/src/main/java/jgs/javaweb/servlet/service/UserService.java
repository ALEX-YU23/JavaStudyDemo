package jgs.javaweb.servlet.service;

import java.util.List;

import jgs.javaweb.servlet.entity.User;
/***
 * 用户的业务层接口
 * @author AlexYU
 *
 */
public interface UserService {
	Boolean register(User user);

	User login(String username, String password);

	List<User> showAllUsers();

	Boolean delete(int id);

	boolean checkUser(String username);
}
