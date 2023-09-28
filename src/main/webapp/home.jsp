<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mr Hieu
  Date: 28/09/2023
  Time: 3:21 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Wellcome</h1>
<ul>
    <li><a href="<c:url value="/BookServlet" />">List all books</a></li>
    <li><a href="<c:url value="/BookServlet?action=add"/>">Insert books</a></li>
    <li> <a href="<c:url value="/LoginServlet"/>">Log out</a></li>
</ul>
</body>
</html>
