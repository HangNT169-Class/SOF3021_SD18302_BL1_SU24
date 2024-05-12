<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
</head>
<body>
<form:form action="/dang-ky-thanh-cong" method="post" modelAttribute="dangKyRequest">
    Họ và tên:
    <form:input path="hoVaTen" />
    <form:errors path="hoVaTen" /> <br>
    Tuổi:
    <form:input path="tuoi" />
    <form:errors path="tuoi" /> <br>
    Ngành học:
    <form:input path="nganhHoc" />
    <form:errors path="nganhHoc" /> <br>
    Quê quán:
    <form:input path="queQuan" />
    <form:errors path="queQuan" /> <br>
    Mật khẩu:
    <form:input path="matKhau" />
    <form:errors path="matKhau" /> <br>
    Xác nhận mật khẩu:
    <form:input path="xacNhanMatKhau" />
    <form:errors path="xacNhanMatKhau" /> <br>

    <form:button type="submit">Đăng ký</form:button>
</form:form>

</body>
</html>