<%--
  Created by IntelliJ IDEA.
  User: mariami
  Date: 30.03.20
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="userservlet" method="post">
    <table>
    <tr>
        <td>Name</td>
        <td><input name="name"/></td>
    </tr>
    <tr>
        <td>Surname</td>
        <td><input name="surname"/></td>
    </tr>
    </table>
    <input type="submit"/>
</form>
</body>
</html>
