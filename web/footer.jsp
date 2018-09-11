<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
        
<% 
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
    int currentDay = currentDate.get(Calendar.DATE);
    int currentMonth = currentDate.get(Calendar.MONTH);
  
%>
<p>&copy; Copyright <%= currentMonth %>/<%= currentDay %>/<%= currentYear %> Michael Kindelspire </p>
    </body>
    
</html>
