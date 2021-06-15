package org.jdbc.service;

import java.util.List;

import org.jdbc.dao.ScoreDao;
import org.jdbc.dao.StudentDao;
import org.jdbc.dao.SubjectDao;
import org.jdbc.entity.Score;
import org.jdbc.entity.Student;
import org.junit.Test;

/***
 * 4.创建成绩业务类ScoreService ,实现以下业务方法:
1.根据学生姓名和科目名称给学生记录成绩
2.根据科目名称查询所有学生的成绩，并降序排列
 * @author AlexYU
 * @date 2021年6月13日下午7:01:26
 */
public class ScoreService {

	private static ScoreDao scoDao = new ScoreDao();
	private static StudentDao stuDao = new StudentDao();
	private static SubjectDao subDao = new SubjectDao();
	
	//1.根据学生姓名和科目名称给学生记录成绩
	public static Boolean noteScore(String stuName,String subjectName,Double score) {
		// 根据学生姓名获得学生id
		Integer sid = stuDao.selectObjectByName(stuName).getSid();
		
		// 根据科目名称获得科目id
		Integer subid = subDao.selectObject(subjectName).getSubjectid();
		
		// 根据学生id和科目id创建一个查询用的score对象
		Score sco = new Score(sid, subid);
		// 查询表中是否存在该条数据
		Boolean selectScore = scoDao.selectScore(sco);
		
		if (selectScore) {
			// 存在则更新
			scoDao.updateScore(sco, score);
		} else {
			// 不存在则添加
			sco.setGarde(score);
			scoDao.addObject(sco);
		}
		
		return true;
		
	}
	
	//2.根据科目名称查询所有学生的成绩，并降序排列
	public static List<Student> showRanking(String subjectname) {
		System.out.println(subjectname+"成绩");
		return scoDao.getRanking(subjectname);
	}
}
