<%-- 
    Document   : regsiter
    Created on : 24 Sep, 2020, 3:22:26 PM
    Author     : Vaidehi
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<%
    String mName = request.getParameter("name");
    String username = request.getParameter("uname");
    String gender = request.getParameter("gender");
    String contact = request.getParameter("contact");
    String emergencycno = request.getParameter("econtact");
    String wing = request.getParameter("wing");
    String floor = request.getParameter("floor");
    String roomno = request.getParameter("roomno");
    String ftype = request.getParameter("ftype");
    String password = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st = con.createStatement();

    int i = st.executeUpdate("insert into memberregister(mName,gender,contact,emergencycno,wing,floor,roomno,flattype,password,username) values ('" + mName + "','" + gender + "','" + contact + "','" + emergencycno + "','" + wing + "','" + floor + "','" + roomno + "','" + ftype + "','" + password + "','" + username + "')");
    ResultSet rs = st.executeQuery("select * from mastermtable");
    int mid=0;
    int cost=0;
    try {
        while (rs.next()) {
            if (rs.getString("roomtype").equals(ftype)) 
            {
                mid=rs.getInt("mid");
                cost=rs.getInt("mcost"); 
            } 
        }
    }
    catch(Exception e)
    {
        out.println(e);
    }
    int regid=0;
    ResultSet rs1=st.executeQuery("select rid,mName from memberregister");
    while(rs1.next())
    {
        if((rs1.getString("mName")).equals(mName))
        {
            regid=rs1.getInt("rid");
        }
    }
//    java.util.Date date=new java.util.Date();
//    int m=date.getMonth();
//    int y=date.getYear()+ 1900;

    Calendar now = Calendar.getInstance();
    int month = now.get(Calendar.MONTH) + 1;
    int year= now.get(Calendar.YEAR);
//    int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
    
    out.println(month);
    out.println(year);
    
    String start=year+"-"+month+"-01";
    String end=year+"-"+month+"-29";
    int i1 = st.executeUpdate("insert into childt (mid,startdate,enddate,paid_status,cost,rid) values ("+mid+",'"+start+"','"+end+"','not paid',"+cost+","+regid+")");
    if (i > 0 && i1>0) {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('Succesffully  Registered!!');");
        out.println("location='UserLogin.html';");
        out.println("</script>");
        // response.sendRedirect("MemberLogin.html");

    } else {
        response.sendRedirect("index.html");
    }
%>

<!--//yyyy-mm-dd-->