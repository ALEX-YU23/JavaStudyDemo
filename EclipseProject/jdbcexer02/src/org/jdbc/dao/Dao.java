package org.jdbc.dao;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.jdbc.utils.DataSourceUtils;

public abstract class Dao<T> {
	static DataSource ds =  null;
	static QueryRunner qr = null;
	static {
		// 获取连接池获取工具类
		ds = DataSourceUtils.getDataSource();
		
		// 获取数据库指令执行类
		qr = new QueryRunner(ds);
		
	}
	public abstract Integer addObject(T t);
	public abstract Integer deleteObject(String id);
	public abstract Integer updateObject(String target,String...items);
	public abstract T selectObject(String...param);
}
