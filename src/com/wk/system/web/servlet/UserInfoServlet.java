package com.wk.system.web.servlet;

import com.wk.system.domain.Employee;
import com.wk.system.service.EmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UserInfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();  // 获取会话对象
            String employee_id = (String) session.getAttribute("employee_id");
            if (employee_id == null) {
                // 如果没有用户信息，重定向到登录页面或者给出提示
                response.sendRedirect("userLogin.html");
                return;
            }

            EmployeeService employeeService = new EmployeeService();

            Employee  employees = employeeService.userinfo(employee_id);  // 假设获取用户列表
            request.setAttribute("employee", employees);

            RequestDispatcher dispatcher = request.getRequestDispatcher("userInfo.html");  // 转发到 JSP 页面
            dispatcher.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
