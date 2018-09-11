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
    <h1>Titan Online Banking Application</h1>
    <p>Your account has been successfully created.</p>
     <table>
            <tr>
                <th>First Name:</th>
                <td>${user.firstName}</td>
            </tr>
            <tr>
                <th>Last Name:</th>
                <td>${user.lastName}</td>
            </tr>
            <tr>
                <th>Phone:</th>
                <td>${user.phone}</td>
            </tr>
            <tr>
                <th>Address:</th>
                <td>${user.address}</td>
            </tr>
            <tr>
                <th>City:</th>
                <td>${user.city}</td>
            </tr>
            <tr>
                <th>State:</th>
                <td>${user.state}</td>
            </tr>
            <tr>
                <th>Zip Code:</th>
                <td>${user.zip}</td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>${user.email}</td>
            </tr>
            <tr>
                <th>Username:</th>
                <td>${user.username}</td>
            </tr>
            <tr>
                <th>Password:</th>
                <td>${user.password}</td>
            </tr>
</table>
</body>
</html>
<c:import url="footer.jsp" />