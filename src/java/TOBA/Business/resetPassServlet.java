package TOBA.Business;

import TOBA.Business.User;
import TOBA.data.UserDB;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class resetPassServlet extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            
            throws ServletException, IOException {
        String newPass = request.getParameter("newPass");
        //use below to confirm the servlet is getting newPass correctly
        //request.setAttribute("message", newPass);
        
        //cant figure out how to modify a portion of the user object saved in session
        
        HttpSession session = request.getSession();
        
        User user =(User)session.getAttribute("user");
        user.setPassword(newPass);
         session.setAttribute("user", user);
         UserDB.update(user);
       
        
        
          getServletContext()
                .getRequestDispatcher("/Account_activity.jsp")
                .forward(request, response);
    }
 
}
