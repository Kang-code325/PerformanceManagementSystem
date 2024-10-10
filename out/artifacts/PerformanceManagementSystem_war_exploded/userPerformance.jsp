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
            <form method="post">
                员工工号:<input employee_id="employee_id">&nbsp;&nbsp;&nbsp;&nbsp;
                关键词:<input name="kw">
                &nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" value="查询">
            </form>
        </td>
        <td colspan="1" align="right">
            <input type="button" value="删除选中" onclick="delCheck()">
        </td>
    </tr>
    <tr>
        <td><input type="checkbox" onclick="checkAll(this)"></td>
        <th>pid</th>
        <th>任务内容</th>
        <th>任务进度</th>
        <th>得分</th>
        <th>留言</th>
        <th>时间</th>
        <th>操作</th>
    </tr>
    <form method="post">
        <c:forEach items="${list }" var="p">
            <tr>
                <td width='1%'>
                    <input type="checkbox" name="pid" value="${p.id }">
                </td>
                <td width='8%'>${p.id }</td>
                <td>${p.work }</td>
                <td>${p.progress }</td>
                <td width='8%'>${p.score }</td>
                <td>${p.appraise }</td>
                <td>${p.time }</td>
                <td width='8%'>
                    <a href="#">修改</a>
                </td>
            </tr>
        </c:forEach>
    </form>
</table>
</body>
</html>
