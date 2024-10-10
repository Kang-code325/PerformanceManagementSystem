package com.wk.system.web.servlet;

/* 
-*- coding: utf-8 -*-
# @Author  : Peter-JiY
# @Time    : 2024/10/10 10:42
# @Function:
*/

import com.wk.system.domain.Employee;
import com.wk.system.domain.PersonnelSpecialist;
import com.wk.system.service.EmployeeService;
import com.wk.system.service.PersonnelSpecialistService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AdminInfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();  // 获取会话对象
            String specialist_id = (String) session.getAttribute("specialist_id");
//            System.out.println("这里是"+specialist_id);
            if (specialist_id == null) {
                // 如果没有用户信息，重定向到登录页面或者给出提示
                response.sendRedirect("adminLogin.html");
                return;
            }

            PersonnelSpecialistService personnelSpecialistService = new PersonnelSpecialistService();

            PersonnelSpecialist personnelSpecialist = personnelSpecialistService.admininfo(specialist_id);  // 假设获取用户列表
            request.setAttribute("personnelSpecialist", personnelSpecialist);

//            request.getRequestDispatcher("userInfo.jsp");  // 转发到 JSP 页面
            request.getRequestDispatcher("adminInfo.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
