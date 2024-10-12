<%--
  Created by IntelliJ IDEA.
  User: Stephen Yin
  Date: 2024/10/12
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>修改员工信息</title>
    <link rel="stylesheet" href="layui/css/layui.css"> <!-- 引入layui CSS -->
</head>
<body>

<div class="layui-container">
    <h2 class="layui-bg-black" style="padding: 10px; color: white;">修改员工信息</h2>

    <!-- 表单，展示数据并允许用户修改 -->
    <form class="layui-form" action="http://localhost:8080/System_war_exploded/employeeServlet" method="POST">
        <input type="hidden" name="action" value="update">

        <!-- 隐藏的ID，用户无法修改 -->
        <div class="layui-form-item">
            <label class="layui-form-label">ID：</label>
            <div class="layui-input-block">
                <input type="text" name="id" value="${employee.id}" readonly class="layui-input">
            </div>
        </div>

        <!-- 工号 -->
        <div class="layui-form-item">
            <label class="layui-form-label">工号：</label>
            <div class="layui-input-block">
                <input type="text" name="employee_id" value="${employee.employee_id}" required lay-verify="required" placeholder="请输入工号" class="layui-input">
            </div>
        </div>

        <!-- 姓名 -->
        <div class="layui-form-item">
            <label class="layui-form-label">姓名：</label>
            <div class="layui-input-block">
                <input type="text" name="name" value="${employee.name}" required lay-verify="required" placeholder="请输入姓名" class="layui-input">
            </div>
        </div>

        <!-- 密码 -->
        <div class="layui-form-item">
            <label class="layui-form-label">密码：</label>
            <div class="layui-input-block">
                <input type="password" name="password" value="${employee.password}" required lay-verify="required" placeholder="请输入密码" class="layui-input">
            </div>
        </div>

        <!-- 部门 -->
        <div class="layui-form-item">
            <label class="layui-form-label">部门：</label>
            <div class="layui-input-block">
                <input type="text" name="dep" value="${employee.dep}" required lay-verify="required" placeholder="请输入部门" class="layui-input">
            </div>
        </div>

        <!-- 职位 -->
        <div class="layui-form-item">
            <label class="layui-form-label">职位：</label>
            <div class="layui-input-block">
                <input type="text" name="job" value="${employee.job}" required lay-verify="required" placeholder="请输入职位" class="layui-input">
            </div>
        </div>

        <!-- 提交和重置按钮 -->
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button type="submit" class="layui-btn">保存修改</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>

<script src="layui/layui.js"></script>
</body>
</html>
