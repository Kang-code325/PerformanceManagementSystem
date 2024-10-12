package com.wk.system.web.servlet;

/* 
-*- coding: utf-8 -*-
# @Author  : Peter-JiY
# @Time    : 2024/10/11 10:39
# @Function:
*/
import com.wk.system.dao.EmployeeDao;
import com.wk.system.domain.Employee;
import com.wk.system.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class EmployeeServlet extends HttpServlet {

    private EmployeeService employeeService = new EmployeeService(); // 调用Service层

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String action = request.getParameter("action");

        System.out.println("action"+action);
        if ("add".equals(action)) {
            addEmployee(request, response);
        } else if ("update".equals(action)) {
            updateEmployee(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String action = request.getParameter("action");

        System.out.println("action"+action);
        if ("delete".equals(action)) {
            deleteEmployee(request, response);
        }
    }

    // 添加员工方法
    private void addEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String employeeId = request.getParameter("employee_id");
        String password = request.getParameter("password");
        String dep = request.getParameter("dep");
        String job = request.getParameter("job");

        // 创建员工对象
        Employee employee = new Employee( employeeId,name, password, dep, job);

        System.out.println(employee);

        // 调用Service层方法
        employeeService.addEmployee(employee);

        // 重定向到员工列表页面
        response.sendRedirect("http://localhost:8080/System_war_exploded/usersInfoServlet");
    }

    // 更新员工方法
    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String employeeId = request.getParameter("employee_id");
        String password = request.getParameter("password");
        String dep = request.getParameter("dep");
        String job = request.getParameter("job");

        // 创建员工对象
        Employee employee = new Employee( id,employeeId,  name,password, dep, job);

        // 调用Service层方法
        employeeService.updateEmployee(employee);

        // 重定向到员工列表页面
        response.sendRedirect("http://localhost:8080/System_war_exploded/usersInfoServlet");
    }

    // 删除员工方法
    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String Id = request.getParameter("id");
        System.out.println(Id);
        // 调用Service层方法
        employeeService.deleteEmployee(Id);

        // 重定向到员工列表页面
        response.sendRedirect("http://localhost:8080/System_war_exploded/usersInfoServlet");
    }
}