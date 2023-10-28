<%--
  Created by IntelliJ IDEA.
  User: Dell 3500
  Date: 10/28/2023
  Time: 7:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List employee</title>
</head>
<body>
<h1>Employee Information</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Date of Birth</th>
        <th>Address</th>
        <th>Position</th>
        <th>Department</th>
    </tr>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.hoten}</td>
            <td>${employee.ngaysinh}</td>
            <td>${employee.diachi}</td>
            <td>${employee.chucvu}</td>
            <td>${employee.phong}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
