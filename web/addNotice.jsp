<%-- 
    Document   : addNotice
    Created on : 28 Oct, 2020, 7:51:42 PM
    Author     : Vaidehi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>

<%
    
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st = con.createStatement();

%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Admin Page</title>
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
                background: #222;
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
                background: #252525;
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
            .wrap
            {
                margin-left: 550px;
                position: absolute;
                left: 0px;
                top: 0px;
                z-index: -1;
                padding-top: 200px;
                

            }

        </style>

    </head>
    <body>
        <!--sidebar menu-->
        <div id="wrapper" class="active">
            <div id="sidebar-wrapper">
                <ul id="sidebar_menu" class="sidebar-nav">
                    <li class="sidebar-brand"><a id="menu-toggle" href="AdminHome.html">HOME<span class="main_icon fa fa-bars"></span></a></li>
                </ul>
                <ul class="sidebar-nav" id="sidebar">     
                   <li><a href="ViewMembers.jsp">View members<span class="sub_icon fa fa-users"></span></a></li>                    
                    <li><a href="ViewMHistoryAdmin.jsp">View Maintenance history<span class="sub_icon fa fa-history"></span></a></li>
                    <li><a href="AddMinutes.html">Add Minutes of meetings<span class="sub_icon fa fa-plus-circle"></span></a></li>
                    <li><a href="addNotice.jsp">Add Notices<span class="sub_icon fa fa-bell"></span></a></li>
                    <li><a href="ViewMinutes.jsp">View Minutes of meetings<span class="sub_icon fa fa-eye"></span></a></li>
                    <li><a href="updateMaintenance.jsp">Update Maintenance<span class="sub_icon fa fa-edit"></span></a></li>
                    <li><a href="ViewComplaints.jsp">View Complaints<span class="sub_icon fa fa-comments"></span></a></li>
                    <li><a href="ViewTenants.jsp">View Tenants<span class="sub_icon fa fa-users"></span></a></li>
                    <li><a href="ViewVotesAdmin.jsp">View Vote Count<span class="sub_icon fa fa-user-friends"></span></a></li>
                    <li><a href="index.html">Logout<span class="sub_icon fa fa-power-off"></span></a></li>
                   
                </ul>
            </div>  
        </div>

        <!--admin page-->
        <div class="wrap col-md-5 col-sm-3">
            <div class="card">
                <div class="card-header"><h3>Notices</h3></div>
                <div class="card-body ">
                    <form name="my-form"  method="post" >

                        <div class="form-group row offset-md-4 justify-content-center">
                            <input type="date" class="form-control" name="mydate" id="mydate" data-date-format="yyyy-mm-dd">
                        </div>


                        <div class="form-group row">
                            <input type="text" id="topic" class="form-control" name="topic" placeholder="Enter Notice">
                        </div>

                        <div class="form-group row offset-md-4 justify-content-center">
                            <button type="submit" class="btn btn-primary" name="btnsub">
                                Submit
                            </button>
                        </div>
                        <%
//                           
                                        String d1 = "", t1 = "";
                                        d1 = request.getParameter("mydate");
                                        t1 = request.getParameter("topic");
                                        if (request.getParameter("btnsub") != null) {
                                            int i = st.executeUpdate("insert into notices(ndate,ntopic) values ('" + d1 + "','" + t1 + "')");
                                            if (i > 0) 
                                            {
                                                out.println("<script type=\"text/javascript\">");
                                                out.println("alert('Succesffully  Notices Registered!!');");
                                                out.println("location='AdminHome.html';");
                                                out.println("</script>");
                                            }
                                        }

                                                

                        %>

                    </form>
                </div>
            </div>
        </div>


        <script>
            /* $("#menu-toggle").click(function (e) {
             e.preventDefault();
             $("#wrapper").toggleClass("active");
             });*/
        </script>
    </body>
</html>
