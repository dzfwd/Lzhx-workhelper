<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/11 0011
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>简历填写</title>
</head>
<body>
<form action="" method="post" name="resumeForm">姓名<input type="text" name="userName">
性别<input type="radio" name="sex" value="male">男<input type="radio" name="sex" value="female">女
    出生年月<input type="date" name="birthdate">
    电话号码<input type="text" name="phone">
    教育程度（学历）<input type="radio" name="Education" value="highschool">高中 <input type="radio" name="Education" value="college">大学 <input type="radio" name="Education" value="college">硕士
    毕业院校<input type="text" name="graduated">
    毕业时间<input type="date" name="Gtime">
    民族<input type="text" name="Nation">
    身份证号码<input type="text" name="IDcardNo">
    籍贯<input type="text" name="nativeplace">
    现住址<input type="text" name="address">
    微信orQQ<input type="text" name="wechatorqq">
    期望薪资<input type="number" name="salary">
    自我介绍<textarea name="Introduce"></textarea>
    <input type="submit" value="提交">
</form>
</body>
</html>
