<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
    String username = request.getParameter("username");
    //String room = request.getParameter("room");
    String password = request.getParameter("pwd");
   
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from memberregister where username='" + username + "' and password='" + password + "'");
    int flag = 0;
    try {
        while (rs.next()) {
            if (rs.getString("username").equals(username) && rs.getString("password").equals(password)) 
            {
               session.setAttribute("userid",rs.getInt("rid"));
               flag=1; 
               
            } else {
                flag=0;
            }
        }
        if(flag==1)
        {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Succesffully Logged in!!');");
                out.println("location='UserHomePage.jsp';");
                out.println("</script>");
                //response.sendRedirect("UserHome.html");
        }
        else
        {
            out.println("<script type=\"text/javascript\">");
                out.println("alert('User or password incorrect');");
                out.println("</script>");
                out.println("Invalid password or username.");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
%>