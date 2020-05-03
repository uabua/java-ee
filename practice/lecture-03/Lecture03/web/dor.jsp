<%--
  Created by IntelliJ IDEA.
  User: mariami
  Date: 30.03.20
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Your Age Is ${user.age} </p>
<if test="${user.age > 18 }">
    <p><i>Welcome ${user.name}</i></p>
</if>
</body>
</html>
