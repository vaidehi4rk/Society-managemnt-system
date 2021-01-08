<%-- 
    Document   : ViewUserComplaint
    Created on : 30 Oct, 2020, 5:19:33 PM
    Author     : Vaidehi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%
    Object o = session.getAttribute("userid");
    Integer u = (Integer) o;
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from complaints where rid=" + u);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>User Home Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!--sidebar-->
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"  crossorigin="anonymous">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <style>

            .row{
                margin-left:0px;
                margin-right:0px;
            }

            #sidebar-wrapper {
                margin-left: -150px;
                left: 70px;
                width: 290px;
                background: #080707;
                position: fixed;
                height: 100%;
                transition: all .4s ease 0s;
            }

            .sidebar-nav {
                display: block;
                float: left;
                width: 290px;
                list-style: none;
                margin: 0;
                padding: 0;
            }

            #wrapper.active {
                padding-left: 250px;
            }
            #wrapper.active #sidebar-wrapper {
                left: 150px;
            }

            #sidebar_menu li a, .sidebar-nav li a {
                color: #999;
                display: block;
                float: left;
                text-decoration: none;
                width: 290px;
                background: #080707;
                border-top: 1px solid #373737;
                border-bottom: 1px solid #1A1A1A;
            }
            .sidebar_name {
                padding-top: 25px;
                color: #fff;
                opacity: .7;
            }

            .sidebar-nav li {
                line-height: 40px;
                text-indent: 20px;
            }

            .sidebar-nav li a {
                color: #999999;
                display: block;
                text-decoration: none;
            }

            .sidebar-nav li a:hover {
                color: #fff;
                background: rgba(255,255,255,0.2);
                text-decoration: none;
            }

            .sidebar-nav li a:active,
            .sidebar-nav li a:focus {
                text-decoration: none;
            }

            .sidebar-nav > .sidebar-brand {
                height: 65px;
                line-height: 60px;
                font-size: 18px;
            }

            .sidebar-nav > .sidebar-brand a {
                color: #999999;
            }

            .main_icon
            {
                float:right;
                padding-right: 34px;
                padding-top:20px;
            }

            .sub_icon
            {
                float:right;
                padding-right: 34px;
                padding-top:15px;
            }

            .col {
                margin-top: 50px;
                width: 350px;
                text-align: center;
                height: 200px;   
                border: 1px solid black;
                background-color: gainsboro;
                margin-left: 10px;
            }
            #page-content-wrapper
            {
                margin-left: 300px;
                padding: 50px;
            }
            .lead
            {
                border: 1px solid black;
                padding: 20px;
                margin-left: -16px;
                margin-right: -16px;

            }
            .num
            {
                border: 1px solid black;
                padding: 58px;
                margin-left: -16px;
                margin-right: -16px;
            }
            .table2
            {
                margin-left: 310px;
                margin-right: 20px;
                padding-top: 30px;
            }
            thead
            {
                color: white;
                background-color: black;
            }

        </style>

    </head>
    <body>
        <%
//            out.println(u);
        %>
        <!--sidebar menu-->
        <div id="wrapper" class="active">
            <div id="sidebar-wrapper">
                <ul id="sidebar_menu" class="sidebar-nav">
                    <li class="sidebar-brand"><a id="menu-toggle" href="UserHomePage.jsp">HOME<span class="main_icon fa fa-bars"></span></a></li>
                </ul>
                <ul class="sidebar-nav" id="sidebar">     
                    <li><a href="MyProfile.jsp">My Profile<span class="sub_icon fa fa-users"></span></a></li>                    
                    <li><a href="ViewNotices.jsp">View Notices<span class="sub_icon fa fa-bell"></span></a></li>
                    <li><a href="UserMaintenance.jsp">View Maintenance history<span class="sub_icon fa fa-history"></span></a></li>
                    <li><a href="ViewUserMinutes.jsp">View Minutes of meetings<span class="sub_icon fa fa-file"></span></a></li>
                    <li><a href="ViewUserComplaint.jsp">View Your Complaint<span class="sub_icon fa fa-eye"></span></a></li>
                    <li><a href="AddComplaints.jsp">Add Complaints<span class="sub_icon fa fa-comments"></span></a></li>
                    <li><a href="AddTenants.jsp">Add Tenants (if any)<span class="sub_icon fa fa-users"></span></a></li> 
                    <li><a href="nominate.jsp">Nominate Yourself<span class="sub_icon fa fa-users"></span></a></li>     
                    <li><a href="CandidateVoting.jsp">Vote<span class="sub_icon fa fa-users"></span></a></li>                                        
                    <li><a href="Logout.jsp">Logout<span class="sub_icon fa fa-power-off"></span></a></li>


                </ul>
            </div>  
        </div>
        <!--admin page-->

        <div class="table2">

            <table class="table table-bordered">
                <thead>
                    <tr>

                        <th scope="col">Complaint Date</th>
                        <th scope="col">Complaint</th>
                        <th scope="col">Status</th>


                    </tr>
                </thead>
                <tbody>
                    <%                        while (rs.next()) {%>

                    <tr>

                        <td><%=rs.getString("cdate")%></td>
                        <td><%=rs.getString("cdesc")%></td> 
                        <td><%=rs.getString("cstatus")%></td>

                    </tr>
                    <%}
                    %>

                </tbody>
            </table>

        </div>

    </body>
</html>
