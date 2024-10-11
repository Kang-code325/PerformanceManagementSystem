package com.wk.system.web.servlet;

/* 
-*- coding: utf-8 -*-
# @Author  : Peter-JiY
# @Time    : 2024/10/11 19:51
# @Function:
*/

import com.wk.system.domain.Attendance;
import com.wk.system.service.AttendanceService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class AttendanceInfosServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
//            HttpSession session = request.getSession();  // 获取会话对象
//            String employee_id = (String) session.getAttribute("employee_id");

            AttendanceService attendanceService = new AttendanceService();

            // 获取分页参数
            String pageNumStr = request.getParameter("pageNum");
            String pageSizeStr = request.getParameter("pageSize");

            // 设置默认页码和每页数据条数
            int pageNum = pageNumStr != null ? Integer.parseInt(pageNumStr) : 1;
            int pageSize = pageSizeStr != null ? Integer.parseInt(pageSizeStr) : 10;

            // 获取分页后的考勤信息
            List<Attendance> attendanceList = attendanceService.getAttendanceListByPage(pageNum, pageSize);

            // 获取总条数以计算分页信息
            int total = attendanceService.getTotalAttendanceCount();

            // 将分页数据设置到 request 作用域
            request.setAttribute("attendanceList", attendanceList);
            request.setAttribute("total", total);
            request.setAttribute("pageSize", pageSize);
            request.setAttribute("currentPage", pageNum);

            // 转发到 JSP 页面
            request.getRequestDispatcher("Attendance.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
