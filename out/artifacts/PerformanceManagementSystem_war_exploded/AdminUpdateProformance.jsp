<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>修改绩效</title>
</head>
<body>
<h2>修改绩效</h2>

<!-- 表单，展示数据并允许用户修改 -->
<form action="http://localhost:8080/System_war_exploded/adminUpdatePerfoServlet" method="POST">
  <label for="id">ID：</label>
  <input type="text" id="id" name="id" value="${performance.id}" readonly><br><br>

  <label for="employee_id">员工工号：</label>
  <input type="text" id="employee_id" name="employee_id" value="${performance.employee_id}"><br><br>

  <label for="work">工作任务（请勿超过200字）：</label><br>
  <textarea id="work" name="work" rows="5" cols="40">${performance.work}</textarea><br><br>

  <label for="score">评分：</label>
  <input type="text" id="score" name="score" value="${performance.score}"><br><br>

  <label for="appraise">留言（请勿超过200字）：</label><br>
  <textarea id="appraise" name="appraise" rows="5" cols="40">${performance.appraise}</textarea><br><br>

  <button type="submit">保存修改</button>
</form>
</body>
</html>
