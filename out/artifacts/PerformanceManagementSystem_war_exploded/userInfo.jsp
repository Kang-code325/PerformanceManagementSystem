<jsp:useBean id="employee" scope="request" class="com.wk.system.domain.Employee"/>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户信息</title>
</head>
<body>
<h1>用户信息</h1>
<table border="1">
    <tr>
        <th>姓名</th>
        <th>职位</th>
    </tr>
    <tr>
        <td>${employee.name}</td>  <!-- 显示姓名 -->
        <td>${employee.job}</td>   <!-- 显示职位 -->
    </tr>
</table>
</body>
</html>