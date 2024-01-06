<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29.12.2023
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Подача заявки на вступление в клан чека паука</title>
    <link rel="stylesheet" href="bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="FormCSS.css" type="text/css">
</head>
<body>



<form class="form" method="post" action="/formcontrol">
    <H5> Заявка на вступление в клан человека паука </H5>
    <label type="" class="label-form"> Фамилия</label>
    <input type="text" class="form-control" id="FirstName" placeholder="Фамилия" name="firstName">

    <label type="text" class="label-form"> Имя</label>
    <input type="text" class="form-control" id="Name" placeholder="Имя" name="name">

    <label type="text" class="label-form">Мобильный телефон</label>
    <input type="text" class="form-control" placeholder="Мобильный телефон" name="phoneNumber">

    <label type="text" class="label-form">Адрес email:</label>
    <input type="email" class="form-control" id="inputEmail" placeholder="Введите email" name="email">
    <label type="text" class="label-form">Почему хотите стать человеком-пауком:</label>
    <textarea type="textarea" class="form-control" placeholder="Введите коментарий" name="comment"> </textarea>
    <p></p>
    <p></p>
    <button type="submit" class="btn-primary">Отправить</button>

    <% if(request.getAttribute("achtung") != null && !request.getAttribute("achtung").equals("ok")) { %>
    <p></p>
    <label type="text" class="label-form" id="dimBlock" >Заявка успешно обработана</label>
   <% } %>
    </form>
</body>
</html>