<%-- 
    Document   : votingProcess
    Created on : 31 Oct, 2020, 3:16:43 PM
    Author     : Vaidehi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<%
    Object o = session.getAttribute("userid");
    Integer u = (Integer) o;
    Integer rrid= Integer.parseInt(request.getParameter("rid"));
    Integer vvid=Integer.parseInt(request.getParameter("vid"));
    String nm=request.getParameter("nomine");
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from nomination");
    int count=0;
    while(rs.next())
    {
        if(rs.getInt("rid")==rrid && rs.getInt("voteid")==vvid)
        {
            count=rs.getInt("ncount")+1;
        }
    }
    PreparedStatement pst = con.prepareStatement("update nomination set ncount="+count+" where rid="+rrid+" and voteid="+vvid);
    int i=pst.executeUpdate();
    
    PreparedStatement ps = con.prepareStatement("insert into voting (rid,nomination,voteid) values ("+u+",'"+nm+"',"+vvid+")" );
    int i1=ps.executeUpdate();
    if(i>0 && i1>0)
    {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('Vote  Registered!!');");
        out.println("window.top.location.href='http://localhost:8084/SocietyApp/CandidateVoting.jsp';");
        out.println("</script>");
    }
%>
