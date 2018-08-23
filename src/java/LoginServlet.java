import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class LoginServlet extends HttpServlet {
    
     @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
      
            String Username = request.getParameter("Username");
            String Password = request.getParameter("Password");
            
           
            if (Username.equals("jsmith@toba.com") && Password.equals("letmein")) 
            {
                response.sendRedirect("Account_activity.html");
            } 
            else {
                response.sendRedirect("Login_failure.html");
                
            }
}
    
}
