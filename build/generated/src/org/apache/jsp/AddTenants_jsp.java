package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public final class AddTenants_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    Object o = session.getAttribute("userid");
    Integer u = (Integer) o;
    //out.println(u);

    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st = con.createStatement();


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View Members</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <!--sidebar-->\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\"  crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .row{\n");
      out.write("                margin-left:0px;\n");
      out.write("                margin-right:0px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #sidebar-wrapper {\n");
      out.write("                margin-left: -150px;\n");
      out.write("                left: 70px;\n");
      out.write("                width: 290px;\n");
      out.write("                background: #080707;\n");
      out.write("                position: fixed;\n");
      out.write("                height: 100%;\n");
      out.write("                transition: all .4s ease 0s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar-nav {\n");
      out.write("                display: block;\n");
      out.write("                float: left;\n");
      out.write("                width: 290px;\n");
      out.write("                list-style: none;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #wrapper.active {\n");
      out.write("                padding-left: 250px;\n");
      out.write("            }\n");
      out.write("            #wrapper.active #sidebar-wrapper {\n");
      out.write("                left: 150px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #sidebar_menu li a, .sidebar-nav li a {\n");
      out.write("                color: #999;\n");
      out.write("                display: block;\n");
      out.write("                float: left;\n");
      out.write("                text-decoration: none;\n");
      out.write("                width: 290px;\n");
      out.write("                background: #080707;\n");
      out.write("                border-top: 1px solid #373737;\n");
      out.write("                border-bottom: 1px solid #1A1A1A;\n");
      out.write("            }\n");
      out.write("            .sidebar_name {\n");
      out.write("                padding-top: 25px;\n");
      out.write("                color: #fff;\n");
      out.write("                opacity: .7;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar-nav li {\n");
      out.write("                line-height: 40px;\n");
      out.write("                text-indent: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar-nav li a {\n");
      out.write("                color: #999999;\n");
      out.write("                display: block;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar-nav li a:hover {\n");
      out.write("                color: #fff;\n");
      out.write("                background: rgba(255,255,255,0.2);\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar-nav li a:active,\n");
      out.write("            .sidebar-nav li a:focus {\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar-nav > .sidebar-brand {\n");
      out.write("                height: 65px;\n");
      out.write("                line-height: 60px;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar-nav > .sidebar-brand a {\n");
      out.write("                color: #999999;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .main_icon\n");
      out.write("            {\n");
      out.write("                float:right;\n");
      out.write("                padding-right: 34px;\n");
      out.write("                padding-top:20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sub_icon\n");
      out.write("            {\n");
      out.write("                float:right;\n");
      out.write("                padding-right: 34px;\n");
      out.write("                padding-top:15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .col {\n");
      out.write("                margin-top: 50px;\n");
      out.write("                width: 350px;\n");
      out.write("                text-align: center;\n");
      out.write("                height: 200px;   \n");
      out.write("                border: 1px solid black;\n");
      out.write("                background-color: gainsboro;\n");
      out.write("                margin-left: 10px;\n");
      out.write("            }\n");
      out.write("            #page-content-wrapper\n");
      out.write("            {\n");
      out.write("                margin-left: 300px;\n");
      out.write("                padding:100px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .lead\n");
      out.write("            {\n");
      out.write("                border: 1px solid black;\n");
      out.write("                padding: 20px;\n");
      out.write("                margin-left: -16px;\n");
      out.write("                margin-right: -16px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .num\n");
      out.write("            {\n");
      out.write("                border: 1px solid black;\n");
      out.write("                padding: 58px;\n");
      out.write("                margin-left: -16px;\n");
      out.write("                margin-right: -16px;\n");
      out.write("            }\n");
      out.write("            .table2\n");
      out.write("            {\n");
      out.write("                margin-left: 310px;\n");
      out.write("                margin-right: 20px;\n");
      out.write("                padding-top: 30px;\n");
      out.write("            }\n");
      out.write("            thead\n");
      out.write("            {\n");
      out.write("                color: white;\n");
      out.write("                background-color: black;\n");
      out.write("            }\n");
      out.write("            a\n");
      out.write("            {\n");
      out.write("                color: black;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            a:link {\n");
      out.write("                text-decoration: none;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a:visited {\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            a:hover {\n");
      out.write("                color: #0000CD;\n");
      out.write("            }\n");
      out.write("            .card{\n");
      out.write("                margin-top: 200px;\n");
      out.write("                margin-left: 200px;\n");
      out.write("                height:800px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\" class=\"active\">\n");
      out.write("            <div id=\"sidebar-wrapper\">\n");
      out.write("                <ul id=\"sidebar_menu\" class=\"sidebar-nav\">\n");
      out.write("                    <li class=\"sidebar-brand\"><a id=\"menu-toggle\" href=\"UserHomePage.jsp\">HOME<span class=\"main_icon fa fa-bars\"></span></a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"sidebar-nav\" id=\"sidebar\">     \n");
      out.write("                    <li><a href=\"MyProfile.jsp\">My Profile<span class=\"sub_icon fa fa-users\"></span></a></li>                    \n");
      out.write("                    <li><a href=\"#\">Gallery<span class=\"sub_icon fa fa-image\"></span></a></li>\n");
      out.write("                    <li><a href=\"UserMaintenance.jsp\">View Maintenance history<span class=\"sub_icon fa fa-history\"></span></a></li>\n");
      out.write("                    <li><a href=\"ViewUserMinutes.jsp\">View Minutes of meetings<span class=\"sub_icon fa fa-eye\"></span></a></li>\n");
      out.write("                    <li><a href=\"AddComplaints.jsp\">Add Complaints<span class=\"sub_icon fa fa-comments\"></span></a></li>\n");
      out.write("                    <li><a href=\"#\">Add Tenants (if any)<span class=\"sub_icon fa fa-users\"></span></a></li>                                        \n");
      out.write("                    <li><a href=\"index.html\">Logout<span class=\"sub_icon fa fa-power-off\"></span></a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("        <!--main content-->\n");
      out.write("        <form>\n");
      out.write("            <div id=\"page-content-wrapper\">\n");
      out.write("                <div class=\"page-content\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"name\" class=\"col-sm-2 col-form-label\">Tenant Name</label>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"tname\" placeholder=\"Tenant Name\" value=\"\" name=\"tname\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("\n");
      out.write("                        <label class=\" col-sm-2 col-form-label\" for=\"gender\" >Gender</label>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <select class=\"custom-select\" id=\"gender\" name=\"gender\">\n");
      out.write("                                <option selected>Select Gender</option>\n");
      out.write("                                <option value=\"male\">Male</option>\n");
      out.write("                                <option value=\"female\">Female</option>\n");
      out.write("                                <option value=\"other\">other</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"contact\" class=\"col-sm-2 col-form-label\">Contact</label>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"contact\" placeholder=\"Contact number\" name=\"contact\" maxlength=\"10\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"ecn\" class=\"col-sm-2 col-form-label\">Emergency Contact Number</label>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"ecn\" name=\"ecn\" placeholder=\"Emergency Contact Number\" maxlength=\"10\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"wing\" class=\"col-sm-2 col-form-label\">Joining Date</label>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <input type=\"date\" class=\"form-control\" id=\"tdate\" name=\"tdate\" data-date-format=\"yyyy-mm-dd\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"floor\" class=\"col-sm-2 col-form-label\">Tenant Aadhar Number</label>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"aadhar\" name=\"aadhar\" placeholder=\"Aadhar number\" maxlength=\"12\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"roomno\" class=\"col-sm-2 col-form-label\">Tenant Old Address</label>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"told\" name=\"told\" placeholder=\"Tenant Old Address\" >\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br><br>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <div class=\"col-sm-6 \">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\"  name=\"btnsub\">Add Tenant Profile</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
                
                String n1 = "", jdate = "", told1 = "", g1 = "";
                long c1 = 0, ecn1 = 0, a1 = 0;
                n1 = request.getParameter("tname");
                g1 = request.getParameter("gender");
                c1 = Long.parseLong(request.getParameter("contact"));
                ecn1 = Long.parseLong(request.getParameter("ecn"));
                jdate = request.getParameter("tdate");
                a1 = Long.parseLong(request.getParameter("aadhar"));
                told1 = request.getParameter("told");
                try {
                    if (request.getParameter("btnsub") != null) {
                        int i = st.executeUpdate("insert into tenant(rid,tname,tjoindate,taadhar,tcontact,tecn,tgender,told) values (" + u + ",'" + n1 + "','" + jdate + "'," + a1 + "," + c1 + "," + ecn1 + ",'" + g1 + "','" + told1 + "')");
                        if (i > 0) {
                            out.println("<script type=\"text/javascript\">");
                            out.println("alert('Succesffully  Tenant Registered!!');");
                            out.println("location='UserHomePage.jsp';");
                            out.println("</script>");
                        }
                    } else {
                        out.println("wrong");
                    }
                } catch (Exception e) {
                    out.println(e);
                }
            
      out.write("\n");
      out.write("        </form>\n");
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
