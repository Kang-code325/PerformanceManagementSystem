package com.wk.system.web.servlet;

/* 
-*- coding: utf-8 -*-
# @Author  : Peter-JiY
# @Time    : 2024/10/10 16:26
# @Function:
*/


import com.wk.system.domain.Employee;
import com.wk.system.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class UsersInfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();  // 获取会话对象
            String employee_id = (String) session.getAttribute("employee_id");
            System.out.println("这里是" + employee_id);

//            if (employee_id == null) {
//                // 如果没有用户信息，重定向到登录页面
//                response.sendRedirect("userLogin.html");
//                return;
//            }

            // 如果参数不存在，设置默认值为1和10
            String pageNumParam = request.getParameter("pageNum");
            String pageSizeParam = request.getParameter("pageSize");

            int pageNum = (pageNumParam != null) ? Integer.parseInt(pageNumParam) : 1;
            int pageSize = (pageSizeParam != null) ? Integer.parseInt(pageSizeParam) : 10;

            EmployeeService employeeService = new EmployeeService();

            // 获取分页数据
            List<Employee> employeeList = employeeService.userinfoList(pageNum, pageSize);
            int total = employeeService.getTotalEmployeeCount();

            // 设置数据到 JSP
            request.setAttribute("employeeList", employeeList);
            request.setAttribute("total", total);
            request.setAttribute("pageSize", pageSize);
            request.setAttribute("currentPage", pageNum);

            // 转发到 JSP 页面
            request.getRequestDispatcher("userInfos.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "服务器错误"); // 处理异常情况
        }
    }
}
