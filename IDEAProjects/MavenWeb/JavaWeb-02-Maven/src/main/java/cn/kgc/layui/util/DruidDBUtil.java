package cn.kgc.layui.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author mosin
 * date 2021/7/15
 * @version 1.0
 */
public  final class DruidDBUtil {

    private  DruidDBUtil(){}
    private  static  DataSource dataSource=null;
    static{
        InputStream rs = DruidDBUtil.class.getClassLoader().getResourceAsStream("druid.properties");
        Properties ps = new Properties();
        try {
            ps.load(rs);
            dataSource = DruidDataSourceFactory.createDataSource(ps);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDatasource(){
            return dataSource;
    }

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public void closeAll(ResultSet rst, Statement stmt, Connection connection){

        try {
            if(rst!=null) {
                rst.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(stmt!=null) {
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(connection!=null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
