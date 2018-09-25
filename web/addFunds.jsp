<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Titan Online Banking Application</title>
    </head>
    <body>
         <nav>
    <b><a href="index.jsp">Home</a> &nbsp <a href="Login.html">Login</a></b>   
</nav>
    <body>
        <h1>Add Funds</h1>
        
        <p><b>Balance:</b> ${user.getBalance} </p>
        
        <form action="AccountServlet" method="post">
            <label>Amount:</label><input type="text" name="Amount">
            <input type="submit" value="Submit">
        </form>
        
    </body>
</html>
<c:import url="/footer.jsp" />