package org.jdbc.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.jdbc.entity.Score;
import org.jdbc.entity.Student;

public class ScoreDao extends Dao<Score>{
	
	
	@Override
	public Integer addObject(Score s) {
		// 编写并执行sql
		String sql = "insert into score(sid,subjectid,grade)VALUES(?,?,?)";
		int i = 0;
		try {
			i = qr.update(sql,s.getSid(),s.getSubjectid(),s.getGarde());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public Integer deleteObject(String sid) {
		// 编写并执行sql
		String sql = "delete from score where sid = ?";
		int i = 0;
		try {
			i = qr.update(sql,sid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public Integer updateObject(String grade,String...items) {
		// 编写并执行sql
		String sql = "update score set grade = ? where sid = ? and subjectid = ?";
		int i = 0;
		try {
			i = qr.update(sql,grade,items);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	
	public Integer updateScore(Score score,Double grade) {
		
		String sql = "update score set grade = ? where 1=1";
		
		ArrayList<Object> params = new ArrayList<>();
		
		params.add(grade);
		
		if (score.getScoreid()!=null) {
			sql += " and scoreid = ?";
			params.add(score.getScoreid());
		}
		if (score.getSid()!=null) {
			sql += " and sid = ?";
			params.add(score.getSid());
		}
		if (score.getSubjectid()!=null) {
			sql += " and subjectid = ?";
			params.add(score.getSubjectid());
		}
		if (score.getGarde()!=null) {
			sql += " and grade = ?";
			params.add(score.getGarde());
		}
		
		try {
			return qr.update(sql, params.toArray());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
		
	}
	
	

	@Override
	@SuppressWarnings("all")
	public Score selectObject(String...param) {
		
		String sql = "select * from score where sid = ?";
		Score score = null;
		try {
			score = qr.query(sql, new BeanHandler<>(Score.class),param);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return score;
	}
	
	// 查询表中是否该数据
	public Boolean selectScore(Score score) {
		
		String sql = "select * from score where 1=1";
		
		ArrayList<Object> params = new ArrayList<>();
		
		if (score.getScoreid()!=null) {
			sql += " and scoreid = ?";
			params.add(score.getScoreid());
		}
		if (score.getSid()!=null) {
			sql += " and sid = ?";
			params.add(score.getSid());
		}
		if (score.getSubjectid()!=null) {
			sql += " and subjectid = ?";
			params.add(score.getSubjectid());
		}
		if (score.getGarde()!=null) {
			sql += " and grade = ?";
			params.add(score.getGarde());
		}
		
		try {
			return qr.query(sql,new BeanHandler<>(Score.class), params.toArray()) != null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
		
	}
	
	
	//2.根据科目名称查询所有学生的成绩，并降序排列
	public List<Student> getRanking(String subjectname) {
		
		String sql = "SELECT sname, grade from student stu RIGHT JOIN score sco ON stu.sid = sco.sid WHERE subjectid = (SELECT subjectid FROM `subject` WHERE `subject`.subjectname = ?) ORDER BY grade desc";
		List<Student> scoreList = null;
		try {
			scoreList = qr.query(sql, new BeanListHandler<>(Student.class), subjectname);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return scoreList;
	}
	
}
