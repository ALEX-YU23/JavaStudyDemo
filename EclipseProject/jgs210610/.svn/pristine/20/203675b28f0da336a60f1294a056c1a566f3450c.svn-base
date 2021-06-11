package org.jgs.jdbc.day01;

/**
 * 使用jdbc连接数据库
 * 步骤：  前提已经导入相关的jar
 * 1.注册驱动
 * 2.获取连接
 * 3.获取statement对象  发送sql到数据库
 * 4.执行sql
 * 5.处理结果集
 * 6.关闭连接释放资源
 * @author mosin
 * @date 2021年6月10日
 */

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import org.junit.Test;

import com.mysql.jdbc.Driver;

public class JDBCTest01 {

	@Test
	public void test01() { // 注册驱动的方式 1 并获取连接

		try {
			//创建驱动  Driver  每个驱动程序类必须实现的接口
			Driver driver = new Driver();
			//注册驱动  class DriverManager  管理一组JDBC驱动程序的基本服务 
			//static void registerDriver(driver)  
			//DriverManager.registerDriver(driver);

			/*获取连接
			 * static Connection getConnection(String url, String user, String password)  
			 *  url: 统一资源定位符  https://127.0.0.1:80/index.html 
			 *  url的组成部分： 通信协议//IP:端口号/资源名称
			 *  jdbc:mysql://localhost:3306/jgs2111
			 *  user: 用户名  root
			 *  password:密码  root
			 * */
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jgs2111?useSSL=false",
					"root", "root");
			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test02() { // 注册驱动的方式 2 并获取连接  (推荐使用)

		try {
			//通过反射 加载驱动  注册驱动 
			//java.sql.DriverManager.registerDriver(new Driver());
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jgs2111?useSSL=false",
					"root", "root");
			System.out.println(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test03() {//jdbc 连接的完整过程
		Connection connection = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//			  2.获取连接
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jgs2111?useSSL=false", "root",
					"root");
			//			  3.获取statement对象  发送sql到数据库
			st = connection.createStatement();
			String sql = "select * from usr";
			//			  4.执行sql
			rs = st.executeQuery(sql);

			/*5.处理结果集
			* ResultSet对象保持一个光标指向其当前的数据行。 
			* 最初，光标位于第一行之前。 next方法将光标移动到下一行
			* 并且在ResultSet对象中没有更多行时返回false 
			* 因此可以在while循环中使用循环来遍历结果集
			* */
			while (rs.next()) {
				/*获取结果集中的每个字段值
				 * getString(String  colName);
				 * getString(int  colIndex);  列的索引从1开始
				 * */
				int id = rs.getInt(1);
				String username = rs.getString("username");
				String password = rs.getString("password");
				Date date = rs.getDate("birth");
				Date timestamp = rs.getTimestamp("create_time");
				System.out.println("id:" + id + "\t" + "username:" + username + "\t" + "password:" + password+"\tdate:"+date+"\tcreate_time:"+timestamp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6.关闭连接释放资源

			try {
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (st != null) {
					st.close();
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
	public void test04() { //插入一条数据到 usr表格
		Connection connection = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//			  2.获取连接
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jgs2111?useSSL=false", "root",
					"root");
			//3.获取statement对象  发送sql到数据库
			st = connection.createStatement();
			String sql = "insert into usr(username,password,birth,create_time)"
					+ "values('lisi','222222','1993-1-2','2021-5-10 11:26:30')";
			// 4.执行sql  返回的值是影响的行数
			int line = st.executeUpdate(sql);
			System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6.关闭连接释放资源
			try {
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (st != null) {
					st.close();
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
	public void test05() { //修改 usr表格中的一条数据
		Connection connection = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//			  2.获取连接
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jgs2111?useSSL=false", "root",
					"root");
			//3.获取statement对象  发送sql到数据库
			st = connection.createStatement();
			String sql = "update usr set username = 'zhangsan' where id = 1";
			// 4.执行sql  返回的值是影响的行数
			int line = st.executeUpdate(sql);
			System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6.关闭连接释放资源
			try {
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (st != null) {
					st.close();
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
	public void test06() { //删除 usr表格中的一条数据
		Connection connection = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//			  2.获取连接
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jgs2111?useSSL=false", "root",
					"root");
			//3.获取statement对象  发送sql到数据库
			st = connection.createStatement();
			String sql = "delete from usr where id = 1";
			// 4.执行sql  返回的值是影响的行数
			int line = st.executeUpdate(sql);
			System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6.关闭连接释放资源
			try {
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (st != null) {
					st.close();
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
	
}
