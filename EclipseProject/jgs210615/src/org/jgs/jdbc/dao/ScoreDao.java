package org.jgs.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.jgs.jdbc.entity.Student;
import org.jgs.jdbc.utile.DataSourceUtile;

/**
 * 成绩的持久化层
 * @author mosin
 * @date 2021年6月15日
 */
public class ScoreDao {

	//添加成绩
	public int insertScore(int sid, int subid, int score) {
		Connection connection = null;
		PreparedStatement pst = null;
		//获取连接
		try {
			connection = DataSourceUtile.getConnection();
			//编写sql
			String sql = "insert into score (sid,subid,score)values(?,?,?)";
			pst = connection.prepareStatement(sql);
			//设置参数
			pst.setInt(1, sid);
			pst.setInt(2, subid);
			pst.setInt(3, score);
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

	//根据科目id 查询科目成绩
	public List<Student> selectAllScores(int id) {

		//获取数据库连接池
		DataSource dataSource = DataSourceUtile.getDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		//三表联合查询的sql
		String sql = "SELECT  s.* ,sub.subname ,sco.score "
				+ "FROM "
				+ "score sco "
				+ "JOIN  student  s "
				+ "on  s.id = sco.sid "
				+ "join  "
				+ "`subject` sub "
				+ "on  sub.id = sco.subid "
				+ "where sco.subid = ?  order by score desc";
		try {
			List<Student> students = runner.query(sql, new BeanListHandler<>(Student.class), id);
			return students;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
