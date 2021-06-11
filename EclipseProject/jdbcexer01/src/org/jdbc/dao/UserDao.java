package org.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.jgs.jdbc.utile.JDBCUtile;

import ord.jdbc.entity.Users;

public class UserDao {

	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private Users user = null;
	// 查询用户
	public Boolean selectUser(String username,String password) {
		try {
			conn = JDBCUtile.getConnection();
			
			String sql_select = "SELECT	* FROM users WHERE username = ? and	password = ?";
			
			ps = conn.prepareStatement(sql_select);
			ps.setString(1, username);
			ps.setString(2, password);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				username = rs.getString(2);
				password = rs.getString(3);
				int age = rs.getInt(4);
				Date birthday = rs.getDate(5);
				Date createTime = rs.getDate(6);
				
				user = new Users(username, password, age, birthday, createTime);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtile.closeAll(rs, ps, conn);
		}
		
		return user != null;
	}
	// 向表中添加数据
	public Boolean addUser(Users users) {
		SimpleDateFormat birth = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat ctime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		int i = 0;
		try {
			conn = JDBCUtile.getConnection();
			
			String sql_insert = "insert into users(username,password,age,birth,create_time)VALUES(?,?,?,?,?)";
			
			ps = conn.prepareStatement(sql_insert);
			ps.setString(1, users.getUsername());
			ps.setString(2, users.getPassword());
			ps.setInt(3, users.getAge());
			ps.setString(4, birth.format(users.getBirthday()));
			ps.setString(5, ctime.format(users.getCreateTime()));
			
			i = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtile.closeAll(rs, ps, conn);
		}
		return i>0;
	}
	// 删除
	public Boolean deleteUser(String username) {
		
		int i = 0;
		try {
			conn = JDBCUtile.getConnection();
			
			String sql_delete = "DELETE FROM users WHERE username = ? ";
			
			ps = conn.prepareStatement(sql_delete);
			ps.setString(1, username);
			
			
			i = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtile.closeAll(rs, ps, conn);
		}
		return i>0;
	}
	// 修改
	public Boolean updateUser(String oldname,String newname) {
		
		int i = 0;
		try {
			conn = JDBCUtile.getConnection();
			
			String sql_update = "UPDATE users SET username = ? where username = ?";
			
			ps = conn.prepareStatement(sql_update);
			ps.setString(1, newname);
			ps.setString(2, oldname);
			
			i = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtile.closeAll(rs, ps, conn);
		}
		return i>0;
	}
}
