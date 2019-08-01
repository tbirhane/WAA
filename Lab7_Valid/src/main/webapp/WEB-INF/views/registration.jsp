<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

<h1>Registration Form</h1>
<form:form modelAttribute="student" action="registration" method="post">
<fieldset><legend>Add Student</legend>
    <p>
        <form:errors path="*" cssStyle="color : red;" />
    </p>
    <p>
        <label for="firstName">First Name: </label>
        <form:input id="firstName" path="firstName"/>
    <div style="text-align: center;">
        <form:errors path="firstName" cssStyle="color : red;" />
    </div>
    </p>
    <p>
        <label for="lastName">Last Name: </label>
        <form:input id="lastName" path="lastName"/>
    <div style="text-align: center;">
        <form:errors path="lastName" cssStyle="color : red;" />
    </div>
    </p>
    <p>
        <label for="email">email: </label>
        <form:input id="email" path="email"/>
    <div style="text-align: center;">
        <form:errors path="email" cssStyle="color : red;" />
    </div>
    </p>
    <p>
        <label for="gender">Gender: </label>
        <form:input id="gender" path="gender"/>

    <div style="text-align: center;">
        <form:errors path="gender" cssStyle="color : red;" />
    </div>
    </p>
    <p>
        <label for="birthday">Birthday: </label>
        <form:input id="birthday" path="birthday"/>
    <div style="text-align: center;">
        <form:errors path="birthday" cssStyle="color : red;" />
    </div>
    </p>
    <p>
        <label for="phone">Phone: </label>
        <form:input id="phone" path="phone"/>
    <div style="text-align: center;">
        <form:errors path="phone" cssStyle="color : red;" />
    </div>
    </p>
    <input type="submit" value="Register">
</fieldset>
</form:form>
</body>
</html>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
</body>
</html>