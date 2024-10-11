package com.wk.system.web.servlet;

import com.wk.system.service.PerformanceService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class AdminAddPerfoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        PerformanceService performanceService = new PerformanceService();
        String employee_id = request.getParameter("employee_id");
        String work = request.getParameter("work");
        String score = request.getParameter("score");
        String appraise = request.getParameter("appraise");

        int rows = 0;
        try {
            rows = performanceService.addAdminProgress(employee_id, work, score, appraise);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        if (rows == 0){
            response.sendRedirect("http://localhost:8080/System_war_exploded/adminPerformanceServlet");
//            response.getWriter().write("<script>alert('提交失败');window.location.href='userLeave.html';</script>");
//
//            response.setHeader("refresh","1;url=/Servlet_war_exploded/userAttendanceInfoServlet");
        }else {
//            response.getWriter().write("<script>alert('提交成功');window.location.href='userLeave.html';</script>");
            response.sendRedirect("http://localhost:8080/System_war_exploded/adminPerformanceServlet");
        }
    }
}
