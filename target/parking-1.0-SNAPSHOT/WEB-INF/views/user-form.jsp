<%@ taglib prefix="forn" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 08.03.2020
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Save user</title>
    <link type="text/css"
    rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/css/style.css">

    <title>Save user</title>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/add-user-style.css">
<style>
    .error {color:red}
</style>


</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2><a href="${pageContext.request.contextPath}/user/list">
            <img src="${pageContext.request.contextPath}/resources/images/home.png" alt="Back to list" height="30" width="30"/></a>Parking manager</h2>
    </div>
</div>
<div id="container">
    <h3> Save user </h3>
    <form:form action="saveUser" modelAttribute="user" method="POST">

        <form:hidden path="id"/>

        <table>
            <tbody>
            <tr>
                <td><label>First name:</label></td>
                <td><form:input path="firstName"/>
                    <form:errors path="firstName" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <td><label>Last name:</label></td>
                <td><form:input path="lastName"/>
                    <form:errors path="lastName" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <td><label>Phone number:</label></td>
                <td><form:input path="phone"/>
                    <form:errors path="phone" cssClass="error"/>
                </td>

            </tr>
            <tr>
                <td><label>Car:</label></td>
                <td><form:input path="car"/>
                    <form:errors path="car" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <td><label>Car number:</label></td>
                <td><form:input path="carNumber"/>
                    <form:errors path="carNumber" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <td><label>Car location:</label></td>
                <td><form:select path="location">
                    <form:option value="Alekseevskaya" label="Alekseevskaya"/>
                    <form:option value="Arbat" label="Arbat"/>
                    <form:option value="Butovo" label="Butovo"/>
                    <form:option value="Fili" label="Fili"/>
                    <form:option value="Kuntsevo" label="Kuntsevo"/>
                    <form:option value="Lefortovo" label="Lefortovo"/>
                    <form:option value="Otradnoe" label="Otradnoe"/>
                    <form:option value="Perovo" label="Perovo"/>
                    <form:option value="Taganskaya" label="Taganskaya"/>
                    <form:option value="Tverskaya" label="Tverskaya"/>
                    <form:option value="Yakimanka" label="Yakimanka"/>
                </form:select>
                </td>
            </tr>
            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Save" class="save"></td>
            </tr>
            </tbody>
        </table>
    </form:form>

    <div style="clear; both;"></div>
<p>
    <br><br>
    <a href="${pageContext.request.contextPath}/user/list">Home</a>
    <br><br>
    <a href="https://github.com/lvkheen/parkingmanager"> Source code </a>
</p>
</div>


</body>
</html>
