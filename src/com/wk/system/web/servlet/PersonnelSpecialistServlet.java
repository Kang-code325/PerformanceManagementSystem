package com.wk.system.web.servlet;

/* 
-*- coding: utf-8 -*-
# @Author  : Peter-JiY
# @Time    : 2024/10/11 17:10
# @Function:
*/


import com.wk.system.domain.PersonnelSpecialist;
import com.wk.system.service.PersonnelSpecialistService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PersonnelSpecialistServlet extends HttpServlet {

    private PersonnelSpecialistService personnelSpecialistService = new PersonnelSpecialistService(); // 调用Service层

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("add".equals(action)) {
            addPersonnelSpecialist(request, response);
        } else if ("update".equals(action)) {
            updatePersonnelSpecialist(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("delete".equals(action)) {
            deletePersonnelSpecialist(request, response);
        }
    }

    // 添加专员方法
    private void addPersonnelSpecialist(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String specialistId = request.getParameter("specialist_id");
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        // 创建PersonnelSpecialist对象
        PersonnelSpecialist personnelSpecialist = new PersonnelSpecialist();
        personnelSpecialist.setSpecialist_id(specialistId);
        personnelSpecialist.setName(name);
        personnelSpecialist.setPassword(password);

        // 调用Service层方法
        personnelSpecialistService.addPersonnelSpecialist(personnelSpecialist);

        // 重定向到专员列表页面
        response.sendRedirect("http://localhost:8080/System_war_exploded/adminInfosServlet");
    }

    // 更新专员方法
    private void updatePersonnelSpecialist(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String specialistId = request.getParameter("specialist_id");
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        // 创建PersonnelSpecialist对象
        PersonnelSpecialist personnelSpecialist = new PersonnelSpecialist(id, specialistId, name, password);

        // 调用Service层方法
        personnelSpecialistService.updatePersonnelSpecialist(personnelSpecialist);

        // 重定向到专员列表页面
        response.sendRedirect("http://localhost:8080/System_war_exploded/adminInfosServlet");
    }

    // 删除专员方法
    private void deletePersonnelSpecialist(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        // 调用Service层方法
        personnelSpecialistService.deletePersonnelSpecialist(id);

        // 重定向到专员列表页面
        response.sendRedirect("http://localhost:8080/System_war_exploded/adminInfosServlet");
    }
}
