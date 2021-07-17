package cn.kgc.layui.service.impl;

import cn.kgc.layui.dao.StudentDao;
import cn.kgc.layui.dao.impl.StudentDaoImpl;
import cn.kgc.layui.entity.Student;
import cn.kgc.layui.service.StudentService;
import cn.kgc.layui.util.LayUiResult;

import java.util.List;

/**
 * 学生物实现类
 * @author alex-ycp
 * @create 2021-07-16 15:43
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = new StudentDaoImpl();

    @Override
    public LayUiResult<Student> findByPage(int start, int size) {

        List<Student> students = studentDao.findAllByPage(start, size);
        long count = studentDao.selectTotalCount();

        LayUiResult<Student> layUiResult = LayUiResult.<Student>builder().code(0).msg("请求成功").count(count).data(students).build();

//        // 创建layui表格需要的数据对象
//        LayUiResult<Student> layUiResult = new LayUiResult<>();
//
//        layUiResult.setCode(0);
//        layUiResult.setMsg("请求成功");
//        layUiResult.setData(students);
//        layUiResult.setCount(count);

        return layUiResult;
    }
}
