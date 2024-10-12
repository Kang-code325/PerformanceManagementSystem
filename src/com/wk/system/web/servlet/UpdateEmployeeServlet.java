package com.wk.system.web.servlet;

/* 
-*- coding: utf-8 -*-
# @Author  : Peter-JiY
# @Time    : 2024/10/12 11:06
# @Function:
*/

import com.wk.system.domain.Employee;
import com.wk.system.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateEmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String id = request.getParameter("id");  // 获取请求中的 id 参数


        EmployeeService employeeService=new EmployeeService();
        Employee employee=null;


        try{
            employee=employeeService.getEmployeeById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("963"+employee);
        request.setAttribute("employee", employee );
        request.getRequestDispatcher("/Updateuserinfos.jsp").forward(request, response);


    }
}
