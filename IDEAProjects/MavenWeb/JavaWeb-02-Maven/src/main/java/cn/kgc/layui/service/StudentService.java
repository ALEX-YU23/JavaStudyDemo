package cn.kgc.layui.service;

import cn.kgc.layui.entity.Student;
import cn.kgc.layui.util.LayUiResult;

/**
 *
 * 学生业务类
 * @author alex-ycp
 * @create 2021-07-16 15:40
 */
public interface StudentService {

//    LayUiResult<Object> findByPage(int start,int size);
    LayUiResult<Student> findByPage(int start,int size);

}
