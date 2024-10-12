package com.wk.system.web.servlet;

import com.wk.system.service.PerformanceService;
import com.wk.system.service.Work_logsService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

public class AdminDelPerfomance extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        PerformanceService performanceService = new PerformanceService();

        String id = request.getParameter("id");
        System.out.println(id);

        int rows = 0;
        try {
            rows = performanceService.delAdminProgress(id);
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
