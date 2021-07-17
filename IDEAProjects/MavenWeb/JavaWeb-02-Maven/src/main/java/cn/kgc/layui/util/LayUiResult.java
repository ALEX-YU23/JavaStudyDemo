package cn.kgc.layui.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

import java.util.List;

/**
 * layui的表格返回数据的封装类
 * @author alex-ycp
 * @create 2021-07-16 14:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LayUiResult<E> {
    private int code;
    private String msg;
    private long count;
    private List<E> data;
}
