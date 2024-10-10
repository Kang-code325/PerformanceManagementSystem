<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户信息</title>
</head>
<body>
<h1>员工个人信息</h1>
<table border="1">
    <tr>
        <th>姓名</th>
        <th>工号</th>
        <th>部门</th>
        <th>职业</th>
    </tr>
        <tr>
<%--            <td><%=request.getAttribute("employee_id") %></td>--%>
<%--            <td><%=request.getAttribute("employee_id") %></td>--%>
            <td>${employee.name}</td>
            <td>${employee.employee_id}</td>
            <td>${employee.dep}</td>
            <td>${employee.job}</td>
        </tr>
</table>
</body>
</html>