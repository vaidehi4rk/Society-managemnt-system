package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.math.BigInteger;
import java.security.*;
import pay.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Object o = session.getAttribute("userid");
    Integer u = (Integer) o;
    out.println(u);

      out.write('\n');

    long cardno = Long.parseLong(request.getParameter("cardno"));
    int cvv = Integer.parseInt(request.getParameter("cvv"));
    int money = Integer.parseInt(request.getParameter("money"));
    int month = Integer.parseInt(request.getParameter("month"));
    int year = Integer.parseInt(request.getParameter("year"));
    rsa md = new rsa();

    BigInteger cardnumber = BigInteger.valueOf(cardno);
    BigInteger cvvno = BigInteger.valueOf(cvv);
    BigInteger money1 = BigInteger.valueOf(money);

//encrypt
    BigInteger cardnumberencrypted = md.encrypt(cardnumber);
    BigInteger cvvenc = md.encrypt(cvvno);
    BigInteger moneyencrypted = md.encrypt(money1);
// decrypt
    BigInteger cardnumberdecrypted = md.decrypt(cardnumberencrypted);
    BigInteger cvvdec = md.decrypt(cvvenc);
    BigInteger moneydecrypted = md.decrypt(moneyencrypted);
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st = con.createStatement();
    String flat="";
    int regid=0;
    int i = st.executeUpdate("insert into cardpayment (cvv,cardno,money,month,year) values('" + cvvenc + "','" + cardnumberencrypted + "','" + moneyencrypted + "'," + month + "," + year + ")");
    if (i > 0) {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('Payment Done Successfully!!');");
        out.println("</script>");
        ResultSet rs = st.executeQuery("select rid, flattype from memberregister");
       while(rs.next())
       { 
           if((rs.getInt("rid"))==u)
           {
               regid=rs.getInt("rid");
               flat = rs.getString("flattype");
           }
           
       }

        ResultSet rs1 = st.executeQuery("select * from mastermtable");
        int mid = 0;
        int cost = 0;
        try {
            while (rs1.next()) {
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
            
            
            ResultSet rs2=st.executeQuery("select enddate from childt where rid="+u);
            while (rs2.next()) {
                int curdate=rs2.getInt("enddate");
                out.println(curdate);
            }
            

            String start = pYear + "-" + nextMonth + "-01";
            String end = pYear + "-" + nextMonth + "-29";
            
            int i2=st.executeUpdate("update childt set paid_status='paid' where rid="+u);
            
            int i1 = st.executeUpdate("insert into childt (mid,startdate,enddate,paid_status,cost,rid) values (" + mid + ",'" + start + "','" + end + "','not paid'," + cost + "," + regid + ")");
        } catch (Exception e) {
            out.println(e);
        }
    } else {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('  Something went wrong!!');");
        out.println("</script>");
    }


      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\"  crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h3>Maintenance  Payment Details</h3>\n");
      out.write("        <div>\n");
      out.write("            <table class=\"table table-striped\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th>Card No:</th>\n");
      out.write("                    <td>");
      out.print(cardnumberdecrypted);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>CVV:</th>\n");
      out.write("                    <td>");
      out.print(cvvdec);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th>Total Amount:</th>\n");
      out.write("                    <td>");
      out.print(moneydecrypted);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Month:</th>\n");
      out.write("                    <td>");
      out.print(month);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Year:</th>\n");
      out.write("                    <td>");
      out.print(year);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
