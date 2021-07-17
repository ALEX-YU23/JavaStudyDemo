package jgs.javaweb.servlet.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;

import jgs.javaweb.servlet.entity.User;
import jgs.javaweb.servlet.service.UserServiceImp;
import jgs.javaweb.servlet.util.DataSourceUtils;

public class TestDruidUtil {

	@Test
	public void test() {
		System.out.println(DataSourceUtils.getConnection());
	}

	@Test
	public void testUserDao() {
		UserServiceImp userServiceImp = new UserServiceImp();
		User user = new User();
		user.setUsername("傻是不对不对11");
		user.setPassword("56789jj");
		try {
			user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1923-07-19"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(userServiceImp.register(user));;
	}
	
	@Test
	public void testFind() {
		UserServiceImp userServiceImp = new UserServiceImp();
		User user = userServiceImp.login("张祥", "13ed32");
		
		System.out.println(user);;
	}
	
	@Test
	public void testshowall() {
		UserServiceImp userServiceImp = new UserServiceImp();
		List<User> userList = userServiceImp.showAllUsers();
		
		userList.forEach(x->System.out.println(x));
		
	}
	
}
