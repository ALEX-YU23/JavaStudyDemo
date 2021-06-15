package org.jgs.jdbc.dao;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.jgs.jdbc.entity.Classes;
import org.jgs.jdbc.utile.DataSourceUtile;

/**
 * 班级数据持久化层
 * @author mosin
 * @date 2021年6月15日
 */
public class ClassesDao {

	//根据班级的名字 查询班级信息
	
	public Classes selectClass(String classname) {
		
		//获取数据库连接池
		DataSource dataSource = DataSourceUtile.getDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		String sql = "select  *  from classes where classname = ? ";
		try {
			Classes clazz = runner.query(sql, new BeanHandler<>(Classes.class),classname);
			return clazz;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
