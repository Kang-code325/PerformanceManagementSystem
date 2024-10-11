package com.wk.system.web.servlet;

import com.wk.system.domain.Performance;
import com.wk.system.service.PerformanceService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AdminPerformanceServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        // 1.调用service 查询所有商品 返回值list
        List<Performance> plist = null;
        PerformanceService performanceService = new PerformanceService();

//        HttpSession session = request.getSession();  // 获取会话对象
//        String employee_id = (String) session.getAttribute("employee_id");

        try {
            plist = performanceService.adminPerformanceInfo();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // 2.将list放入request域中,
        request.setAttribute("list", plist);

        // 3.请求转发
        request.getRequestDispatcher("/AdminPerformance.jsp").forward(request, response);
    }
}
