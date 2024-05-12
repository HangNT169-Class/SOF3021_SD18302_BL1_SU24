<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<form action="/dang-ky-thanh-cong" method="post">
    Họ và tên: ${hoVaTen}<br>
    Tuổi: ${tuoi}<br>
    Ngành học: ${nganhHoc}<br>
    Quê quán: ${queQuan}<br>
    Mật khẩu: ${matKhau}<br>
    Xác nhận mật khẩu: ${xacNhanMatKhau}<br>

    Đăng ký thành công
</form>

</body>
</html>