<%-- 
    Document   : nominationProcess
    Created on : 31 Oct, 2020, 2:59:11 PM
    Author     : Vaidehi
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Object o = session.getAttribute("userid");
    Integer u = (Integer) o;
    String nom=request.getParameter("nomination");
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st = con.createStatement();
     int i = st.executeUpdate("insert into nomination(rid,nomination,ncount) values ("+u+",'"+nom+"',0)");
   if(i>0)
   {
       out.println("<script type=\"text/javascript\">");
        out.println("alert('Succesffully nominated !!');");
        out.println("location='UserHomePage.jsp';");
        out.println("</script>");
   }
   
%>