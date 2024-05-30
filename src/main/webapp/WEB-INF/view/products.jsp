<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>id</td>
        <td>code</td>
        <td>name</td>
        <td>gia</td>
        <td>cate code</td>
        <td>cate name</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="a">
        <tr>
            <td>${a.id}</td>
            <td>${a.productName}</td>
            <td>${a.productCode}</td>
            <td>${a.price}</td>
            <td>${a.cate.categoryCode1}</td>
            <td>${a.cate.categoryName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>