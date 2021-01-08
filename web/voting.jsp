<%-- 
    Document   : UserHomePage
    Created on : 26 Oct, 2020, 7:03:09 PM
    Author     : Vaidehi
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Object o = session.getAttribute("userid");
    Integer u = (Integer) o;
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from memberregister m join nomination n on m.rid=n.rid");

    Statement st1 = con.createStatement();
    ResultSet rs1 = st1.executeQuery("select * from voting where rid=" + u);
    String cand = request.getParameter("btn1");
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
            .table2
            {
                /*                margin-left: 310px;
                                margin-right: 20px;
                                padding-top: 30px;*/
            }
            thead
            {
                color: white;
                background-color: black;
            }

        </style>

    </head>
    <body>


        <!--admin page-->

        <div class="table2">

            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th scope="col">Candidate name</th>
                        <th scope="col">Nominated</th>
                        <th scope="col">Your Vote</th>


                    </tr>
                </thead>
                <tbody>
                    <%
                        while (rs.next()) {
                            if (rs.getString("nomination").equals(cand)) {
                    %>
                    <tr>
                        <td><%=rs.getString("mName")%></td>
                        <td><%=rs.getString("nomination")%></td>

                        <td><button type="submit" class="btn btn-warning"><a href="votingProcess.jsp?rid=<%=rs.getInt("rid")%>&vid=<%=rs.getInt("voteid")%>&nomine=<%=rs.getString("nomination")%>" style="text-decoration: none;color: white;">Submit Vote</a></button></td>


                    </tr>
                    <%
                            }
                        }
                    %>
                    <%
                    %>
                    
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