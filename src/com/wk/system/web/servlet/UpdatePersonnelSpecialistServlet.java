package com.wk.system.web.servlet;

/* 
-*- coding: utf-8 -*-
# @Author  : Peter-JiY
# @Time    : 2024/10/12 10:23
# @Function:
*/

import com.wk.system.domain.PersonnelSpecialist;
import com.wk.system.service.PersonnelSpecialistService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdatePersonnelSpecialistServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String id = request.getParameter("id");  // 获取请求中的 id 参数


        PersonnelSpecialistService personnelSpecialistService=new PersonnelSpecialistService();
        PersonnelSpecialist personnelSpecialist=null;

        try{

            personnelSpecialist=personnelSpecialistService.getOnePersonnelSpecialist(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        request.setAttribute("personnelSpecialist",personnelSpecialist );
        request.getRequestDispatcher("/Updateadmininfos.jsp").forward(request, response);


    }
}
