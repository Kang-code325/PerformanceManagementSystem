<%--
  Created by IntelliJ IDEA.
  User: Stephen Yin
  Date: 2024/10/10
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>员工信息列表</title>
</head>
<body>
<h1>员工信息列表</h1>
<table border="1">
  <tr>
    <th>姓名</th>
    <th>工号</th>
    <th>部门</th>
    <th>职位</th>
    <th>邮箱</th>
  </tr>
  <c:forEach var="employee" items="${employeeList}">
    <tr>
      <td>${employee.name}</td>              <!-- 这里是单个员工对象 -->
      <td>${employee.employee_id}</td>
      <td>${employee.password}</td>
      <td>${employee.dep}</td>
      <td>${employee.job}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
