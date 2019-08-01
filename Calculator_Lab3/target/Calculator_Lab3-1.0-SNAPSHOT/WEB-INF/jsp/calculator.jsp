<%--
  Created by IntelliJ IDEA.
  User: nege
  Date: 7/22/19
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> Calculator: </h3>
<c:if test="${errors != null}">

    <p id="errors">
        Error(s)!
    <ul>
        <c:forEach var="error" items="${errors}">
            <li>${error}</li>
        </c:forEach>
    </ul>


</c:if>
<form action="calculate" method="post">
    <pre>

    <label for="number1">Number1:</label>
        <input type="text" name="number1" value="${form.number1}">
    <label for="number2">Number2:</label>
        <input type="text" name="number2" value="${form.number2}">
    <label for="operation">Operator:</label>
         <input type="text" name="operation" value="${form.operation}">

    <input type="submit" value="Calculate">
    </pre>
</form>

</body>
</html>
