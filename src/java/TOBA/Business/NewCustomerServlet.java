package TOBA.Business;

import TOBA.data.AccountDB;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import TOBA.data.UserDB;
import java.security.NoSuchAlgorithmException;



public class NewCustomerServlet extends HttpServlet {
@Override 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String  lastName= request.getParameter("lastName");
        String  Phone = request.getParameter("Phone");
        String  Address = request.getParameter("Address");
        String City = request.getParameter("City");
        String State = request.getParameter("State");
        String zipCode = request.getParameter("zipCode");
        String  email = request.getParameter("email");
        
        
        
        String url = "/New_customer.jsp";
        
       
        // validate the parameters
            String message;
           
            if (
                    firstName == null || firstName.isEmpty() ||
                    lastName == null || lastName.isEmpty() || 
                    Phone == null || Phone.isEmpty() ||
                    Address == null || Address.isEmpty() ||
                    City == null || City.isEmpty() ||
                    State == null || State.isEmpty() ||
                    zipCode == null || zipCode.isEmpty() ||       
                    email == null || email.isEmpty()       
                           
                )
            {
                message = "Please fill out all fields.";
                url = "/New_customer.jsp";
            } 
            else {
               
                String hashedPassword = TOBA.util.PasswordUtil.hashAndSaltPassword("welcome1");
                
                User user = new User (lastName+zipCode, hashedPassword, firstName,lastName,Phone,Address,City,State,zipCode,email);
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                
                //db stuff here
                UserDB.insert(user);
                Account account = new Account (25, user);
                AccountDB.insert(account);
                message="";
                
                
                url = "/Success.jsp";
                
            }
            
            request.setAttribute("message", message);
            getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        }
        
    
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }    
}
       
