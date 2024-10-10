<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>管理员信息</title>
</head>
<body>
<h1>管理员信息列表</h1>
<table border="1">
  <tr>
    <th>id</th>
    <th>工号</th>
    <th>姓名</th>
    <th>密码</th>
  </tr>
  <c:forEach var="personnelSpecialist" items="${adminList}">
    <tr>
        <td>${personnelSpecialist.id}</td>
        <td>${personnelSpecialist.specialist_id}</td>
      <td>${personnelSpecialist.name}</td>
        <td>${personnelSpecialist.password}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
