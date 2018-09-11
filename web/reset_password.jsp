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
    <body>
        <form action="resetPassServlet" method="post">
        <input type="hidden" name="action" value="add">  
        <label class="pad_top">Current Password:</label>
        <label class="pad_top">${user.password}</label>
        <label>&nbsp;</label><br>
        <label class="pad_top">New Password:</label>
        <input type="text" name="newPass"><br>
        <label>&nbsp;</label>
        <input type="submit" value="Submit" class="margin_left">
    </form>
    </body>
</html>
<c:import url="footer.jsp" />
