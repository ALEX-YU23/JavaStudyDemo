package org.jgs.jdbc.test;

import java.util.List;

import org.jgs.jdbc.entity.Student;
import org.jgs.jdbc.service.ScoreService;
import org.jgs.jdbc.service.StudentService;
import org.junit.Test;

/**
 * 测试学生的业务类
 * 
 * 控制层
 * @author mosin
 * @date 2021年6月15日
 */
public class TestStudent {
	
	private StudentService studentService = new  StudentService();
	private ScoreService  scoreService = new ScoreService();
	@Test
	public void testAddStudent() {
		
		Student student = new  Student();
		student.setStuname("张三");
		student.setClassid(1);
		//调用业务层的添加学生的方法  
		boolean b = studentService.addStudent(student);
		if(b) {
			System.out.println("添加成功");
		}else {
			
			System.out.println("添加失败");
		}

	}
	
	@Test
	public void delStudent() { //根据id 删除一个学生
		
		int id = 1;
		//调用业务层的删除学生的方法  
		boolean b = studentService.delStudent(id);
		if(b) {
			System.out.println("删除学生成功");
		}else {
			System.out.println("删除学生失败");
		}
		
	}
	
	//测试分班
	@Test
	public  void  divClass() {
		
		boolean b = studentService.divClass(1, "大数据");
		if(b) {
			System.out.println("更新数据成功");
		}else {
			System.out.println("更新数据失败");
		}
	}
	
	//测试查询所有学生的信息
	@Test
	public  void  selectAll() {
		
		List<Student> students = studentService.selectAllStudents();
		for (Student student : students) {
			System.out.println(student);
		}
		
	}
	
	
	//根据学生姓名 和  科目名称 插入成绩
	@Test
	public  void  insertScore() {
		
		boolean b = scoreService.addScore("王五", "大数据", 80);
		if(b) {
			System.out.println("分数添加完成");
		}else {
			System.out.println("分数添加失败");
		}
	}
	
	//根据科目名称查询所有学生的成绩
		@Test
		public  void  alltScore() {
			List<Student> students = scoreService.selectAllScoreBySubName("大数据");
			for (Student student : students) {
				System.out.println(student);
			}
			
		}
}
