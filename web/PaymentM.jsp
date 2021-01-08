<%-- 
    Document   : PaymentM
    Created on : 26 Oct, 2020, 7:54:26 PM
    Author     : Vaidehi
--%>


<%@page import="java.math.BigInteger"%>
<%@page import="pay.rsa"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% int Mcost = Integer.parseInt(request.getParameter("cost"));%>
<% int cid = Integer.parseInt(request.getParameter("childid"));%>
<%
    Object o = session.getAttribute("userid");
    Integer u = (Integer) o;
    out.println(u);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Payment</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <style>body { margin-top:20px; }
            .panel-title {display: inline;font-weight: bold;}
            .checkbox.pull-right { margin: 0; }
            .pl-ziro { padding-left: 0px; }</style>
    </head>
    <body>
        <form action="payment.jsp" method="post">
            <div class="container">
                <div class="row">
                    <div class="col-xs-12 col-md-4">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    Pay Society Maintenance Online
                                </h3>
                            </div>
                            <div class="panel-body">
                                <div class="form-group">
                                    <label for="cardNumber">
                                        CARD NUMBER</label>
                                    <div class="input-group">
                                        <input type="text" class="form-control" id="cardno" name="cardno" maxlength="16" placeholder="Valid Card Number  (without space)"
                                               required autofocus  />
                                        <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                                    </div>
                                </div>


                                <div class="row">
                                    <div class="col-xs-7 col-md-7">
                                        <div class="form-group">
                                            <label>
                                                EXPIRY DATE</label>
                                            <div class="col-xs-6 col-lg-6 pl-ziro">
                                                <input type="text" class="form-control" id="month" name="month" placeholder="MM" maxlength="2" required />
                                            </div>
                                            <div class="col-xs-6 col-lg-6 pl-ziro">
                                                <input type="text" class="form-control" id="year" name="year" placeholder="YY" maxlength="2" required /></div>
                                        </div>
                                    </div>




                                    <div class="col-xs-5 col-md-5 pull-right">
                                        <div class="form-group">
                                            <label for="cvCode">
                                                CVV CODE</label>
                                            <input type="password" class="form-control" id="cvv" name="cvv" placeholder="CVV" maxlength="3" required />
                                        </div>
                                    </div>
                                </div>


                                <div class="form-group">
                                    <label>Total Amount Rs.</label>
                                    <input type="text" name="money" readonly value="<%=Mcost%>" class="form-control"/>
                                </div>

                                <input type="submit" class="btn btn-success btn-lg btn-block" role="button" value="pay"/>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </form>
    </body>
</html>

