package org.jdbc.test;

import java.sql.Connection;

import org.jdbc.utils.DataSourceUtils;
import org.junit.jupiter.api.Test;

class DataSourceUtilsTest {

	@Test
	void test() {
		Connection connection = DataSourceUtils.getConnection();
		System.out.println(connection);
	}

}
