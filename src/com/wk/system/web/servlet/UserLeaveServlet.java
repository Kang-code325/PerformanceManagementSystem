package com.wk.system.web.servlet;

import com.wk.system.service.AttendanceService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;

public class UserLeaveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        HttpSession session = request.getSession();  // 获取会话对象
        String employee_id = (String) session.getAttribute("employee_id");
        AttendanceService attendanceService = new AttendanceService();

        String leave = request.getParameter("message");

        String approval = "待通过";
        int rows = 0;
        try {
            rows = attendanceService.addLeaveInfo(employee_id, leave, approval);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        if (rows == 0){
//            response.sendRedirect("http://localhost:8080/System_war_exploded/userAttendanceInfoServlet");
            response.getWriter().write("<script>alert('提交失败');window.location.href='userLeave.html';</script>");
//
//            response.setHeader("refresh","1;url=/Servlet_war_exploded/userAttendanceInfoServlet");
        }else {
            response.getWriter().write("<script>alert('提交成功');window.location.href='userLeave.html';</script>");
//            response.sendRedirect("http://localhost:8080/System_war_exploded/userAttendanceInfoServlet");
        }

    }
}

