<%--
  Created by IntelliJ IDEA.
  User: Stephen Yin
  Date: 2024/10/10
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--  <meta charset="UTF-8">--%>
<%--  <title>员工信息列表</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>员工信息列表</h1>--%>
<%--<table border="1">--%>
<%--  <tr>--%>
<%--    <th>id</th>--%>
<%--    <th>姓名</th>--%>
<%--    <th>工号</th>--%>
<%--    <th>密码</th>--%>
<%--    <th>部门</th>--%>
<%--    <th>职位</th>--%>
<%--  </tr>--%>
<%--  <c:forEach var="employee" items="${employeeList}">--%>
<%--    <tr>--%>
<%--      <td>${employee.id}</td>--%>
<%--      <td>${employee.name}</td>              <!-- 这里是单个员工对象 -->--%>
<%--      <td>${employee.employee_id}</td>--%>
<%--      <td>${employee.password}</td>--%>
<%--      <td>${employee.dep}</td>--%>
<%--      <td>${employee.job}</td>--%>
<%--    </tr>--%>
<%--  </c:forEach>--%>
<%--</table>--%>
<%--</body>--%>
<%--</html>--%>


<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html lang="zh-CN">--%>
<%--<head>--%>
<%--  <meta charset="UTF-8">--%>
<%--  <title>员工信息列表</title>--%>
<%--  <link rel="stylesheet" href="layui/css/layui.css">--%>
<%--</head>--%>
<%--<body>--%>

<%--<div class="layui-container">--%>
<%--  <h1 class="layui-bg-black" style="padding: 10px; color: white;">员工信息列表</h1>--%>

<%--  <!-- 添加员工按钮 -->--%>
<%--  <button class="layui-btn layui-btn-normal" style="margin-bottom: 10px;" onclick="addEmployee()">添加员工</button>--%>

<%--  <!-- 员工信息表格 -->--%>
<%--  <table class="layui-table">--%>
<%--    <thead>--%>
<%--    <tr>--%>
<%--      <th>id</th>--%>
<%--      <th>姓名</th>--%>
<%--      <th>工号</th>--%>
<%--      <th>密码</th>--%>
<%--      <th>部门</th>--%>
<%--      <th>职位</th>--%>
<%--    </tr>--%>
<%--    </thead>--%>
<%--    <tbody>--%>
<%--    <c:forEach var="employee" items="${employeeList}">--%>
<%--      <tr>--%>
<%--        <td>${employee.id}</td>--%>
<%--        <td>${employee.name}</td>--%>
<%--        <td>${employee.employee_id}</td>--%>
<%--        <td>${employee.password}</td>--%>
<%--        <td>${employee.dep}</td>--%>
<%--        <td>${employee.job}</td>--%>
<%--      </tr>--%>
<%--    </c:forEach>--%>
<%--    </tbody>--%>
<%--  </table>--%>
<%--</div>--%>

<%--<script src="layui/layui.js"></script>--%>
<%--<script>--%>
<%--  // 监听添加员工按钮点击事件--%>
<%--  function addEmployee() {--%>
<%--    layer.open({--%>
<%--      type: 1,--%>
<%--      title: '添加员工',--%>
<%--      area: ['500px', '300px'],--%>
<%--      content: `--%>
<%--        <div style="padding: 20px;">--%>
<%--          <form class="layui-form" action="/addEmployee" method="post">--%>
<%--            <div class="layui-form-item">--%>
<%--              <label class="layui-form-label">姓名</label>--%>
<%--              <div class="layui-input-block">--%>
<%--                <input type="text" name="name" required lay-verify="required" placeholder="请输入姓名" class="layui-input">--%>
<%--              </div>--%>
<%--            </div>--%>
<%--            <div class="layui-form-item">--%>
<%--              <label class="layui-form-label">工号</label>--%>
<%--              <div class="layui-input-block">--%>
<%--                <input type="text" name="employee_id" required lay-verify="required" placeholder="请输入工号" class="layui-input">--%>
<%--              </div>--%>
<%--            </div>--%>
<%--            <div class="layui-form-item">--%>
<%--              <label class="layui-form-label">密码</label>--%>
<%--              <div class="layui-input-block">--%>
<%--                <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" class="layui-input">--%>
<%--              </div>--%>
<%--            </div>--%>
<%--            <div class="layui-form-item">--%>
<%--              <label class="layui-form-label">部门</label>--%>
<%--              <div class="layui-input-block">--%>
<%--                <input type="text" name="dep" required lay-verify="required" placeholder="请输入部门" class="layui-input">--%>
<%--              </div>--%>
<%--            </div>--%>
<%--            <div class="layui-form-item">--%>
<%--              <label class="layui-form-label">职位</label>--%>
<%--              <div class="layui-input-block">--%>
<%--                <input type="text" name="job" required lay-verify="required" placeholder="请输入职位" class="layui-input">--%>
<%--              </div>--%>
<%--            </div>--%>
<%--            <div class="layui-form-item">--%>
<%--              <div class="layui-input-block">--%>
<%--                <button type="submit" class="layui-btn">提交</button>--%>
<%--                <button type="reset" class="layui-btn layui-btn-primary">重置</button>--%>
<%--              </div>--%>
<%--            </div>--%>
<%--          </form>--%>
<%--        </div>--%>
<%--      `--%>
<%--    });--%>
<%--  }--%>
<%--</script>--%>
<%--</body>--%>
<%--</html>--%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>员工信息列表</title>
    <link rel="stylesheet" href="layui/css/layui.css">
</head>
<body>

<div class="layui-container">
    <h1 class="layui-bg-black" style="padding: 10px; color: white;">员工信息列表</h1>

    <!-- 添加员工按钮 -->
    <button class="layui-btn layui-btn-normal" style="margin-bottom: 10px;" onclick="addEmployee()">添加员工</button>

    <!-- 员工信息表格 -->
    <table class="layui-table">
        <thead>
        <tr>
            <th>id</th>
            <th>姓名</th>
            <th>工号</th>
            <th>密码</th>
            <th>部门</th>
            <th>职位</th>
            <th>操作</th> <!-- 操作列 -->
        </tr>
        </thead>
        <tbody id="employeeTableBody">
        <c:forEach var="employee" items="${employeeList}">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.employee_id}</td>
                <td>${employee.password}</td>
                <td>${employee.dep}</td>
                <td>${employee.job}</td>
                <td>
                    <button class="layui-btn layui-btn-normal layui-btn-xs" onclick="editEmployee('${employee.id}')">
                        编辑
                    </button>
                    <button class="layui-btn layui-btn-danger layui-btn-xs" onclick="deleteEmployee('${employee.id}')">
                        删除
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <!-- 分页容器 -->
    <div id="pagination"></div>
</div>

<script src="layui/layui.js"></script>
<script>
    layui.use(['laypage', 'layer'], function () {
        var laypage = layui.laypage;
        var layer = layui.layer;

        // 执行一个分页实例
        laypage.render({
            elem: 'pagination', // 分页容器的ID
            count: ${total}, // 数据总数从后端传递过来
            limit: ${pageSize}, // 每页显示的数量
            curr: ${currentPage}, // 当前页
            layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip'],
            jump: function (obj, first) {
                if (!first) { //首次不执行
                    // 请求指定页的数据
                    window.location.href = `/employeeList?pageNum=${obj.curr}&pageSize=${obj.limit}`;
                }
            }
        });
    });

    // 添加员工按钮的弹窗
    function addEmployee() {
        layer.open({
            type: 1,
            title: '添加员工',
            area: ['500px', '400px'], // 调整高度
            content: `
      <div style="padding: 20px;">
        <form class="layui-form" action="http://localhost:8080/System_war_exploded/employeeServlet" method="post">
           <input type="hidden" name="action" value="add">
            <div class="layui-form-item">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-block">
              <input type="text" name="name" required lay-verify="required" placeholder="请输入姓名" class="layui-input">
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label">工号</label>
            <div class="layui-input-block">
              <input type="text" name="employee_id" required lay-verify="required" placeholder="请输入工号" class="layui-input" >
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label">密码</label>
            <div class="layui-input-block">
              <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" class="layui-input" >
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label">部门</label>
            <div class="layui-input-block">
              <input type="text" name="dep" required lay-verify="required" placeholder="请输入部门" class="layui-input">
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label">职位</label>
            <div class="layui-input-block">
              <input type="text" name="job" required lay-verify="required" placeholder="请输入职位" class="layui-input">
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

    // 编辑员工功能
    function editEmployee(employeeId) {
        // 这里可以通过 AJAX 请求获取员工信息，并填充到表单中
        console.log("Editing employee with ID: ", employeeId);
        layer.open({
            type: 1,
            title: '编辑员工',
            area: ['500px', '400px'],
            content: `
      <div style="padding: 20px;">
        <form class="layui-form" action="http://localhost:8080/System_war_exploded/employeeServlet?id=${adminId}" method="post">
            <input type="hidden" name="action" value="update">
          <%--<input type="hidden" name="id" value="${employeeId}"> <!-- 添加员工ID -->--%>
          <div class="layui-form-item">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-block">
              <input type="text" name="name" required lay-verify="required" placeholder="请输入姓名" class="layui-input">
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label">工号</label>
            <div class="layui-input-block">
              <input type="text" name="employee_id" required lay-verify="required" placeholder="请输入工号" class="layui-input">
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label">密码</label>
            <div class="layui-input-block">
              <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" class="layui-input">
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label">部门</label>
            <div class="layui-input-block">
              <input type="text" name="dep" required lay-verify="required" placeholder="请输入部门" class="layui-input">
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label">职位</label>
            <div class="layui-input-block">
              <input type="text" name="job" required lay-verify="required" placeholder="请输入职位" class="layui-input">
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

    <%--// 删除员工功能--%>
    <%--function deleteEmployee(employeeId) {--%>
    <%--    layer.confirm('确定要删除该员工吗？', {--%>
    <%--        btn: ['确定', '取消'] //按钮--%>
    <%--    }, function () {--%>
    <%--        // 确定删除--%>
    <%--        window.location.href = `/deleteEmployee?employee_id=${employeeId}`; // 删除请求--%>
    <%--    }, function () {--%>
    <%--        // 取消删除--%>
    <%--        layer.closeAll();--%>
    <%--    });--%>
    <%--}--%>
    function deleteEmployee(employeeId) {
        console.log("Deleting employee with ID: ", employeeId);
        layer.confirm('确定要删除该员工吗？', {
            btn: ['确定', '取消'] // 按钮
        }, function () {
            // 确定删除，使用 GET 请求
            window.location.href = `http://localhost:8080/System_war_exploded/employeeServlet?action=delete&id=`+employeeId; // 删除请求
        }, function () {
            // 取消删除
            layer.closeAll();
        });
    }




</script>
</body>
</html>
