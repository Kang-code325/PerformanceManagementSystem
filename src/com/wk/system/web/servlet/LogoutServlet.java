package com.wk.system.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 获取当前 session 并使其失效（注销登录）
        HttpSession session = request.getSession(false); // 传入 false，避免创建新 session
        if (session != null) {
            session.invalidate();  // 注销 session
        }

        // 重定向到登录页面
        response.sendRedirect("userLogin.html");
    }
}

