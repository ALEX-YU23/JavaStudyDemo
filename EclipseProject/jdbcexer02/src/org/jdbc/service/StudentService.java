package org.jdbc.service;

import java.util.List;

import org.jdbc.dao.ClazzDao;
import org.jdbc.dao.StudentDao;
import org.jdbc.entity.Student;

/**
 * 创建学生业务类StudentService ,实现以下业务方法:
 * 1.增加学生
 * 2.根据id删除学生
 * 3.根据学生id和班级名称给学生分班
 * 4.查询所有学生信息，要求显示对应班级名称
 * @author AlexYU
 * @date 2021年6月13日下午6:24:10
 */
public class StudentService {

	private static StudentDao stuDao = new StudentDao();
	private static ClazzDao claDao = new ClazzDao();

	// 1.增加学生
	public static Boolean addStu(Student stu) {
		return stuDao.addObject(stu)>0; // 大于零增加成功
	}
	
	//2.根据id删除学生
	public static Boolean delStuById(String stuid) {
		return stuDao.deleteObject(stuid)>0;
	}
	
	//3.根据学生id和班级名称给学生分班
	/**
	 * 给编号为stuid的学生设置班级id
	 * @Description
	 * @author AlexYU 
	 * @date 2021年6月15日下午2:29:10
	 * @param stuid
	 * @param cname
	 * @return
	 */
	public static Boolean divClass(int stuid,String cname) {
		// 1.根据学生id获取学生信息
		
		// 2.根据班级名称获取班级的编号
		Integer cid = claDao.selectObject(cname).getCid();
		
		stuDao.updateObject(cid+"", stuid+"");
		
		return true;
		
	}
	
	
	
	//4.查询所有学生信息，要求显示对应班级名称
	public static List<Student> showStuCla() {
		List<Student> stuCla = stuDao.getStuCla();
		return stuCla;
	}
}
