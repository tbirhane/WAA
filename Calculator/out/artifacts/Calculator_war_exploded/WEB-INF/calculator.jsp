<%--
  Created by IntelliJ IDEA.
  User: nege
  Date: 7/22/19
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> Calculator </h3>
<form action="result" method="get">
    <pre>
    Addition:
    <label>Number1:</label>
    <input type="text" name="add1" value="">
    +
    <label>Number2:</label>
    <input type="text" name="add2" value="">


    Multiplication:
    <label>Number1:</label>
    <input type="text" name="mult1" value="">
    *
    <label>Number2:</label>

     <input type="text" name="mult2" value="">

    <input type="submit" value="Calculate">
    </pre>
</form>

</body>
</html>
