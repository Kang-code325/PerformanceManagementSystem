package com.wk.system.web.servlet;

import com.wk.system.domain.Performance;
import com.wk.system.domain.Work_logs;
import com.wk.system.service.PerformanceService;
import com.wk.system.service.Work_logsService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class UserEditProgressServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String id = request.getParameter("id");  // 获取请求中的 id 参数

        // 从数据库中根据 id 获取相应的日志对象
        PerformanceService performanceService = new PerformanceService();
        Performance performance = null;
        try {
            performance = performanceService.getOneProgress(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // 将日志对象传递到编辑页面
        request.setAttribute("performance", performance);
        request.getRequestDispatcher("/userUpdateProgress.jsp").forward(request, response);
    }
}
