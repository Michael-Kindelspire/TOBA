<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Titan Online Banking Application</title>
    </head>
    <body>
         <nav>
    <b><a href="index.html">Home</a> &nbsp <a href="Login.html">Login</a></b>   
</nav>
    <h1>Please enter your information below</h1>
    <p><i>${message}</i></p>
       <form action="NewCustomerServlet" method="post">
        <input type="hidden" name="action" value="add">        
        <label class="pad_top">First Name:</label>
        <input type="text" name="firstName"><br>
        <label class="pad_top">Last Name:</label>
        <input type="text" name="lastName"><br>
        <label class="pad_top">Phone:</label>
        <input type="text" name="Phone"><br>
        <label class="pad_top">Address:</label>
        <input type="text" name="Address"><br>
        <label class="pad_top">City:</label>
        <input type="text" name="City"><br>
        <label class="pad_top">State:</label>
        <input type="text" name="State"><br>
        <label class="pad_top">Zip code:</label>
        <input type="text" name="zipCode"><br>
        <label class="pad_top">Email:</label>
        <input type="email" name="email"><br>
        <label>&nbsp;</label>
        <input type="submit" value="Submit" class="margin_left">
    </form>
    </body>
</html>
