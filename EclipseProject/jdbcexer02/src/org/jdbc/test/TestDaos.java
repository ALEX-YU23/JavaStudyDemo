package org.jdbc.test;

import java.util.ArrayList;
import java.util.List;

import org.jdbc.dao.ClazzDao;
import org.jdbc.dao.ScoreDao;
import org.jdbc.dao.StudentDao;
import org.jdbc.dao.SubjectDao;
import org.jdbc.entity.Clazz;
import org.jdbc.entity.Score;
import org.jdbc.entity.Student;
import org.jdbc.entity.Subject;
import org.jdbc.service.ScoreService;
import org.jdbc.service.StudentService;
import org.junit.Test;

public class TestDaos {

	@Test
	public void TestClazzDao(){
		ClazzDao cd = new ClazzDao();
		;
		System.out.println(cd.deleteObject("初三五班"));
	}
	
	@Test
	public void TestClazzDaoSelect(){
		ClazzDao cd = new ClazzDao();
		Clazz clazz = cd.selectObject("4");
		System.out.println(clazz);
	}
	
	@Test
	public void TestSubjectADD() {
		Subject subject = new Subject(1, "物理学");
		SubjectDao subjectDao = new SubjectDao();
		Integer addObject = subjectDao.addObject(subject);
		System.out.println(addObject);
	}
	@Test
	public void TestSubjectselect() {
		SubjectDao subjectDao = new SubjectDao();
		Subject selectObject = subjectDao.selectObject("物理学");
		System.out.println(selectObject);
	}
	
	@Test
	public void TestSubjectUpdate() {
		SubjectDao subjectDao = new SubjectDao();
		Integer uo = subjectDao.updateObject("1", "摸鱼学");
		System.out.println(uo);
	}
	
	@Test
	public void TestSubjectDelete() {
		SubjectDao subjectDao = new SubjectDao();
		Integer deleteObject = subjectDao.deleteObject("物理学");
		System.out.println(deleteObject);
	}
	
	public static StudentDao studentDao = new StudentDao();
	@Test
	public void TestStudentAdd() {
		Student student = new Student("李辉");
		studentDao.addObject(student);
	}
	
	@Test
	public void TestScoreDelete() {
		Integer deleteObject = studentDao.deleteObject("李辉");
		System.out.println(deleteObject);
	}
	
	@Test
	public void testScoreService() {
		List<Student> showRanking = ScoreService.showRanking("摸鱼学");
		for (Student student : showRanking) {
			System.out.println(student.getSname()+"\t"+student.getGrade());
		}
	}
	
	@Test
	public void testshowStuCla() {
		Student student = new Student();
		student.setSname("金强");
		System.out.println(StudentService.addStu(student));
	}
	
	
	@Test
	public void testdivClass() {
		StudentService.divClass(7, "初三四班");
	}
	
	
	@Test
	public void test41() {
		Boolean noteScore = ScoreService.noteScore("齐佳", "摸鱼学", 89.90);
		System.out.println(noteScore);
	}
	
	public Integer updateScore(Score score) {
		
		String sql = "update score set grade = ? where 1=1";
		
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
		
		System.out.println(sql);
		
		
		return null;
		
	}
	
	@Test
	public void testupdateScore() {
		Score score = new Score(2, 3);
		updateScore(score);
	}
}

