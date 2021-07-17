package cn.kgc.layui.servlet;

import cn.kgc.layui.entity.Student;
import cn.kgc.layui.service.StudentService;
import cn.kgc.layui.service.impl.StudentServiceImpl;
import cn.kgc.layui.util.LayUiResult;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author alex-ycp
 * @create 2021-07-16 15:50
 */
@WebServlet("/findAllStudent")
public class StudentServlet extends HttpServlet {

    private static StudentService studentService = new StudentServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 获取前端传递的参数
        req.setCharacterEncoding("utf-8");
        // 获取配置 page limit
        int page = Integer.parseInt(req.getParameter("page"));
        int size = Integer.parseInt(req.getParameter("limit"));

        int start = (page-1)*size;

        LayUiResult<Student> result = studentService.findByPage(start, size);

        // 以Json类型数据的格式响应数据
        String strResult = JSON.toJSONString(result);
        // 通过响应对象获取输出流
        resp.setContentType("application/json;charset=utf-8");

        resp.getWriter().write(strResult);


    }
}
