package cn.kgc.layui.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 学生实体类
 * @author alex-ycp
 * @create 2021-07-16 14:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private int id;
    private String stuName;
    private String sex;
    private int stuAge;
    private int classNo;
    private String tel;
}
