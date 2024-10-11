<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>修改工作日志</title>
</head>
<body>
<h2>修改工作日志</h2>

<!-- 表单，展示数据并允许用户修改 -->
<form action="http://localhost:8080/System_war_exploded/userUpdateLogsServlet" method="POST">
  <label for="id">ID：</label>
  <input type="text" id="id" name="id" value="${workLogs.id}" readonly><br><br>

  <label for="logs">工作日志：</label><br>
  <textarea id="logs" name="logs" rows="5" cols="40">${workLogs.logs}</textarea><br><br>

  <button type="submit">保存修改</button>
</form>
</body>
</html>
