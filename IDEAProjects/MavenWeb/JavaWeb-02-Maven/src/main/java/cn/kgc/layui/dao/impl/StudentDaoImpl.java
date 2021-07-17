package cn.kgc.layui.dao.impl;

import cn.kgc.layui.dao.StudentDao;
import cn.kgc.layui.entity.Student;
import cn.kgc.layui.util.DruidDBUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * StudentDao的实现类
 * @author alex-ycp
 * @create 2021-07-16 14:52
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> findAllByPage(int start, int size) {

        // 获取QueryRunner
        QueryRunner qr = new QueryRunner(DruidDBUtil.getDatasource());
        String sql = "select stu_no id , stu_name stuName,  sex , tel,class_no classNo ,age stuAge from student limit ?,?";
        try {
            return qr.query(sql, new BeanListHandler<>(Student.class), start, size);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return null;
    }

    @Override
    public long selectTotalCount() {

        QueryRunner qr = new QueryRunner(DruidDBUtil.getDatasource());
        String sql = "select count(*) from student";
        try {
            return qr.query(sql,new ScalarHandler<Long>());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return 0;
    }
}
