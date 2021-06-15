package org.jgs.jdbc.dao;

import java.sql.SQLException;


import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.jgs.jdbc.entity.Student;
import org.jgs.jdbc.entity.Subject;
import org.jgs.jdbc.utile.DataSourceUtile;

/**
 * 科目的持久化层
 * @author mosin
 * @date 2021年6月15日
 */
public class SubDao {

	public Subject selectSubByName(String subname) {
		//获取数据库连接池
		DataSource dataSource = DataSourceUtile.getDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		String sql = "select *  from subject where subname = ?";
		try {
			Subject subject = runner.query(sql, new BeanHandler<>(Subject.class),subname);
			return subject;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
