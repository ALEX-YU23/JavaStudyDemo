package org.jgs.jdbc.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.jgs.jdbc.entity.User;
import org.jgs.jdbc.utile.JDBCUtile;
import org.junit.Test;




/**
 * 使用preparedStatement实现数据的增删改查
 * preparedStatement  vs  Statement
 * 1.Statement存在sql注入问题
 * 2.Statement中有大量的sql的拼接
 * 3.Statement执行的效率较低 每次都要进行sql语句的编译
 * @author mosin
 * @date 2021年6月11日
 */
public class JDBCTest03 {
	@Test
	public  void  test01() { //使用preparestatement实现数据的查询
		Connection connection = null;
		ResultSet rs = null;
		PreparedStatement pst = null;
		try {
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取连接
			connection = (Connection) DriverManager.getConnection("jdbc:mysql:///jgs2111","root","root");
			//获取执行sql的对象
			String sql = "select * from  usr";
			//获取对象的同时传递sql  进行sql语句的预编译
			pst = connection.prepareStatement(sql);
			//执行sql 获取结果集
			rs = pst.executeQuery();
			//处理结果集
			User user = null;
			while (rs.next()) {
				//获取每一个字段的值
				int id = rs.getInt(1);
				String uname = rs.getString(2);
				String pwd = rs.getString(3);
				Date birth = rs.getDate(4);
				Date timestamp = rs.getTimestamp(5);

				//封装数据
				user = new User();
				user.setId(id);
				user.setUsername(uname);
				user.setPassword(pwd);
				user.setBirth(birth);
				user.setCreateTime(timestamp);
				System.out.println(user);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 6.关闭连接释放资源

			try {
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (pst != null) {
					pst.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
			
		}
	@Test
	public  void  test02() { //使用preparedstatement实现数据的条件查询  
		Connection connection = null;
		ResultSet rs = null;
		PreparedStatement pst = null;
		try {
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取连接
			connection = (Connection) DriverManager.getConnection("jdbc:mysql:///jgs2111","root","root");
			//获取执行sql的对象  使用?进行参数的占位
			String sql = "select * from  usr where username = ? and  password = ? ";
			//获取对象的同时传递sql  进行sql语句的预编译
			pst = connection.prepareStatement(sql);
			//设置参数
			pst.setString(1, "lisi");
			pst.setString(2, "222222");
			//执行sql 获取结果集
			rs = pst.executeQuery();
			//处理结果集
			User user = null;
			while (rs.next()) {
				//获取每一个字段的值
				int id = rs.getInt(1);
				String uname = rs.getString(2);
				String pwd = rs.getString(3);
				Date birth = rs.getDate(4);
				Date timestamp = rs.getTimestamp(5);

				//封装数据
				user = new User();
				user.setId(id);
				user.setUsername(uname);
				user.setPassword(pwd);
				user.setBirth(birth);
				user.setCreateTime(timestamp);
				System.out.println(user);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 6.关闭连接释放资源

			try {
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (pst != null) {
					pst.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
			
		}
	
	@Test
	public  void  test03() { //使用preparestatement实现数据的添加 
		Connection connection = null;
		ResultSet rs = null;
		PreparedStatement pst = null;
		try {
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取连接
			connection = (Connection) DriverManager.getConnection("jdbc:mysql:///jgs2111","root","root");
			//获取执行sql的对象  使用?进行参数的占位
			String sql = "insert into usr (username,password,birth,create_time)values(?,?,?,?) ";
			//获取对象的同时传递sql  进行sql语句的预编译
			pst = connection.prepareStatement(sql);
			//设置参数
			pst.setString(1, "李四");
			pst.setString(2, "111111");
			pst.setString(3, "1991-1-2");
			pst.setString(4, "2021-2-1 12:12:12");
			//执行sql 
			int line = pst.executeUpdate();
			System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 6.关闭连接释放资源

			try {
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (pst != null) {
					pst.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
			
		}
	@Test
	public  void  test04() { //使用preparestatement实现数据的修改
		Connection connection = null;
		ResultSet rs = null;
		PreparedStatement pst = null;
		try {
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取连接
			connection = (Connection) DriverManager.getConnection("jdbc:mysql:///jgs2111","root","root");
			//获取执行sql的对象  使用?进行参数的占位
			String sql = "update usr set username= ? where id = ? ";
			//获取对象的同时传递sql  进行sql语句的预编译
			pst = connection.prepareStatement(sql);
			//设置参数
			pst.setString(1, "孟顺");
			pst.setInt(2, 4);
			//执行sql 
			int line = pst.executeUpdate();
			System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 6.关闭连接释放资源

			try {
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (pst != null) {
					pst.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
			
		}
	
	@Test
	public  void  test05() { //使用preparestatement实现数据的删除
		try {
			Connection connection = JDBCUtile.getConnection();
			String sql = "delete from  usr where id = ?";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1, 2);
			int line = pst.executeUpdate();
			System.out.println(line);
			//释放资源
			JDBCUtile.closeAll(null, pst, connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	 
	@Test
	public  void  test06() { //通过jdbc工具类获取连接
		
		Connection connection = JDBCUtile.getConnection();
		System.out.println(connection);
		
		
	}
}
	
