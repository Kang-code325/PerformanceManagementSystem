package com.wk.system.web.servlet;

/*
-*- coding: utf-8 -*-
# @Author  : Peter-JiY
# @Time    : 2024/10/11 19:34
# @Function:
*/
//package com.wk.system.web.servlet;

import com.wk.system.domain.Attendance;
import com.wk.system.service.AttendanceService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class AttendanceServlet extends HttpServlet {

    private AttendanceService attendanceService = new AttendanceService(); // 调用Service层

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("add".equals(action)) {
            addAttendanceRecord(request, response);
        } else if ("update".equals(action)) {
            updateAttendanceRecord(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println(action+"233");
        if ("delete".equals(action)) {
            deleteAttendanceRecord(request, response);
        }
    }

    // 添加考勤记录方法
    private void addAttendanceRecord(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String employeeId = request.getParameter("employee_id");
        String leave = request.getParameter("leave");
        String approval = request.getParameter("approval");

        // 自动获取当前日期和时间
        Date currentDate = Date.valueOf(LocalDate.now());
        Time currentTime = Time.valueOf(LocalTime.now());

        // 创建Attendance对象
        Attendance attendance = new Attendance();
        attendance.setEmployee_id(employeeId);
        attendance.setDate(currentDate);
        attendance.setTime(currentTime);
        attendance.setLeave(leave);
        attendance.setApproval(approval);

        // 调用Service层方法
        attendanceService.addAttendance(attendance);

        // 重定向到考勤记录列表页面
        response.sendRedirect("http://localhost:8080/System_war_exploded/attendanceInfosServlet");
    }

    // 更新考勤记录方法
    private void updateAttendanceRecord(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String employeeId = request.getParameter("employee_id");
        String leave = request.getParameter("leave");
        String approval = request.getParameter("approval");

        // 自动获取当前时间更新
        Date currentDate = Date.valueOf(LocalDate.now());
        Time currentTime = Time.valueOf(LocalTime.now());

        // 创建Attendance对象
        Attendance attendance = new Attendance(id, employeeId, currentDate, currentTime, leave, approval);

        // 调用Service层方法
        attendanceService.updateAttendance(attendance);

        // 重定向到考勤记录列表页面
        response.sendRedirect("http://localhost:8080/System_war_exploded/attendanceInfosServlet");
    }

    // 删除考勤记录方法
    private void deleteAttendanceRecord(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        // 调用Service层方法
        attendanceService.deleteAttendance(id);

        // 重定向到考勤记录列表页面
        response.sendRedirect("http://localhost:8080/System_war_exploded/attendanceInfosServlet");
    }
}
