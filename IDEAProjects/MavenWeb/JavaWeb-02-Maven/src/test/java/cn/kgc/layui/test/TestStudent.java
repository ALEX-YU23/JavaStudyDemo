package cn.kgc.layui.test;

import cn.kgc.layui.dao.impl.StudentDaoImpl;
import cn.kgc.layui.entity.Student;
import org.junit.Test;

import java.util.List;

/**
 * @author alex-ycp
 * @create 2021-07-16 15:14
 */
public class TestStudent {

    @Test
    public void testFindAllByPage(){
        StudentDaoImpl studentDao = new StudentDaoImpl();
        List<Student> studentList = studentDao.findAllByPage(0, 10);
        studentList.forEach(student -> System.out.println(student));


    }

    @Test
    public void testSelectTotalCount(){
        StudentDaoImpl studentDao = new StudentDaoImpl();

        long l = studentDao.selectTotalCount();
        System.out.println(l);

    }

}
