
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
  <title>Время в Нью Йорке</title>
  <link rel="stylesheet" href="../css/stylesNew.css">
</head>
<body>

<div class="fon">
  <div id = "time">
    <p><%
      Time time = new Time();
    %></p> </div>
</div>

<div id="times"><%= time.getTimeInTimezone("America/New_York")%> </div>
</body>
</html>

</body>
</html>
