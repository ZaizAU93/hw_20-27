<%@ page import="org.example.User" %>
<%@ page import="servlet.Time" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21.12.2023
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Время в Пекине</title>
    <link rel="stylesheet" href="../css/stylesAsia.css">
</head>
<body>

<div class="fon">
    <div id = "time">
        <p><%
            Time time = new Time();
            User user = new User("Конь", 18);
        %></p> </div>
</div>


<p>Name: <%= user.getName() %></p>
<p>Age: <%= user.getAge() %></p>
<div id="times"><%= time.getTimeInTimezone("Asia/Shanghai")%> </div>
</body>
</html>

</body>
</html>
