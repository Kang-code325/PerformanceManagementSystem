package com.wk.system.web.servlet;

import com.wk.system.service.PerformanceService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class AdminUpdatePerfoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        String id = request.getParameter("id");
        String employee_id = request.getParameter("employee_id");
        String work = request.getParameter("work");
        String score = request.getParameter("score");
        String appraise = request.getParameter("appraise");

        PerformanceService performanceService = new PerformanceService();

        int rows = 0;
        try {
            rows = performanceService.updateAdminProgress(id, employee_id, work, score, appraise);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (rows == 0){
            response.sendRedirect("http://localhost:8080/System_war_exploded/adminPerformanceServlet");
        }else {
            response.sendRedirect("http://localhost:8080/System_war_exploded/adminPerformanceServlet");
        }
    }
}
