<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 07.03.2020
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Parking manager</title>

    <link type="text/css"
    rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2> <a href="${pageContext.request.contextPath}/user/list">
            <img src="${pageContext.request.contextPath}/resources/images/home.png" alt="Back to list" height="30" width="30"/></a>Parking manager</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <input type="button" value="Add user"
        onclick="window.location.href='showFormForAdd'; return false;"
        class="add-button"
        />

        <form:form action="search" method="get">
            Search user: <input type="text" name="searchName">
            <input type="submit" value="Search" class="add-button">
        </form:form>

        <table>
            <tr>
                <th>First name</th>
                <th>Last name</th>
                <th>Phone number</th>
                <th>Car</th>
                <th>Car number</th>
                <th>Car location</th>
                <th>Action</th>
            </tr>

            <c:forEach var="user" items="${users}">

                <c:url var="updateLink" value="/user/showFormForUpdate">
                    <c:param name="userId" value="${user.id}"/>
                </c:url>
                
                <c:url var="deleteLink" value="/user/delete">
                    <c:param name="userId" value="${user.id}"/>
                </c:url>


                <tr>
                    <td> ${user.firstName}</td>
                    <td> ${user.lastName}</td>
                    <td> ${user.phone}</td>
                    <td> ${user.car}</td>
                    <td> ${user.carNumber}</td>
                    <td> ${user.location}</td>
                    <td>
                            <a href="${updateLink}">Update</a>
                            |
                            <a href="${deleteLink}"
                            onclick="if(!(confirm('Are you sure?'))) return false">Delete</a>
                    </td>
                </tr>

            </c:forEach>
        </table>
        <br><br>
        <a href="https://github.com/lvkheen/parkingmanager"> Source code </a>
    </div>
</div>
</body>
</html>
