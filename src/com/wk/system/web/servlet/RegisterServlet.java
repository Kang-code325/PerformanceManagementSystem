package com.wk.system.web.servlet;

import com.wk.system.domain.Employee;
import com.wk.system.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        System.out.println("doPost");

        //从请求中获取登录的员工工号和大密码
        String employee_id = req.getParameter("employee_id");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String dep = req.getParameter("dep");
        String job = req.getParameter("job");

        System.out.println(employee_id);
        System.out.println(name);
        System.out.println(password);
        System.out.println(dep);
        System.out.println(job);

        EmployeeService employeeService = new EmployeeService();
        int rows = 0;
        try {
            rows = employeeService.register(employee_id, name, password, dep, job);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (rows == 0){
            resp.getWriter().write("注册失败");
        }else {
            resp.getWriter().write("注册成功！");
        }
    }
}
