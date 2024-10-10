package com.wk.system.web.servlet;

import com.wk.system.domain.Attendance;
import com.wk.system.domain.Work_logs;
import com.wk.system.service.AttendanceService;
import com.wk.system.service.Work_logsService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserAttendanceInfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        // 1.调用service 查询所有商品 返回值list
        List<Attendance> plist = null;
        AttendanceService attendanceService = new AttendanceService();

        HttpSession session = request.getSession();  // 获取会话对象
        String employee_id = (String) session.getAttribute("employee_id");

        try {
            plist = attendanceService.userAttendanceInfo(employee_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // 2.将list放入request域中,
        request.setAttribute("list", plist);

        // 3.请求转发
        request.getRequestDispatcher("/userAttendance.jsp").forward(request, response);
    }
}
