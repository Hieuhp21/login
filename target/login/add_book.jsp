<%--
  Created by IntelliJ IDEA.
  User: Mr Hieu
  Date: 28/09/2023
  Time: 4:25 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
<div class="content" style="align-content: center; justify-content: center; display: flex">

    <form method="post" action="/BookServlet?action=create">
        <table>
            <tr>
                <td><label>Title: </label></td>
                <td><input type="text" id="title" name="title" required></td>
            </tr>
            <tr>
                <td><label>Category: </label></td>
                <td><select id="category" name="category">
                    <option value="Du lịch">Du lịch</option>
                    <option value="Nhật ký">Nhật ký</option>
                    <option value="Tản văn">Tản văn</option>
                    <option value="Thơ" selected>Thơ</option>
                </select></td>
            </tr>
            <tr>
                <td><label>Price: </label></td>
                <td><input type="text" id="price" name="price" required></td>

            </tr>

            <tr>
                <td><input type="submit" value="Insert"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
