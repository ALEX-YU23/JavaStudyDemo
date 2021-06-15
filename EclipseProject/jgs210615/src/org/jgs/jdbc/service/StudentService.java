package org.jgs.jdbc.service;

import java.util.List;

import org.jgs.jdbc.dao.ClassesDao;

/**
 * 学生业务层
 * @author mosin
 * @date 2021年6月15日
 */

import org.jgs.jdbc.dao.StudentDao;
import org.jgs.jdbc.entity.Classes;
import org.jgs.jdbc.entity.Student;

public class StudentService {
	private StudentDao studentDao = new StudentDao();
	private ClassesDao  classDao = new ClassesDao();

	//添加一个学生
	public boolean addStudent(Student student) {
		//调用持久层 将数据写入数据库
		int line = studentDao.insertStudent(student);
		return line == 1;
	}

	//根据id删除一个学生
	public boolean delStudent(int stuid) {
		//调用持久层 将数据写入数据库
		int line = studentDao.delStudentById(stuid);
		return line == 1;
	}
	
	//根据学生的id和班级名称 分班
	public  boolean divClass(int id,String className) {
		
		//根据学生id 查询学生信息  
	    Student student = studentDao.selectStudentById(id);		
		//根据班级名称查询班级 id
		Classes clazz = classDao.selectClass(className);
		/*
		 * 根据学生id 和班级名称 更新学生信息  只提供了一个更新方法  参数是student
		 * 
		 * 1.根据学生id 查询学生信息  
		 * 2.通过classDao 获取classid
		 * 3.设置学生的 classid
		 * 4.执行更新操作
		 * */
		
		//设置学生的 classid
		student.setClassid(clazz.getId());  //  张三   2
		int line = studentDao.updateStudent(student);
		return line==1;
	}
	
	//查询学生的信息和班级名称      两表联合查询
	
	public List<Student>  selectAllStudents(){
		//调用dao层查询所有学生信息
		List<Student>  students = studentDao.selectAll();
		return students;
	}

}
