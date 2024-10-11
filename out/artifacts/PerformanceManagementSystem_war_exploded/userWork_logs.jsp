<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024/10/10
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<table border="1" align="center" width="88%">
  <tr>
    <td colspan="7">
    </td>
  </tr>
  <tr>
    <td><input type="checkbox" onclick="checkAll(this)"></td>
    <th>pid</th>
    <th>日期</th>
    <th>日志</th>
    <th>操作</th>
  </tr>
  <form method="post">
    <c:forEach items="${list }" var="p">
      <tr>
        <td width='1%'>
          <input type="checkbox" name="pid" value="${p.id }">
        </td>
        <td width='8%'>${p.id }</td>
        <td>${p.date }</td>
        <td>${p.logs }</td>
        <td width='16%'>
          <a href="http://localhost:8080/System_war_exploded/userAddLogs.html">添加</a>
          <a href="#">修改</a>
          <a href="${pageContext.request.contextPath }/userDelLogsServlet?pid=${p.id}">删除</a>
        </td>
      </tr>
    </c:forEach>
  </form>
</table>
</body>
</html>