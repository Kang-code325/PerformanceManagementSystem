package com.wk.system.web.servlet;

import com.wk.system.service.PerformanceService;
import com.wk.system.service.Work_logsService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class UserUpdateProgressServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String id = request.getParameter("id");
        String progress = request.getParameter("progress");

        PerformanceService performanceService = new PerformanceService();

        int rows = 0;
        try {
            rows = performanceService.updateProgress(id, progress);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (rows == 0){
            response.sendRedirect("http://localhost:8080/System_war_exploded/userPerformanceInfoServlet");
        }else {
            response.sendRedirect("http://localhost:8080/System_war_exploded/userPerformanceInfoServlet");
        }
    }
}
