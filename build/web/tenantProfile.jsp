<%-- 
    Document   : date
    Created on : 26 Oct, 2020, 9:23:22 PM
    Author     : Vaidehi
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>

<%
    Object o = session.getAttribute("userid");
    Integer u = (Integer) o;
    //out.println(u);

    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st = con.createStatement();

%>
<%                
                String n1 = "", jdate = "", told1 = "", g1 = "";
                long c1 = 0, ecn1 = 0, a1 = 0;
                n1 = request.getParameter("tname");
                g1 = request.getParameter("gender");
                c1 = Long.parseLong(request.getParameter("contact"));
                ecn1 = Long.parseLong(request.getParameter("ecn"));
                jdate = request.getParameter("tdate");
                a1 = Long.parseLong(request.getParameter("aadhar"));
                told1 = request.getParameter("told");
                try {
                    if (request.getParameter("btnsub") != null) {
                        int i = st.executeUpdate("insert into tenant(rid,tname,tjoindate,taadhar,tcontact,tecn,tgender,told) values (" + u + ",'" + n1 + "','" + jdate + "'," + a1 + "," + c1 + "," + ecn1 + ",'" + g1 + "','" + told1 + "')");
                        if (i > 0) {
                            out.println("<script type=\"text/javascript\">");
                            out.println("alert('Succesffully  Tenant Registered!!');");
                            out.println("location='UserHomePage.jsp';");
                            out.println("</script>");
                        }
                    } else {
                        out.println("wrong");
                    }
                } catch (Exception e) {
                    out.println(e);
                }
            %>