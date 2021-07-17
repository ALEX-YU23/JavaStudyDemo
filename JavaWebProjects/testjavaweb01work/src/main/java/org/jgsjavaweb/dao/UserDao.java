package org.jgsjavaweb.dao;

import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.jgsjavaweb.entity.User;
import org.jgsjavaweb.util.DataSourceUtils;

/***
 * 用户数据操作类
 * @author AlexYU
 *
 */
public class UserDao {
	
	// 插入一个用户数据
	public int insert(User user) throws SQLException {
		
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		
		String sql = "insert into `user`(username,password,birthday) values(?,?,?)";
		
		return qr.update(sql,user.getUsername(),user.getPassword(),new SimpleDateFormat("yyyy-MM-dd").format(user.getBirthday()));
		
	}
	
	// 查询一个用户根据用户名和密码
	public User getOneByUsernameAndPassword(String username,String password) throws SQLException {
		
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		
		String sql = "select * from `user` where username = ? and password = ?";
		
		return qr.query(sql, new BeanHandler<>(User.class),username,password);
		
		
	}
	
}
