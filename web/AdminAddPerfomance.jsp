<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>添加绩效</title>
</head>
<body>
<h2>添加绩效</h2>

<!-- 表单，展示数据并允许用户修改 -->
<form action="http://localhost:8080/System_war_exploded/adminAddPerfoServlet" method="POST">

    <label for="employee_id">员工工号：</label>
    <input type="text" id="employee_id" name="employee_id"><br><br>

    <label for="work">工作任务（请勿超过200字）：</label><br>
    <textarea id="work" name="work" rows="5" cols="40"></textarea><br><br>

    <label for="score">评分：</label>
    <input type="text" id="score" name="score"><br><br>

    <label for="appraise">留言（请勿超过200字）：</label><br>
    <textarea id="appraise" name="appraise" rows="5" cols="40"></textarea><br><br>

    <button type="submit">保存</button>
</form>
</body>
</html>