package org.jgs.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.jgs.jdbc.entity.Classes;
import org.jgs.jdbc.entity.Student;
import org.jgs.jdbc.utile.DataSourceUtile;

/**
 * 学生的数据持久化
 * @author mosin
 * @date 2021年6月15日
 */
public class StudentDao {

	/**
	 * 添加学生数据到数据库
	 * @param student  写入的数据
	 * @return
	 */
	public int insertStudent(Student student) {
		Connection connection = null;
		PreparedStatement pst = null;
		//获取连接
		try {
			connection = DataSourceUtile.getConnection();
			//编写sql
			String sql = "insert into student (stuname,classid)values(?,?)";
			pst = connection.prepareStatement(sql);
			//设置参数
			pst.setString(1, student.getStuname());
			pst.setInt(2, student.getClassid());
			//执行sql
			int line = pst.executeUpdate();
			return line;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//关闭连接释放资源
			DataSourceUtile.closeAll(null, pst, connection);
		}
		return 0;
	}

	public int delStudentById(int stuid) {
		Connection connection = null;
		PreparedStatement pst = null;
		//获取连接
		try {
			connection = DataSourceUtile.getConnection();
			//编写sql
			String sql = "delete from  student where id = ?";
			pst = connection.prepareStatement(sql);
			//设置参数
			pst.setInt(1, stuid);
			//执行sql
			int line = pst.executeUpdate();
			return line;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//关闭连接释放资源
			DataSourceUtile.closeAll(null, pst, connection);
		}
		return 0;
	}

	//根据学生的id和班级名称 分班
	public int updateStudent(Student student) {
		Connection connection = null;
		PreparedStatement pst = null;
		//获取连接
		try {
			connection = DataSourceUtile.getConnection();
			//编写sql
			String sql = "update student set stuname = ? ,classid = ?  where id = ? ";
			pst = connection.prepareStatement(sql);
			//设置参数
			pst.setString(1, student.getStuname());
			pst.setInt(2, student.getClassid());
			pst.setInt(3, student.getId());
			//执行sql
			int line = pst.executeUpdate();
			return line;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//关闭连接释放资源
			DataSourceUtile.closeAll(null, pst, connection);
		}
		return 0;
	}

	//根据学号 查询学生信息
	public Student selectStudentById(int id) {
		//获取数据库连接池
		DataSource dataSource = DataSourceUtile.getDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		String sql = "select  *  from student where id = ? ";
		try {
			Student student = runner.query(sql, new BeanHandler<>(Student.class), id);
			return student;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	//查询所有学生信息
	public List<Student> selectAll() {
		//获取数据库连接池
		DataSource dataSource = DataSourceUtile.getDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		String sql = "select  s.* , c.classname from student s join classes c on  s.classid = c.id";
		try {
			List<Student> students = runner.query(sql, new BeanListHandler<>(Student.class));
			return students;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	//根据名称查找学生信息
	public Student selectStuByName(String stuname) {

		//获取数据库连接池
		DataSource dataSource = DataSourceUtile.getDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		String sql = "select *  from student where stuname = ?";
		try {
			Student student = runner.query(sql, new BeanHandler<>(Student.class),stuname);
			return student;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
