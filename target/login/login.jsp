<%--
  Created by IntelliJ IDEA.
  User: Mr Hieu
  Date: 28/09/2023
  Time: 3:18 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form method="post" action="LoginServlet">
    <table>
        <tr>
            <td colspan="2"><h1>LOGIN FORM</h1></td>
        </tr>
        <c:if test="${errMsg != null}">
            <tr>
                <td colspan="2"><span style="color: red">${errMsg}</span></td>
            </tr>
        </c:if>

        <tr>
            <td>
                <lable>Username:</lable>
            </td>
            <td><input type="text" id="username" name="username"></td>
        </tr>
        <tr>
            <td>
                <lable>Password:</lable>
            </td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Login"></td>
        </tr>
    </table>
</form>
</body>
</html>
