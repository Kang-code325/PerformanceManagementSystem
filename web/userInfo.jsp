<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户信息</title>
</head>
<body>
<h1>User Information</h1>

<c:if test="${not empty employee}">
    <p>ID: ${employee.id}</p>
    <p>Name: ${employee.name}</p>
    <p>Email: ${employee.email}</p>
</c:if>

<c:if test="${empty employee}">
    <p>No employee information available.</p>
</c:if>
</body>
</html>