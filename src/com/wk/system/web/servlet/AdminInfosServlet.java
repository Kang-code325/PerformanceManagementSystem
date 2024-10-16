package com.wk.system.web.servlet;

/* 
-*- coding: utf-8 -*-
# @Author  : Peter-JiY
# @Time    : 2024/10/10 11:17
# @Function:
*/
import com.wk.system.domain.PersonnelSpecialist;
import com.wk.system.service.PersonnelSpecialistService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class AdminInfosServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            HttpSession session = request.getSession();  // 获取会话对象
            String specialist_id = (String) session.getAttribute("specialist_id");
//            System.out.println("这里是"+specialist_id);
//            if (specialist_id == null) {
//                // 如果没有用户信息，重定向到登录页面或者给出提示
//                response.sendRedirect("adminLogin.html");
//                return;
//            }

            PersonnelSpecialistService personnelSpecialistService = new PersonnelSpecialistService();
            // 获取所有管理员信息
//            List<PersonnelSpecialist> adminList = personnelSpecialistService.admininfos();
//            request.setAttribute("adminList", adminList);

// 获取分页参数
            String pageNumStr = request.getParameter("pageNum");
            String pageSizeStr = request.getParameter("pageSize");

            // 设置默认页码和每页数据条数
            int pageNum = pageNumStr != null ? Integer.parseInt(pageNumStr) : 1;
            int pageSize = pageSizeStr != null ? Integer.parseInt(pageSizeStr) : 10;

            // 获取分页后的管理员信息
            List<PersonnelSpecialist> adminList = personnelSpecialistService.getAdminListByPage(pageNum, pageSize);

            // 获取总条数以计算分页信息
            int total = personnelSpecialistService.getTotalAdminCount();

            // 将分页数据设置到 request 作用域
            request.setAttribute("adminList", adminList);
            request.setAttribute("total", total);
            request.setAttribute("pageSize", pageSize);
            request.setAttribute("currentPage", pageNum);



            request.setAttribute("adminList", adminList);

            // 转发到 JSP 页面
            request.getRequestDispatcher("admininfos.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//import com.google.gson.Gson;
//import com.wk.system.domain.PersonnelSpecialist;
//import com.wk.system.service.PersonnelSpecialistService;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.util.List;
//
//public class AdminInfosServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            HttpSession session = request.getSession();
//            String specialist_id = (String) session.getAttribute("specialist_id");
//
//            if (specialist_id == null) {
//                response.sendRedirect("adminLogin.html");
//                return;
//            }
//
//            // 判断是请求 JSON 数据还是直接跳转
//            String action = request.getParameter("action");
//            if ("getJsonData".equals(action)) {
//                PersonnelSpecialistService personnelSpecialistService = new PersonnelSpecialistService();
//                List<PersonnelSpecialist> adminList = personnelSpecialistService.admininfos();
//
//                Gson gson = new Gson();
//                String json = gson.toJson(adminList);
//                response.setContentType("application/json");
//                response.setCharacterEncoding("UTF-8");
//                response.getWriter().write(json);
//            } else {
//                // 跳转到 JSP 页面
//                request.getRequestDispatcher("admininfos.jsp").forward(request, response);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

