package cn.kgc.javaweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.kgc.javaweb.entity.User;
import cn.kgc.javaweb.util.DruidDataSourceUtil;

/**
 * 用户持久化层的实现类  真正的实现数据的操作
 * @author mosin
 * @date 2021年7月6日
 * @version  1.0
 */
public class UserDaoImpl implements UserDao {

	@Override
	public int addUser(User user) {
		//获取连接
		Connection connection = DruidDataSourceUtil.getConnection();
		PreparedStatement pst  = null;
		//获取执行sql的对象
		String sql = "insert into user(username,password,nickname)values(?,?,?)";
		try {
			pst = connection.prepareStatement(sql);
			pst.setObject(1, user.getUsername());
			pst.setObject(2, user.getPassword());
			pst.setObject(3, user.getNickname());
			int line = pst.executeUpdate();
			return line;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DruidDataSourceUtil.closeAll(null, pst, connection);
		}
		return 0;
	}

}
