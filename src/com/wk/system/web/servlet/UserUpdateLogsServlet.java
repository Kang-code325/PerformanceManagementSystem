package com.wk.system.web.servlet;

import com.wk.system.domain.Work_logs;
import com.wk.system.service.Work_logsService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class UserUpdateLogsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String id = request.getParameter("id");
        String logs = request.getParameter("logs");

        Work_logsService workLogsService = new Work_logsService();

        int rows = 0;
        try {
            rows = workLogsService.updatelogs(id, logs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (rows == 0){
            response.sendRedirect("http://localhost:8080/System_war_exploded/userWork_logsInfoServlet");
        }else {
            response.sendRedirect("http://localhost:8080/System_war_exploded/userWork_logsInfoServlet");
        }
    }
}
