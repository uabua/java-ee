<%--
  Created by IntelliJ IDEA.
  User: mariami
  Date: 25.03.20
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
შინაური ცხოველების სარეგისტრაციო ფორმა
<form action="registration" method="post">
    <table>
    <tr>
        <td>სახელი</td>
        <td><input name="name"/></td>
    </tr>
    <tr>
        <td>ჯიში</td>
        <td><input name="breed"/></td>
    </tr>
    <tr>
        <td>სქესი</td>
        <td><input name="gender"/></td>
    </tr>
    <tr>
        <td>ასაკი</td>
        <td><input name="age"/></td>
    </tr>
    </table>
    <input type="submit"/>
</form>
</body>
</html>
