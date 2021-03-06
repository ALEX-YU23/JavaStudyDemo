package org.jgs.jdbc.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.jgs.jdbc.entity.User;
import org.jgs.jdbc.service.UserService;
import org.junit.Test;

/**
 * 演示用户的登录注册案例
 * 
 * @author mosin
 * @date 2021年6月10日
 */
public class JDBCTest02 {

	@Test
	public void testRegisterAndLogin() {
		//register();
		login();
	}

	public void register() {
		//创建扫描器
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = scanner.nextLine();
		System.out.println("请输入密码");
		String password = scanner.nextLine();
		System.out.println("请输入生日");
		String birth = scanner.nextLine();

		//获取一个当前时间 用于记录 账号的创建时间
		Date date = new Date();
		String dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);

		//连接数据库 将数据持久化
		Connection connection = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql:///jgs2111", "root", "root");
			//获取执行sql的对象
			st = connection.createStatement();
			String sql = "insert into usr(username,password,birth,create_time)" + "values('" + username + "','"
					+ password + "','" + birth + "','" + dt + "')";
			System.out.println(sql);
			//执行sql
			int line = st.executeUpdate(sql);
			if (line == 1) {
				System.out.println("注册成功");
			} else {
				System.out.println("注册失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6.关闭连接释放资源

			try {
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (st != null) {
					st.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	public void login() {
		//创建扫描器
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = scanner.nextLine();
		System.out.println("请输入密码");
		String password = scanner.nextLine();

		//连接数据库 查询
		Connection connection = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql:///jgs2111", "root", "root");
			//获取执行sql的对象
			st = connection.createStatement();
			String sql = "select * from  usr where  username = '" + username + "'and password = '" + password + "'";
			System.out.println(sql);
			//执行sql
			rs = st.executeQuery(sql);
			//处理结果集
			User user = null;
			while (rs.next()) {
				//获取每一个字段的值
				int id = rs.getInt(1);
				String uname = rs.getString(2);
				String pwd = rs.getString(3);
				Date birth = rs.getDate(4);
				Date timestamp = rs.getTimestamp(5);

				//封装数据
				user = new User();
				user.setId(id);
				user.setUsername(uname);
				user.setPassword(pwd);
				user.setBirth(birth);
				user.setCreateTime(timestamp);
			}

			//判定是否登录成功
			if (user == null) {
				System.out.println("登录失败");
			} else {
				System.out.println("登录成功");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6.关闭连接释放资源

			try {
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (st != null) {
					st.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	//测试分层的代码
	@Test
	public void testUser() throws ParseException {
		//注册 
		//创建扫描器
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = scanner.nextLine();
		System.out.println("请输入密码");
		String password = scanner.nextLine();
		System.out.println("请输入生日");
		String birth = scanner.nextLine();
		Date bdate = new SimpleDateFormat("yyyy-MM-dd").parse(birth);

		//获取一个当前时间 用于记录 账号的创建时间
		Date date = new Date();

		//封装数据
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setBirth(bdate);
		user.setCreateTime(date);

		//调用业务层 实现注册
		UserService userService = new UserService();
		boolean b = userService.register(user);

		if (b) {
			System.out.println("注册成功");
		} else {
			System.out.println("注册失败");
		}
	}

	@Test
	public void testUser2() throws ParseException { //测试用户的登录
		//注册 
		//创建扫描器
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = scanner.nextLine();
		System.out.println("请输入密码");
		String password = scanner.nextLine();

		//调用业务层 实现注册
		UserService userService = new UserService();
		boolean login = userService.login(username, password);
		if (login) {
			System.out.println("登录成功");
		} else {
			System.out.println("登录失败");
		}

	}

}
