package org.jdbcpool.c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class TestC3P0 {

	@Test
	public void  test03() throws SQLException {//使用c3p0连接池获取连接

		ComboPooledDataSource ds = new ComboPooledDataSource();
		Connection connection = ds.getConnection();
		System.out.println(connection);

	}
	
}
