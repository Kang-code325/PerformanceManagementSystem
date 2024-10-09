package com.wk.system.web.servlet;

import com.wk.system.domain.Employee;
import com.wk.system.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        System.out.println("doPost");

        //从请求中获取登录的员工工号和大密码
        String employee_id = req.getParameter("employee_id");
        String password = req.getParameter("password");

        System.out.println(employee_id);
        System.out.println(password);

        EmployeeService employeeService = new EmployeeService();
        Employee employee = null;
        try {
            employee = employeeService.login(employee_id, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (employee == null){
            resp.getWriter().write("用户名或密码错误");
        }else {
            resp.getWriter().write(employee.getName()+"登录成功！");
            // 用户名和密码正确，创建 session 并存储用户信息
            HttpSession session = req.getSession();
            session.setAttribute("employee_id", employee_id);
            // 重定向到home页面
            resp.sendRedirect("http://localhost:8080/System_war_exploded/userHome.html");
        }


    }
}
