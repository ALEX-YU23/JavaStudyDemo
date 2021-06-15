package org.jdbc.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.jdbc.entity.Clazz;

/***
 * 操作数据库的代码
 * @Description
 * @author AlexYU
 * @date 2021年6月13日下午1:50:28
 */
public class ClazzDao extends Dao<Clazz>{
	
	
	@Override
	public Integer addObject(Clazz t) {
		// 编写并执行sql
		String sql = "insert into class(cname)VALUES(?)";
		int i = 0;
		try {
			i = qr.update(sql,t.getCname());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public Integer deleteObject(String name) {
		// 编写并执行sql
		String sql = "delete from class where cname = ?";
		int i = 0;
		try {
			i = qr.update(sql,name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public Integer updateObject(String newItem,String...target) {
		// 编写并执行sql
		String sql = "update class set cname = ? where id = ?";
		int i = 0;
		try {
			i = qr.update(sql,newItem,target);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	@SuppressWarnings("all")
	public Clazz selectObject(String...param) {
		
		String sql = "select * from class where cname = ?";
		Clazz clazz = null;
		try {
			clazz = qr.query(sql, new BeanHandler<>(Clazz.class),param);;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clazz;
	}
	
}
