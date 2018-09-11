<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
<html>
<head>
    <meta charset="utf-8">
    <title>Titan Online Banking Application</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    <nav>
    <b><a href="index.jsp">Home</a> &nbsp <a href="Login.html">Login</a></b>   
</nav>
    <h1>Account Activity</h1>
    
    <c:if test="${empty user.username}">
    You are not logged in
</c:if>
    <c:if test="${not empty user.username}">
        Welcome to your account activity page ${user.firstName} ${user.lastName}
        <br>This is for testing resetpassword #1${message} #2${message2}&nbsp${user.password}
</c:if>
</body>
</html>
<c:import url="footer.jsp" />