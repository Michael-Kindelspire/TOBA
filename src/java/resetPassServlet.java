import java.io.*;
import java.util.Enumeration;
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
        Enumeration attributeNames = session.getAttributeNames();
        
        String oldPass = (String) session.getAttribute("password");
        request.setAttribute("message", oldPass);
        request.setAttribute("message2", newPass);
        request.setAttribute("password", newPass);
        session.setAttribute("password", newPass);
        
        
          getServletContext()
                .getRequestDispatcher("/Account_activity.jsp")
                .forward(request, response);
    }
 
}
