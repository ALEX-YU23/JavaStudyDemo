package org.jdbc.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.jdbc.entity.Student;

public class StudentDao extends Dao<Student>{
	
	
	@Override
	public Integer addObject(Student s) {
		// 编写并执行sql
		String sql = "insert into student(sname,cid)VALUES(?,?)";
		int i = 0;
		try {
			i = qr.update(sql,s.getSname(),s.getCid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public Integer deleteObject(String sid) {
		// 编写并执行sql
		String sql = "delete from student where sid = ?";
		int i = 0;
		try {
			i = qr.update(sql,sid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public Integer updateObject(String cid,String...sid) {
		// 编写并执行sql
		String sql = "update student set cid = ? where sid = ?";
		int i = 0;
		try {
			i = qr.update(sql,cid,sid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	@SuppressWarnings("all")
	public Student selectObject(String...param) {
		
		String sql = "select * from student where sid = ?";
		Student student = null;
		try {
			student = qr.query(sql, new BeanHandler<>(Student.class),param);;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}
	
	@SuppressWarnings("all")
	public Student selectObjectByName(String sname) {
		
		String sql = "select * from student where sname = ?";
		Student student = null;
		try {
			student = qr.query(sql, new BeanHandler<>(Student.class),sname);;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}
	
	//4.查询所有学生信息，要求显示对应班级名称
	public List<Student> getStuCla() {
		
		String sql = "SELECT stu.*,c.cname FROM student stu left join class c on student.cid = class.cid";
		List<Student> studentCn = null;
		try {
			studentCn = qr.query(sql, new BeanListHandler<>(Student.class));;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentCn;
	}
	
	
}
