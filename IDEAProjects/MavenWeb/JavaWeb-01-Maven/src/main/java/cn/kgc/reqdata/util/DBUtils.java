package cn.kgc.reqdata.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author alex-ycp
 * @create 2021-07-16 11:26
 */
public final class DBUtils {

    private static DataSource ds = null;

    static {
        Properties ps = new Properties();
        try {
            InputStream is = DBUtils.class.getClassLoader().getResourceAsStream("db.properties");
            ps.load(is);
            ds = DruidDataSourceFactory.createDataSource(ps);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource() {
        return ds;
    }

    public static Connection getConnection() {
        try {
            return ds.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

}
