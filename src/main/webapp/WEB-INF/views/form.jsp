<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: griegoriens
  Date: 17.02.2023
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Add new weather to WeatherMap</title>
</head>
<body>
<form:form method="POST" action="/form-confirmation" modelAttribute="donation">
    <div>
        Liczba worków 60l: <form:input path="quantity"/>
    </div>
    <div>
        Ulica: <form:input path="street"/>
    </div>
    <div>
        Miasto: <form:input path="city"/>
    </div>
    <div>
        Kod pocztowy: <form:input path="zipCode"/>
    </div>
    <div>
        Data: <form:input path="pickUpDate"/>
    </div>
    <div>
        Godzina: <form:input path="pickUpTime"/>
    </div>
    <div>
        Komentarz dla kuriera: <form:input path="pickUpComment"/>
    </div>
    <div>
        No tel: <form:input path="telNo"/>
    </div>
    <div>
        Fundacja: <form:select path="institution" items="${institutions}" itemLabel="name" itemValue="id"/>
    </div>
    <div>
        Kategoria: <form:checkboxes path="categories" items="${categoriesToShow}"
    itemLabel="name" itemValue="id"/>
    </div>
    <div>
        <form:button type="submit">Dodaj darowiznę</form:button>
    </div>
</form:form>
</body>
</html>

