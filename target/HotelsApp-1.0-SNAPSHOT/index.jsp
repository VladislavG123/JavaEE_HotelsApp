<%@ page import="models.DbManager" %>
<%@ page import="models.Hotel" %><%--
  Created by IntelliJ IDEA.
  User: Vladislav
  Date: 02.09.2020
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>

<h1>Index</h1>

<h2>Hotels:</h2>

<%
    for (Hotel hotel: DbManager.getAll()) {
%>
<p><%=hotel.getName() + "-" + hotel.getLocation() + "-" + hotel.getStars()%></p>
<br />
<%
    }
%>

<hr>

<form action="add" method="post">
    <label>
        Name
        <input type="text" name="name">
    </label>
    <label>
        Location
        <input type="text" name="location">
    </label>
    <label>
        Starts
        <input type="number" name="stars">
    </label>

    <input type="submit" value="Add new hotel">
</form>

</body>
</html>
