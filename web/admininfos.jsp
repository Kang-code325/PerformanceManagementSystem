<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--  <meta charset="UTF-8">--%>
<%--  <title>管理员信息</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>管理员信息列表</h1>--%>
<%--<table border="1">--%>
<%--  <tr>--%>
<%--    <th>id</th>--%>
<%--    <th>工号</th>--%>
<%--    <th>姓名</th>--%>
<%--    <th>密码</th>--%>
<%--  </tr>--%>
<%--  <c:forEach var="personnelSpecialist" items="${adminList}">--%>
<%--    <tr>--%>
<%--        <td>${personnelSpecialist.id}</td>--%>
<%--        <td>${personnelSpecialist.specialist_id}</td>--%>
<%--      <td>${personnelSpecialist.name}</td>--%>
<%--        <td>${personnelSpecialist.password}</td>--%>
<%--    </tr>--%>
<%--  </c:forEach>--%>
<%--</table>--%>
<%--</body>--%>
<%--</html>--%>


<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--  <meta charset="UTF-8">--%>
<%--  <title>管理员信息</title>--%>
<%--  <link rel="stylesheet" href="layui/css/layui.css"/> <!-- 引入 layui CSS -->--%>
<%--  <script src="js/jquery-3.4.1.js"></script>--%>
<%--  <script src="layui/layui.js"></script>--%>
<%--  <style>--%>
<%--    /* 自定义样式 */--%>
<%--    body {--%>
<%--      padding: 20px;--%>
<%--    }--%>
<%--  </style>--%>
<%--</head>--%>
<%--<body>--%>

<%--<h1>管理员信息列表</h1>--%>

<%--<!-- 添加管理员按钮 -->--%>
<%--<button class="layui-btn" id="addAdminBtn">添加管理员</button>--%>

<%--<table class="layui-table" border="1">--%>
<%--  <thead>--%>
<%--  <tr>--%>
<%--    <th>id</th>--%>
<%--    <th>工号</th>--%>
<%--    <th>姓名</th>--%>
<%--    <th>密码</th>--%>
<%--  </tr>--%>
<%--  </thead>--%>
<%--  <tbody>--%>
<%--  <c:forEach var="personnelSpecialist" items="${adminList}">--%>
<%--    <tr>--%>
<%--      <td>${personnelSpecialist.id}</td>--%>
<%--      <td>${personnelSpecialist.specialist_id}</td>--%>
<%--      <td>${personnelSpecialist.name}</td>--%>
<%--      <td>${personnelSpecialist.password}</td>--%>
<%--    </tr>--%>
<%--  </c:forEach>--%>
<%--  </tbody>--%>
<%--</table>--%>

<%--<script>--%>
<%--  $(document).ready(function() {--%>
<%--    // 点击添加管理员按钮的事件处理--%>
<%--    $("#addAdminBtn").on("click", function() {--%>
<%--      layer.prompt({--%>
<%--        title: '请输入新管理员信息',--%>
<%--        formType: 2 // 输入框类型--%>
<%--      }, function(value, index, elem) {--%>
<%--        // 处理输入的值，例如进行 AJAX 请求添加管理员--%>
<%--        layer.msg('添加管理员：' + value);--%>
<%--        layer.close(index);--%>
<%--      });--%>
<%--    });--%>
<%--  });--%>
<%--</script>--%>

<%--</body>--%>
<%--</html>--%>






<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html lang="zh-CN">--%>
<%--<head>--%>
<%--  <meta charset="UTF-8">--%>
<%--  <title>管理员信息列表</title>--%>
<%--  <link rel="stylesheet" href="layui/css/layui.css"> <!-- 引入layui CSS -->--%>
<%--</head>--%>
<%--<body>--%>

<%--<div class="layui-container">--%>
<%--  <h1 class="layui-bg-black" style="padding: 10px; color: white;">管理员信息列表</h1>--%>

<%--  <!-- 添加管理员按钮 -->--%>
<%--  <button class="layui-btn layui-btn-normal" style="margin-bottom: 10px;" onclick="addAdmin()">添加管理员</button>--%>

<%--  <!-- 员工信息表格 -->--%>
<%--  <table class="layui-table">--%>
<%--    <thead>--%>
<%--    <tr>--%>
<%--      <th>id</th>--%>
<%--      <th>工号</th>--%>
<%--      <th>姓名</th>--%>
<%--      <th>密码</th>--%>
<%--    </tr>--%>
<%--    </thead>--%>
<%--    <tbody id="employeeTableBody">--%>
<%--    <c:forEach var="personnelSpecialist" items="${adminList}">--%>
<%--      <tr>--%>
<%--        <td>${personnelSpecialist.id}</td>--%>
<%--        <td>${personnelSpecialist.specialist_id}</td>--%>
<%--        <td>${personnelSpecialist.name}</td>--%>
<%--        <td>${personnelSpecialist.password}</td>--%>
<%--      </tr>--%>
<%--    </c:forEach>--%>
<%--    </tbody>--%>
<%--  </table>--%>

<%--  <!-- 分页容器 -->--%>
<%--  <div id="pagination"></div>--%>
<%--</div>--%>

<%--<script src="layui/layui.js"></script>--%>
<%--<script>--%>
<%--  layui.use(['laypage', 'layer'], function(){--%>
<%--    var laypage = layui.laypage;--%>
<%--    var layer = layui.layer;--%>

<%--    // 执行一个分页实例--%>
<%--    laypage.render({--%>
<%--      elem: 'pagination', // 分页容器的ID--%>
<%--      count: ${total}, // 数据总数从后端传递过来--%>
<%--      limit: ${pageSize}, // 每页显示的数量--%>
<%--      curr: ${currentPage}, // 当前页--%>
<%--      layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip'],--%>
<%--      jump: function(obj, first){--%>
<%--        if(!first){ //首次不执行--%>
<%--          // 请求指定页的数据--%>
<%--          window.location.href = `/adminList?pageNum=${obj.curr}&pageSize=${obj.limit}`;--%>
<%--        }--%>
<%--      }--%>
<%--    });--%>
<%--  });--%>

<%--  // 添加管理员按钮的弹窗--%>
<%--  function addAdmin() {--%>
<%--    layer.open({--%>
<%--      type: 1,--%>
<%--      title: '添加管理员',--%>
<%--      area: ['500px', '300px'],--%>
<%--      content: `--%>
<%--        <div style="padding: 20px;">--%>
<%--          <form class="layui-form" action="/addAdmin" method="post">--%>
<%--            <div class="layui-form-item">--%>
<%--              <label class="layui-form-label">工号</label>--%>
<%--              <div class="layui-input-block">--%>
<%--                <input type="text" name="specialist_id" required lay-verify="required" placeholder="请输入工号" class="layui-input">--%>
<%--              </div>--%>
<%--            </div>--%>
<%--            <div class="layui-form-item">--%>
<%--              <label class="layui-form-label">姓名</label>--%>
<%--              <div class="layui-input-block">--%>
<%--                <input type="text" name="name" required lay-verify="required" placeholder="请输入姓名" class="layui-input">--%>
<%--              </div>--%>
<%--            </div>--%>
<%--            <div class="layui-form-item">--%>
<%--              <label class="layui-form-label">密码</label>--%>
<%--              <div class="layui-input-block">--%>
<%--                <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" class="layui-input">--%>
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











<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="UTF-8">
  <title>管理员信息列表</title>
  <link rel="stylesheet" href="layui/css/layui.css"> <!-- 引入layui CSS -->
</head>
<body>

<div class="layui-container">
  <h1 class="layui-bg-black" style="padding: 10px; color: white;">管理员信息列表</h1>

  <!-- 添加管理员按钮 -->
  <button class="layui-btn layui-btn-normal" style="margin-bottom: 10px;" onclick="addAdmin()">添加管理员</button>

  <!-- 管理员信息表格 -->
  <table class="layui-table">
    <thead>
    <tr>
      <th>id</th>
      <th>工号</th>
      <th>姓名</th>
      <th>密码</th>
      <th>操作</th> <!-- 添加操作列 -->
    </tr>
    </thead>
    <tbody id="adminTableBody">
    <c:forEach var="personnelSpecialist" items="${adminList}">
      <tr>
        <td>${personnelSpecialist.id}</td>
        <td>${personnelSpecialist.specialist_id}</td>
        <td>${personnelSpecialist.name}</td>
        <td>${personnelSpecialist.password}</td>
        <td>
          <!-- 添加编辑和删除按钮 -->
          <button class="layui-btn layui-btn-normal layui-btn-xs" onclick="editAdmin('${personnelSpecialist.id}')">编辑</button>
          <button class="layui-btn layui-btn-danger layui-btn-xs" onclick="deleteAdmin('${personnelSpecialist.id}')">删除</button>
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
  layui.use(['laypage', 'layer'], function(){
    var laypage = layui.laypage;
    var layer = layui.layer;

    // 执行一个分页实例
    laypage.render({
      elem: 'pagination', // 分页容器的ID
      count: ${total}, // 数据总数从后端传递过来
      limit: ${pageSize}, // 每页显示的数量
      curr: ${currentPage}, // 当前页
      layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip'],
      jump: function(obj, first){
        if(!first){ //首次不执行
          // 请求指定页的数据
          window.location.href = `/adminList?pageNum=${obj.curr}&pageSize=${obj.limit}`;
        }
      }
    });
  });

  // 添加管理员按钮的弹窗
  function addAdmin() {
    layer.open({
      type: 1,
      title: '添加管理员',
      area: ['500px', '300px'],
      content: `
        <div style="padding: 20px;">
          <form class="layui-form" action="http://localhost:8080/System_war_exploded/personnelSpecialistServlet" method="post">
            <input type="hidden" name="action" value="add">
            <div class="layui-form-item">
              <label class="layui-form-label">工号</label>
              <div class="layui-input-block">
                <input type="text" name="specialist_id" required lay-verify="required" placeholder="请输入工号" class="layui-input">
              </div>
            </div>
            <div class="layui-form-item">
              <label class="layui-form-label">姓名</label>
              <div class="layui-input-block">
                <input type="text" name="name" required lay-verify="required" placeholder="请输入姓名" class="layui-input">
              </div>
            </div>
            <div class="layui-form-item">
              <label class="layui-form-label">密码</label>
              <div class="layui-input-block">
                <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" class="layui-input">
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

  // 编辑管理员功能
  function editAdmin(adminId) {
    layer.open({
      type: 1,
      title: '编辑管理员',
      area: ['500px', '400px'],
      content: `
      <div style="padding: 20px;">
        <form class="layui-form" action="http://localhost:8080/System_war_exploded/adminServlet" method="post">
            <input type="hidden" name="action" value="update">
            <input type="hidden" name="id" value="${adminId}"> <!-- 管理员ID -->
          <div class="layui-form-item">
            <label class="layui-form-label">工号</label>
            <div class="layui-input-block">
              <input type="text" name="specialist_id" required lay-verify="required" placeholder="请输入工号" class="layui-input">
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-block">
              <input type="text" name="name" required lay-verify="required" placeholder="请输入姓名" class="layui-input">
            </div>
          </div>
          <div class="layui-form-item">
            <label class="layui-form-label">密码</label>
            <div class="layui-input-block">
              <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" class="layui-input">
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

  // 删除管理员功能
  function deleteAdmin(adminId) {
    layer.confirm('确定要删除该管理员吗？', {
      btn: ['确定', '取消'] // 按钮
    }, function () {
      // 确定删除，使用 GET 请求
      window.location.href = `http://localhost:8080/System_war_exploded/personnelSpecialistServlet?action=delete&id=` + adminId;
    }, function () {
      // 取消删除
      layer.closeAll();
    });
  }
</script>
</body>
</html>
