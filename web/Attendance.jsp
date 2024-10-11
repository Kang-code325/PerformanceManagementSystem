<%--
  Created by IntelliJ IDEA.
  User: Stephen Yin
  Date: 2024/10/11
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>打卡记录</title>
    <!-- 引入layui CSS -->
    <link rel="stylesheet" href="layui/css/layui.css" media="all">
</head>
<body>

<div class="layui-container">
    <!-- 添加打卡记录按钮 -->
    <div style="text-align: center; margin-bottom: 20px;">
        <button class="layui-btn layui-btn-normal" onclick="addRecord()">添加打卡记录</button>
    </div>

    <!-- 打卡记录表格 -->
    <table class="layui-table" lay-skin="row" lay-size="lg" align="center" width="88%">
        <thead>
        <tr>
            <th><input type="checkbox" class="layui-checkbox" lay-skin="primary" onclick="checkAll(this)"></th>
            <th>pid</th>
            <th>日期</th>
            <th>时间</th>
            <th>假条</th>
            <th>状态</th>
            <th>操作</th> <!-- 添加操作列 -->
        </tr>
        </thead>
        <tbody>
        <form method="post">
            <c:forEach items="${attendanceList}" var="p">
                <tr>
                    <td width='5%'>
                        <input type="checkbox" name="pid" value="${p.id}" class="layui-checkbox" lay-skin="primary">
                    </td>
                    <td width='8%'>${p.id}</td>
                    <td>${p.date}</td>
                    <td>${p.time}</td>
                    <td>${p.leave}</td>
                    <td>${p.approval}</td>
                    <td>
                        <!-- 编辑和删除按钮 -->
                        <button class="layui-btn layui-btn-normal layui-btn-xs" onclick="editRecord('${p.id}')">编辑</button>
                        <button class="layui-btn layui-btn-danger layui-btn-xs" onclick="deleteRecord('${p.id}')">删除</button>
                    </td>
                </tr>
            </c:forEach>
        </form>
        </tbody>
    </table>
</div>

<!-- 引入layui JS -->
<script src="layui/layui.js"></script>

<script>
    layui.use(['form', 'table', 'layer'], function(){
        var form = layui.form;
        var table = layui.table;
        var layer = layui.layer;
        // 初始化layui组件
        form.render();
        table.render();
    });

    // 全选功能
    function checkAll(mainCheckbox) {
        var checkboxes = document.querySelectorAll('input[type="checkbox"]');
        checkboxes.forEach(function (checkbox) {
            checkbox.checked = mainCheckbox.checked;
        });
    }

    // 添加打卡记录功能
    function addRecord() {
        layer.open({
            type: 1,
            title: '添加打卡记录',
            area: ['500px', '400px'],
            content: `
            <div style="padding: 20px;">
                <form class="layui-form" action="http://localhost:8080/System_war_exploded/attendanceServlet" method="post">
                    <input type="hidden" name="action" value="add">
                    <div class="layui-form-item">
                        <label class="layui-form-label">日期</label>
                        <div class="layui-input-block">
                            <input type="text" name="date" required lay-verify="required" placeholder="请输入日期" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">时间</label>
                        <div class="layui-input-block">
                            <input type="text" name="time" required lay-verify="required" placeholder="请输入时间" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">假条</label>
                        <div class="layui-input-block">
                            <input type="text" name="leave" required lay-verify="required" placeholder="请输入假条信息" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">状态</label>
                        <div class="layui-input-block">
                            <input type="text" name="approval" required lay-verify="required" placeholder="请输入状态" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <div class="layui-input-block">
                            <button type="submit" class="layui-btn">提交</button>
                            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                        </div>
                    </div>
                </form>
            </div>
            `
        });
    }

    // 编辑打卡记录功能
    function editRecord(recordId) {
        layer.open({
            type: 1,
            title: '编辑打卡记录',
            area: ['500px', '400px'],
            content: `
            <div style="padding: 20px;">
                <form class="layui-form" action="http://localhost:8080/System_war_exploded/daKaServlet" method="post">
                    <input type="hidden" name="action" value="update">
                    <input type="hidden" name="id" value="${recordId}">
                    <div class="layui-form-item">
                        <label class="layui-form-label">日期</label>
                        <div class="layui-input-block">
                            <input type="text" name="date" required lay-verify="required" placeholder="请输入日期" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">时间</label>
                        <div class="layui-input-block">
                            <input type="text" name="time" required lay-verify="required" placeholder="请输入时间" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">假条</label>
                        <div class="layui-input-block">
                            <input type="text" name="leave" required lay-verify="required" placeholder="请输入假条信息" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">状态</label>
                        <div class="layui-input-block">
                            <input type="text" name="approval" required lay-verify="required" placeholder="请输入状态" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <div class="layui-input-block">
                            <button type="submit" class="layui-btn">提交</button>
                            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                        </div>
                    </div>
                </form>
            </div>
            `
        });
    }

    // 删除打卡记录功能
    function deleteRecord(recordId) {
        layer.confirm('确定要删除该记录吗？', {
            btn: ['确定', '取消'] // 按钮
        }, function () {
            // 确定删除，使用 GET 请求
            window.location.href = `http://localhost:8080/System_war_exploded/attendanceServlet?action=delete&id=` + recordId;
        }, function () {
            // 取消删除
            layer.closeAll();
        });
    }
</script>

</body>
</html>
