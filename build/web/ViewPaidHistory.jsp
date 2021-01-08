<%-- 
    Document   : ViewPaidHistory
    Created on : 29 Oct, 2020, 4:54:00 PM
    Author     : Vaidehi
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String payStatus=request.getParameter("paystatus");
    out.println(payStatus);
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from memberregister m  join  childt c on m.rid=c.rid where paid_status='"+payStatus+"'");
    
%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
   
    <head>
        <title>View Tenants</title>
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
 
            .table2
            {
                margin-left: 10px;
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
        <!--sidebar menu-->
        
        <!--admin page-->
        <div class="table2">
            
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th scope="col">Flat Owner name</th>
                        <th scope="col">Contact</th>
                        <th scope="col">Wing</th>
                        <th scope="col">Floor</th>
                        <th scope="col">Room Number</th>
                        <th scope="col">Flat Type</th>
                        <th scope="col">Due Date</th>
                        <th scope="col">Paid Status</th>                       
                    </tr>
                </thead>
                <tbody>
                    <%
                        while (rs.next()) 
                        {
                            
                    %>                       
                    <tr>
                        <td><%=rs.getString("mName")%></td>
                        <td><%=rs.getString("contact")%></td>
                        <td><%=rs.getString("wing")%></td>
                        <td><%=rs.getString("floor")%></td>                       
                        <td><%=rs.getString("roomno")%></td>
                        <td><%=rs.getString("flattype")%></td>
                        <td><%=rs.getString("enddate")%></td>
                        <td><%=rs.getString("paid_status")%></td>                    
                    </tr>
                    
                    <%}%>
                </tbody>
            </table>
        </div>
        <script>
            /* $("#menu-toggle").click(function (e) {
             e.preventDefault();
             $("#wrapper").toggleClass("active");
             });*/
        </script>
    </body>

</html>
