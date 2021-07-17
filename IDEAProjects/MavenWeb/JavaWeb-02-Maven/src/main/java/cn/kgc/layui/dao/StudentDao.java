package cn.kgc.layui.dao;

import cn.kgc.layui.entity.Student;

import java.util.List;

/**
 *
 * @author alex-ycp
 * @create 2021-07-16 14:51
 */
public interface StudentDao {

    /***
     * 查询页面展示数据
     * @param start 从那个位置开始
     * @param size 查询的条数
     * @return List<Student>
     */
    List<Student> findAllByPage(int start, int size);

    // 查询总条数

    long selectTotalCount();

}
