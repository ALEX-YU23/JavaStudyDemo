package org.jgs.jdbc.service;


import java.util.List;

import org.jgs.jdbc.dao.ScoreDao;
import org.jgs.jdbc.dao.StudentDao;
import org.jgs.jdbc.dao.SubDao;
import org.jgs.jdbc.entity.Student;
import org.jgs.jdbc.entity.Subject;

/**
 * 成绩的业务类
 * @author mosin
 * @date 2021年6月15日
 */
public class ScoreService {
	
	private  ScoreDao  scoreDao = new ScoreDao();
	private StudentDao studentDao = new StudentDao();
	private SubDao subDao = new SubDao();
	/**
	 * 根据学生姓名和科目名称给学生记录成绩
	 * 1.根据学生姓名 查找 学号
	 * 2.根据科目名称 查找 科目编号
	 * 3.添加分数到数据库
	 */
	
	public  boolean  addScore(String stuname,String subname,int score) {
		
		//根据学生姓名 查找 学号
		Student student = studentDao.selectStuByName(stuname);
		//根据科目名称 查找 科目编号
		Subject subject =  subDao.selectSubByName(subname);
	    int line = scoreDao.insertScore(student.getId(),subject.getId(),score);
		return line==1;
	}
	
	/**
	 *  根据科目名称查询所有学生的成绩，并降序排列
	 *  1.科目名称 查询科目编号
	 *  2.学生表 科目表 成绩表三表关联
	 */
	
	public  List<Student> selectAllScoreBySubName(String  subname){
		
		//科目名称 查询科目编号
	    Subject subject = subDao.selectSubByName(subname);
	    //根据科目id 查询科目成绩
	    List<Student>  students  = scoreDao.selectAllScores(subject.getId());
		return students;
	}
}
