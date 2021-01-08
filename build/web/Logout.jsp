<%-- 
    Document   : Logout
    Created on : 28 Oct, 2020, 4:49:13 PM
    Author     : Vaidehi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        session.invalidate();
        out.println("<script type=\"text/javascript\">");
        out.println("alert('Logout Successfully!!');");
        out.println("location='IndexPage.html';");
        out.println("</script>");
        %>
    </body>
</html>
