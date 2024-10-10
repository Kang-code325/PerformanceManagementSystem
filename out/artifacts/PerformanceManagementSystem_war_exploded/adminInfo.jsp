<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>管理员个人信息</title>
</head>
<body>
<h1></h1>
<table border="1">
    <tr>
        <th>姓名</th>
        <th>工号</th>
    </tr>
    <tr>
        <%--            <td><%=request.getAttribute("employee_id") %></td>--%>
        <%--            <td><%=request.getAttribute("employee_id") %></td>--%>
        <td>${personnelSpecialist.name}</td>
        <td>${personnelSpecialist.specialist_id}</td>
    </tr>
</table>
</body>
</html>