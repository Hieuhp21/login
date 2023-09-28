<%--
  Created by IntelliJ IDEA.
  User: Mr Hieu
  Date: 28/09/2023
  Time: 4:18 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
<div class="content" >
    <h2 style="text-align: center">List all books</h2>
    <div class="tbl-employee" style="display: flex; justify-content: center; align-content: center">
        <table border="1">
            <tr>
                <th>Book Id</th>
                <th>Title</th>
                <th>Category</th>
                <th>Price</th>
                <th>Delete</th>
            </tr>
            <c:forEach var="b" items="${books}">
                <tr>
                    <td>${b.id}</td>
                    <td>${b.title}</td>
                    <td>${b.category}</td>
                    <td>${b.price}</td>
                    <td><a href="<c:url value="/BookServlet?action=delete&id=${b.id}"/>">delete</a></td>
                </tr>
            </c:forEach>
        </table>

    </div>
    <div style="text-align: center">
        <a href="<c:url value="/BookServlet?action=add"/>">Add New</a>
    </div>
</div>

</body>
</html>
