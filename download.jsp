<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24.12.2023
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Скачать с сервера</title>
</head>
<body>


<form action="fileDownload"  method="post">
    <input type="file" name="fileName">
    <input type="submit" value="Download">
</form>
</body>
</html>
