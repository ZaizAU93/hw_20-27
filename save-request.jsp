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

<% if(request.getAttribute("message") != null) { %>

<a href="#x" class="overlay" id="win1"></a>
<div class="popup">
   <p> ${message} </p>
    <a class="close"title="Закрыть" href="#close"></a>
</div>
<% } %>

<form class="form" method="post" action="/formcontrol">
    <H5> Заявка на вступление в клан<H5>
        <H5>человека паука </H5>
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
</form>>


<script >
    var closeBtn = document.querySelector('.close');
    closeBtn.addEventListener('click', function() {
    var popup = this.parentNode;
    popup.style.display = 'none';
    });
    </script>
</body>
</html>