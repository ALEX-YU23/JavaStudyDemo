package org.jgs.jdbc.day01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.jgs.jdbc.entity.User;
import org.jgs.jdbc.utile.DataSourceUtile;
import org.junit.Test;

/**
 * DBUtils工具的使用
 * @author mosin
 * @date 2021年6月12日
 */
public class JDBCTest05 {

	@Test
	public void test01() {//使用工具查询一条记录
		
		//获取连接池  传入工具类
		DataSource dataSource = DataSourceUtile.getDataSource();
		//创建工具类对象
		QueryRunner runner = new QueryRunner(dataSource);
		//编写并执行sql
		String  sql = "select id ,username,password,birth,create_time as createTime from  usr where username = ? and password = ?  ";
		try {
			 User user = runner.query(sql, new BeanHandler<>(User.class),"lisi","222222");
			 System.out.println(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test02() {//使用工具查询多条记录
		
		//获取连接池  传入工具类
		DataSource dataSource = DataSourceUtile.getDataSource();
		//创建工具类对象
		QueryRunner runner = new QueryRunner(dataSource);
		//编写并执行sql
		String  sql = "select id ,username,password,birth,create_time as createTime from  usr ";
		try {
			   List<User> users = runner.query(sql, new BeanListHandler<>(User.class));
			   for (User user : users) {
				System.out.println(user);
			   }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test03() {//使用工具查询更新一条记录
		
		//获取连接池  传入工具类
		DataSource dataSource = DataSourceUtile.getDataSource();
		//创建工具类对象
		QueryRunner runner = new QueryRunner(dataSource);
		//编写并执行sql
		String  sql = "update  usr set username = ? where id = ? ";
		try {
			int i = runner.update(sql, "丽丽",1);
			System.out.println(i);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void test04() {//使用工具查询更新一条记录
		
		//获取连接池  传入工具类
		DataSource dataSource = DataSourceUtile.getDataSource();
		//创建工具类对象
		QueryRunner runner = new QueryRunner(dataSource);
		//编写并执行sql
		String  sql = "delete from usr where id = ?";
		try {
			int i = runner.update(sql, 1);
			System.out.println(i);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	public void test05() {//使用工具查询更新一条记录
		
		//获取连接池  传入工具类
		DataSource dataSource = DataSourceUtile.getDataSource();
		//创建工具类对象
		QueryRunner runner = new QueryRunner(dataSource);
		//编写并执行sql
		String  sql = "insert  into usr (username,password,birth,create_time) values(?,?,?,?)";
		try {
			int i = runner.update(sql, "丽丽","888888","1992-2-1","2021-3-2 12:12:12");
			System.out.println(i);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test06() {//使用工具查询表中的记录数
		//获取连接池  传入工具类
				DataSource dataSource = DataSourceUtile.getDataSource();
				//创建工具类对象
				QueryRunner runner = new QueryRunner(dataSource);
				//编写并执行sql
				String  sql = "select count(*) from  usr ";
				try {
					  Long line = runner.query(sql,new ScalarHandler<Long>());
					  System.out.println(line);
				} catch (SQLException e) {
					e.printStackTrace();
				}

	}
	@Test
	public void test07() throws SQLException {//动态sql的使用
		
		//模拟用户传递的数据
		User user = new User();
		//user.setId(2);
		user.setUsername("lisi");
		user.setPassword("222222");
		try {
			user.setBirth(new SimpleDateFormat("yyyy-MM-dd").parse("1993-1-2"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String  sql  = "select  *  from  usr  where  1=1 ";
		
		//创建集合存储参数
		ArrayList<Object> params = new ArrayList<Object>();
		//最好将数据类型写成 包装类型 和数据库中的数据类型对应
		if(user.getId()!=0) {
			sql+=" and id = ? ";
			params.add(user.getId());
		}
		
		if(user.getUsername()!=null) {
			sql+=" and username = ?";
			params.add(user.getUsername());
		}
		
		if(user.getPassword()!=null) {
			sql+=" and password = ?";
			params.add(user.getPassword());
		}
		
		if(user.getBirth()!=null) {
			sql+=" and birth = ?";
			params.add(new SimpleDateFormat("yyyy-MM-dd").format(user.getBirth()));
		}
		
		System.out.println(sql);
		
		//获取数据源
		 DataSource dataSource = DataSourceUtile.getDataSource();
		 QueryRunner runner = new QueryRunner(dataSource);
		
		 List<User> users = runner.query(sql, new BeanListHandler<>(User.class),params.toArray());
		 for (User user2 : users) {
			System.out.println(user2);
		}
	}
	@Test
	public void test08() {//使用jdbc实现转账业务 使用事务
		Connection connection  = null;
		PreparedStatement pst = null;
		try {
			//获取连接   事务自动提交
			connection = DataSourceUtile.getConnection();
			//关闭自动提交
			connection.setAutoCommit(false);
			//获取执行sql的对象
			String sql = "update  account  set money= money + ? where  id = ?";
			pst = connection.prepareStatement(sql);
			
			
			//设置张三的账户 减少5000
			pst.setInt(1, -5000);
			pst.setInt(2, 1);
			//执行sql  
			pst.executeUpdate();
			
			//模拟异常  事务回滚
			int a = 1/0;
			
			//设置李四的账户 增加5000
			pst.setInt(1, 5000);
			pst.setInt(2, 9);
			//执行sql  
			pst.executeUpdate();
			
			//手动提交事务
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
			//回滚事务
				try {
					if(connection!=null) {
						connection.rollback();
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			
		}finally {
			//释放资源
			DataSourceUtile.closeAll(null, pst, connection);
		}
	}
	
	
	@Test
	public void test09() throws SQLException {//使用jdbc 批处理操作  插入多条数据
		
		//获取连接  
		Connection connection = DataSourceUtile.getConnection();
		//获取执行sql的对象
		Statement st = connection.createStatement();
		
		String sql = "insert into usr(username,password)values('ww','2222')";
		st.addBatch(sql);
		sql = "insert into usr(username,password)values('qq','2222')";
		st.addBatch(sql);
		sql = "insert into usr(username,password)values('ss','2222')";
		st.addBatch(sql);
		
		//执行sql
		int[] line = st.executeBatch();
		
		for (int i : line) {
			
			System.out.println(i);
		}
		
		
		
		
		
		
		
	}
	
}
