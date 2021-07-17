package org.jgs.javaweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.jgs.javaweb.entity.User;
import org.jgs.javaweb.util.DataSourceUtils;



/***
 * 用户持久化层的实现类  真正的实现数据的操作
 * @author AlexYU
 *
 */

public class UserDaoImp implements UserDao {

	@Override
	public int addOne(User user) {
		
		Connection conn = DataSourceUtils.getConnection();
		String sql = "insert into user(username,password,birthday) values(?,?,?);";
		PreparedStatement pst = null;
		try {
			
			pst = conn.prepareStatement(sql);
			pst.setObject(1, user.getUsername());
			pst.setObject(2, user.getPassword());
			pst.setObject(3, new SimpleDateFormat("yyyy-MM-dd").format(user.getBirthday()));
			
			return pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DataSourceUtils.releaseAll(conn, pst, null);
		}
		
		return 0;
	}

	@Override
	public User findUserByUsernameAndPassword(String username, String password) {
		DataSource ds = DataSourceUtils.getDataSource();
		QueryRunner qr = new QueryRunner(ds);
		String sql = "select * from user where `username`=? and `password`=?";
		User user = null;
		try {
			user = qr.query(sql, new BeanHandler<>(User.class),username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	
	
	@Override
	public List<User> showUserList() {
		DataSource ds = DataSourceUtils.getDataSource();
		QueryRunner qr = new QueryRunner(ds);
		String sql = "select * from user";
		List<User> userList = null;
		try {
			userList = qr.query(sql, new BeanListHandler<>(User.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}

	@Override
	public int deleteOne(int id) {
		
		Connection conn = DataSourceUtils.getConnection();
		String sql = "delete from user where id=?";
		PreparedStatement pst = null;
		try {
			
			pst = conn.prepareStatement(sql);
			pst.setObject(1, id);
			return pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DataSourceUtils.releaseAll(conn, pst, null);
		}
		
		return 0;
	}
	
	@Override
	public User findOne(String username) {
		
		DataSource ds = DataSourceUtils.getDataSource();
		String sql = "select * from user where username=?";
		QueryRunner qr = new QueryRunner(ds);
		try {
			return qr.query(sql, new BeanHandler<>(User.class),username);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return null;
	}
	
}
