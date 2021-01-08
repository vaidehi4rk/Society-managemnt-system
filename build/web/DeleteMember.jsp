<%-- 
    Document   : ViewMembers
    Created on : 19 Oct, 2020, 5:02:02 PM
    Author     : Vaidehi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<% String mmid = request.getParameter("rid");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Members</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!--sidebar-->
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"  crossorigin="anonymous">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <!--        <script type="text/javascript">
                    function editInputField() {
                        document.getElementById("ed").contenteditable = true;
                    }
                </script>-->
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
            .table2
            {
                margin-left: 150px;
                margin-right: 20px;
                padding-top: 30px;
            }
            thead
            {
                color: white;
                background-color: black;
            }
            a
            {
                color: black;
                text-decoration: none;
            }
            a:link {
                text-decoration: none;

            }

            a:visited {
                text-decoration: none;
            }
            a:hover {
                color: #0000CD;
            }

        </style>

    </head>
    <body>
        <div id="wrapper" class="active">
            <div id="sidebar-wrapper">
                <ul id="sidebar_menu" class="sidebar-nav">
                    <li class="sidebar-brand"><a id="menu-toggle" href="AdminHome.html">HOME<span class="main_icon fa fa-bars"></span></a></li>
                </ul>
                <ul class="sidebar-nav" id="sidebar">     
                    <li><a href="ViewMembers.jsp">View members<span class="sub_icon fa fa-users"></span></a></li>                    
                    <li><a href="#">Gallery<span class="sub_icon fa fa-image"></span></a></li>
                    <li><a href="#">View Maintenance history<span class="sub_icon fa fa-history"></span></a></li>
                    <li><a href="AddMinutes.html">Add Minutes of meetings<span class="sub_icon fa fa-plus-circle"></span></a></li>
                    <li><a href="#">View Minutes of meetings<span class="sub_icon fa fa-eye"></span></a></li>
                    <li><a href="updateMaintenance.jsp">Update Maintenance<span class="sub_icon fa fa-edit"></span></a></li>
                    <li><a href="#">View Complaints<span class="sub_icon fa fa-comments"></span></a></li>
                    <li><a href="#">View Tenants<span class="sub_icon fa fa-users"></span></a></li>
                    <li><a href="#">View Visitors<span class="sub_icon fa fa-user-friends"></span></a></li>
                    <li><a href="index.html">Logout<span class="sub_icon fa fa-power-off"></span></a></li>

                </ul>
            </div>  
        </div>

        <!--view members-->
        <div class="table2">
            <%
                String m = " ", n = "", g = "", c = "", ecn = "", w = "", f = "", r = "", rt = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");

                    PreparedStatement pst = con.prepareStatement("select * from memberregister where rid=?");
                    pst.setString(1, mmid);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()) {
                        m = rs.getString("rid");
                        n = rs.getString("mName");
                        g = rs.getString("gender");
                        c = rs.getString("contact");
                        ecn = rs.getString("emergencycno");
                        w = rs.getString("wing");
                        f = rs.getString("floor");
                        r = rs.getString("roomno");
                        rt = rs.getString("flattype");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            %>
            <form name="delete" method="post" action="">
                <div class="table2">
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th scope="col">Member ID</th>
                                <th scope="col">Member Name</th>
                                <th scope="col">Gender</th>
                                <th scope="col">Contact No</th>
                                <th scope="col">Emergency Contact No.</th>
                                <th scope="col">Wing</th>
                                <th scope="col">Floor</th>
                                <th scope="col">Room No</th>
                                <th scope="col">Flat type</th>
                                <th scope="col">Edit</th>

                            </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td><%=m%></td>
                                <td><%=n%></td>
                                <td><%=g%></td>
                                <td><%=c%></td>
                                <td><%=ecn%></td>
                                <td><%=w%></td>
                                <td><%=f%></td>
                                <td><%=r%></td>
                                <td><%=rt%></td>
                                <td><button type="submit" name="btnsub" class="btn btn-danger" value="delete">Delete</button></td>

                            </tr>


                            <%
                                if (request.getParameter("btnsub") != null) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
                                        //String mid = request.getParameter("mid");
                                        PreparedStatement pst = con.prepareStatement("delete from memberregister where rid=" + mmid);
                                        

                                        int i = pst.executeUpdate();
                                        if (i > 0) {
                                            out.print("<script>alert('Record Deleted Successfully!');window.location='ViewMembers.jsp';</script>");
                                        } else {
                                            out.print("There is a problem in Deleting Record.");
                                        }

                                    } catch (SQLException sql) {

                                        request.setAttribute("error", sql);
                                        out.println(sql);
                                    }
                                }

                            %>
                        </tbody>
                    </table>
                </div>

            </form>
        </div>
    </body>
</html>
