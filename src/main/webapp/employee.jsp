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
    <title>employee</title>
</head>
<body>
<h1>Add Employee</h1>
<form action="addEmployee" method="post">
    <label for="cmnd">CMND:</label>
    <input type="text" id="cmnd" name="cmnd" required><br><br>

    <label for="hoten">Họ tên:</label>
    <input type="text" id="hoten" name="hoten" required><br><br>

    <label for="ngaysinh">Ngày sinh:</label>
    <input type="date" id="ngaysinh" name="ngaysinh" required><br><br>

    <label for="diachi">Địa chỉ:</label>
    <input type="text" id="diachi" name="diachi" required><br><br>

    <label for="chucvu">Chức vụ:</label>
    <input type="text" id="chucvu" name="chucvu" required><br><br>

    <label for="phong">Phòng:</label>
    <input type="text" id="phong" name="phong" required><br><br>

    <input type="submit" value="Gửi">
    <input type="reset" value="Đặt lại">
</form>
</body>
</html>
