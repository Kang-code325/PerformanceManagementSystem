<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <title>管理员个人信息</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1></h1>--%>
<%--<table border="1">--%>
<%--    <tr>--%>
<%--        <th>姓名</th>--%>
<%--        <th>工号</th>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        &lt;%&ndash;            <td><%=request.getAttribute("employee_id") %></td>&ndash;%&gt;--%>
<%--        &lt;%&ndash;            <td><%=request.getAttribute("employee_id") %></td>&ndash;%&gt;--%>
<%--        <td>${personnelSpecialist.name}</td>--%>
<%--        <td>${personnelSpecialist.specialist_id}</td>--%>
<%--    </tr>--%>
<%--</table>--%>
<%--</body>--%>
<%--</html>--%>


<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>管理员个人信息</title>
    <!-- 引入Layui的CSS和JS -->
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="layui/layui.js"></script>
</head>
<body>
<div class="layui-container">
    <h1 class="layui-text">管理员个人信息</h1>
    <table class="layui-table">
        <thead>
        <tr>
            <th>姓名</th>
            <th>工号</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${personnelSpecialist.name}</td>
            <td>${personnelSpecialist.specialist_id}</td>
        </tr>
        </tbody>
    </table>
</div>

<!-- 使用Layui的JS初始化表格效果 -->
<script>
    layui.use('table', function(){
        var table = layui.table;
    });
</script>
</body>
</html>
