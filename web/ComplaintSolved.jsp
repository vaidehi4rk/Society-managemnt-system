<%-- 
    Document   : ComplaintSolved
    Created on : 30 Oct, 2020, 4:59:15 PM
    Author     : Vaidehi
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Integer rid=Integer.parseInt(request.getParameter("rid"));
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st = con.createStatement();
    int i2 = st.executeUpdate("update complaints set cstatus='solved' where rid="+rid);
    if(i2>0)
    {
        out.println("<script type=\"text/javascript\">");
        out.println("alert(' Complaint Solved!!');");
        out.println("location='ViewComplaints.jsp';");
        out.println("</script>");
    }
    
%>
