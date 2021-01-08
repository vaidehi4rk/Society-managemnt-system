<%-- 
    Document   : UserHomePage
    Created on : 26 Oct, 2020, 7:03:09 PM
    Author     : Vaidehi
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Object o = session.getAttribute("userid");
    Integer u = (Integer) o;
    //out.println(u);

    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from memberregister where rid=" + u);
%>
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
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"  crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"  crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"  crossorigin="anonymous"></script>
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

        </style>

    </head>
    <body>

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
 <%
                        while (rs.next()) {%>
                   
        <div id="page-content-wrapper">
            <div class="page-content">
                <form>
                    <div class="form-group row">
                        <label for="name" class="col-sm-2 col-form-label">Name</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="name" placeholder="name" value="<%=rs.getString("mName")%>" name="name">
                        </div>
                    </div>
                  
                    <div class="form-group row">

                        <label class=" col-sm-2 col-form-label" for="gender" >Gender</label>
                        <div class="col-sm-6">
                            <select class="custom-select" id="gender" name="gender">
                                <option selected><%=rs.getString("gender")%></option>
                                <option value="male">Male</option>
                                <option value="female">Female</option>
                                <option value="other">other</option>
                            </select>
                        </div>

                    </div>
                    <div class="form-group row">
                        <label for="contact" class="col-sm-2 col-form-label">Contact</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="contact" placeholder="Contact number" name="contact" value="<%=rs.getString("contact")%>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="ecn" class="col-sm-2 col-form-label">Emergency Contact Number</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="ecn" name="ecn" placeholder="EmergencyContact number" value="<%=rs.getString("emergencycno")%>">
                        </div>
                    </div>

                    <div class="form-group row">
                        <label for="wing" class="col-sm-2 col-form-label">Wing</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="wing" name="wing" placeholder="wing" value="<%=rs.getString("wing")%>">
                        </div>
                    </div>

                    <div class="form-group row">
                        <label for="floor" class="col-sm-2 col-form-label">Floor</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="floor" name="floor" placeholder="floor" value="<%=rs.getString("floor")%>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="roomno" class="col-sm-2 col-form-label">Room Number</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="roomno" name="roomno" placeholder="Room No" value="<%=rs.getString("roomno")%>">
                        </div>
                    </div>
                     <div class="form-group row">

                        <label class=" col-sm-2 col-form-label" for="flattype">Flat type</label>
                        <div class="col-sm-6">
                            <select class="custom-select" id="flattype" name="flattype">
                                <option selected><%=rs.getString("flattype")%></option>
                                <option value="1BHK">1BHK</option>
                                <option value="2BHK">2BHK</option>
                                <option value="1RK">1RK</option>
                            </select>
                        </div>

                    </div>
                    <div class="form-group row">
                        <label for="usn" class="col-sm-2 col-form-label">Username</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="usn" name="usn" placeholder="Username" value="<%=rs.getString("username")%>">
                        </div>
                    </div>
                    
                    <div class="form-group row">
                        <label for="pwd" class="col-sm-2 col-form-label">Password</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="pwd" name="pwd" placeholder="Password" value="<%=rs.getString("password")%>">
                        </div>
                    </div>
                        <br><br>
                    <div class="form-group row">
                        <div class="col-sm-6 ">
                            <button type="submit" class="btn btn-primary" style="align: center" name="btnsub">Update Profile</button>
                        </div>
                    </div>
                        <%}
                    %>
                     <%
                                if (request.getParameter("btnsub") != null) {
                                    String n1 = "", g1 = "", c1 = "", ecn1 = "", w1 = "", f1 = "", r1 = "", rt1 = "", us = " ",ps="";
                                    
                                    n1 = request.getParameter("name");
                                    g1 = request.getParameter("gender");
                                    c1 = request.getParameter("contact");
                                    ecn1 = request.getParameter("ecn");
                                    w1 = request.getParameter("wing");
                                    f1 = request.getParameter("floor");
                                    r1 = request.getParameter("roomno");
                                    rt1 = request.getParameter("flattype");
                                    us = request.getParameter("usn");
                                    ps = request.getParameter("pwd");

                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                       
                                        //String mid = request.getParameter("mid");
                                        PreparedStatement pst = con.prepareStatement("update memberregister set  mName=?,gender=?,contact=?,emergencycno=?,wing=?,floor=?,roomno=?,flattype=?,password=?,username=? where rid=" + u);
                                        pst.setString(1, n1);
                                        pst.setString(2, g1);
                                        pst.setString(3, c1);
                                        pst.setString(4, ecn1);
                                        pst.setString(5, w1);
                                        pst.setString(6, f1);
                                        pst.setString(7, r1);
                                        pst.setString(8, rt1);
                                        pst.setString(9, us);
                                        pst.setString(10, ps);

                                        int i = pst.executeUpdate();
                                        if (i > 0) {
                                            out.print("<script>alert('Record Updated Successfully!');window.location='MyProfile.jsp';</script>");
                                        } else {
                                            out.print("There is a problem in updating Record.");
                                        }

                                    } catch (SQLException sql) {

                                        request.setAttribute("error", sql);
                                        out.println(sql);
                                    }
                                }

                            %>
                </form>
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