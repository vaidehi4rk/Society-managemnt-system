<%-- 
    Document   : payment
    Created on : 26 Oct, 2020, 8:32:22 PM
    Author     : Vaidehi
--%>
<%@page import="java.util.Calendar"%>
<%@page import="java.sql.ResultSet"%>
<%-- 
    Document   : payment
    Created on : 22 Oct, 2020, 7:10:26 PM
    Author     : Vaidehi
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.math.BigInteger"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.security.*,pay.*" %>
<%
    Object o = session.getAttribute("userid");
    Integer u = (Integer) o;
    out.println(u);
%>
<%
    String cardno = request.getParameter("cardno");
    String cvv = request.getParameter("cvv");
    int money = Integer.parseInt(request.getParameter("money"));
    int month = Integer.parseInt(request.getParameter("month"));
    int year = Integer.parseInt(request.getParameter("year"));
    rsa rsa = new rsa();

      md5hash md=new md5hash();
      String cardno1=md.getHashPass(cardno);
      String cvv1=md.getHashPass(cvv);
//    BigInteger cardnumber = BigInteger.valueOf(cardno);
//    BigInteger cvvno = BigInteger.valueOf(cvv);
      BigInteger money1 = BigInteger.valueOf(money);

//encrypt
//    BigInteger cardnumberencrypted = md.encrypt(cardnumber);
//    BigInteger cvvenc = md.encrypt(cvvno);
      BigInteger moneyencrypted = rsa.encrypt(money1);
// decrypt
//    BigInteger cardnumberdecrypted = md.decrypt(cardnumberencrypted);
//    BigInteger cvvdec = md.decrypt(cvvenc);
    BigInteger moneydecrypted = rsa.decrypt(moneyencrypted);
    
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st = con.createStatement();
    String flat = "";
    int regid = 0;
    int i = st.executeUpdate("insert into cardpayment (cvv,cardno,money,month,year,rid) values('" + cvv1 + "','" + cardno1 + "','" + moneyencrypted + "'," + month + "," + year + ","+u+")");
    if (i > 0) {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('Payment Done Successfully!!');");
        out.println("</script>");
        ResultSet rs = st.executeQuery("select rid, flattype from memberregister");
        while (rs.next()) {
            if ((rs.getInt("rid")) == u) {
                regid = rs.getInt("rid");
                flat = rs.getString("flattype");
            }

        }

        ResultSet rs1 = st.executeQuery("select * from mastermtable");
        int mid = 0;
        int cost = 0;
        try {
            while (rs1.next()) 
            {
                if (rs1.getString("roomtype").equals(flat)) {
                    mid = rs1.getInt("mid");
                    cost = rs1.getInt("mcost");
                }
            }
            Calendar now = Calendar.getInstance();
            int pmonth = now.get(Calendar.MONTH) + 1;
            int pYear = now.get(Calendar.YEAR);
//    int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);

            int nextMonth = pmonth + 1;

            String curdate = "";
            ResultSet rs2 = st.executeQuery("select enddate from childt where rid=" + u);
            while (rs2.next()) {
                curdate = rs2.getString("enddate");

            }
            ///out.println("curdate"+curdate);
            String[] s = curdate.split("-");
            String curryear = s[0];
            String currmonth = s[1];
            int m = Integer.parseInt(currmonth);
            int y=Integer.parseInt(curryear);
            if(m<12)
            {
                
                m = m + 1;
                
            }
            else if(m>=12)
            {
                m= 1;
                y=y+1;
            }
            String start = y + "-" + m + "-01";
            String end = y + "-" + m + "-29";

            int i2 = st.executeUpdate("update childt set paid_status='paid' where rid=" + u);

            int i1 = st.executeUpdate("insert into childt (mid,startdate,enddate,paid_status,cost,rid) values (" + mid + ",'" + start + "','" + end + "','not paid'," + cost + "," + regid + ")");
        } catch (Exception e) {
            out.println(e);
        }
    } else {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('  Something went wrong!!');");
        out.println("</script>");
    }

%>
<html>
    <head>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"  crossorigin="anonymous">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <style>
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
        <h3>Maintenance  Payment Details</h3>
        <div>
            <table class="table table-striped">


                <tr>
                    <th>Card No:</th>
                    <td><%=cardno1%></td>
                </tr>
                <tr>
                    <th>CVV:</th>
                    <td><%=cvv1%></td>
                </tr>

                <tr>
                    <th>Total Amount:</th>
                    <td><%=moneydecrypted%></td>
                </tr>
                <tr>
                    <th>Month:</th>
                    <td><%=month%></td>
                </tr>
                <tr>
                    <th>Year:</th>
                    <td><%=year%></td>
                </tr>
            </table>
                <button type="submit" class="btn btn-warning"><a href="UserMaintenance.jsp">Go to Maintenance Page</a></button>   
        </div>
    </body>
</html>
