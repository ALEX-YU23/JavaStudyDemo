package org.jdbc.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.jdbc.entity.Subject;

public class SubjectDao extends Dao<Subject>{
	
	
	@Override
	public Integer addObject(Subject s) {
		// 编写并执行sql
		String sql = "insert into subject(subjectname)VALUES(?)";
		int i = 0;
		try {
			i = qr.update(sql,s.getSubjectname());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public Integer deleteObject(String subjectname) {
		// 编写并执行sql
		String sql = "delete from subject where subjectname = ?";
		int i = 0;
		try {
			i = qr.update(sql,subjectname);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public Integer updateObject(String subjectname,String...subjectid) {
		// 编写并执行sql
		String sql = "update subject set subjectname = ? where subjectid = ?";
		int i = 0;
		try {
			i = qr.update(sql,subjectname,subjectid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	@SuppressWarnings("all")
	public Subject selectObject(String...param) {
		
		String sql = "select * from subject where subjectname = ?";
		Subject subject = null;
		try {
			subject = qr.query(sql, new BeanHandler<>(Subject.class),param);;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return subject;
	}
	
}
