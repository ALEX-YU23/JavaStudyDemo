package org.jgs.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.jgs.jdbc.entity.User;

/*
 * 数据的持久化操作 只跟数据库打交道  不做任何的业务分析
 * 
 */
public class UserDao {
	//添加用户
	public int addUser(User user) {
		Connection connection = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//连接数据库
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql:///jgs2111", "root", "root");
			st = connection.createStatement();
			//编写sql
			String strbirth = new SimpleDateFormat("yyyy-MM-dd").format(user.getBirth());
			String strct = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(user.getCreateTime());
			
			String sql = "insert into usr (username,password,birth,create_time)" + "values('" + user.getUsername()
					+ "','" + user.getPassword() + "','" + strbirth + "','" + strct + "')";
			//执行sql
			int line = st.executeUpdate(sql);
			return line;
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

		return 0;
	}

	//查询用户
	public User selectUserByUsernameAndPassword(String username, String password) {
		Connection connection = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//连接数据库
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql:///jgs2111", "root", "root");
			st = connection.createStatement();
			//编写sql
			String sql = "select * from usr where username = '" + username + "' and password = '" + password + "'";
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
			return user;
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

		return null;
	}

}
