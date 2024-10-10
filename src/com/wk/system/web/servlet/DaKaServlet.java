package com.wk.system.web.servlet;

import com.wk.system.domain.Employee;
import com.wk.system.domain.Work_logs;
import com.wk.system.service.AttendanceService;
import com.wk.system.service.EmployeeService;
import com.wk.system.service.Work_logsService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;

public class DaKaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        HttpSession session = request.getSession();  // 获取会话对象
        String employee_id = (String) session.getAttribute("employee_id");
        AttendanceService attendanceService = new AttendanceService();
        // 获取当前时间的 LocalTime
        LocalTime localTime = LocalTime.now();
        // 将 LocalTime 转换为 java.sql.Time
        Time time = Time.valueOf(localTime);
        String approval = "已签到";
        int rows = 0;
        try {
            rows = attendanceService.addDaKaInfo(employee_id,time, approval);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        if (rows == 0){
            response.sendRedirect("http://localhost:8080/System_war_exploded/userAttendanceInfoServlet");
//            response.getWriter().write("<script>alert('打卡失败');window.location.href='userAttendance.jsp';</script>");
//
//            response.setHeader("refresh","1;url=/Servlet_war_exploded/userAttendanceInfoServlet");
        }else {
            response.sendRedirect("http://localhost:8080/System_war_exploded/userAttendanceInfoServlet");
        }

    }
}
