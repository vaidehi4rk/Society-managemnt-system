package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ViewUserMinutes_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from minutes");
    out.println(session.getAttribute("uname"));

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
      out.write("       \n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            \n");
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
      out.write("\n");
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
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\" class=\"active\">\n");
      out.write("            <div id=\"sidebar-wrapper\">\n");
      out.write("                <ul id=\"sidebar_menu\" class=\"sidebar-nav\">\n");
      out.write("                    <li class=\"sidebar-brand\"><a id=\"menu-toggle\" href=\"AdminHome.html\">HOME<span class=\"main_icon fa fa-bars\"></span></a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"sidebar-nav\" id=\"sidebar\">     \n");
      out.write("                    <li><a href=\"ViewUserMinutes.jsp\">My Profile<span class=\"sub_icon fa fa-users\"></span></a></li>                    \n");
      out.write("                    <li><a href=\"#\">Gallery<span class=\"sub_icon fa fa-image\"></span></a></li>\n");
      out.write("                    <li><a href=\"#\">View Maintenance history<span class=\"sub_icon fa fa-history\"></span></a></li>\n");
      out.write("                    <li><a href=\"ViewMinutes.jsp\">View Minutes of meetings<span class=\"sub_icon fa fa-eye\"></span></a></li>\n");
      out.write("                    <li><a href=\"AddComplaints.jsp\">Add Complaints<span class=\"sub_icon fa fa-comments\"></span></a></li>\n");
      out.write("                    <li><a href=\"#\">Add Tenants (if any)<span class=\"sub_icon fa fa-users\"></span></a></li>                                        \n");
      out.write("                    <li><a href=\"#\">Logout");
session.invalidate();
      out.write("<span class=\"sub_icon fa fa-power-off\"></span></a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--view members-->\n");
      out.write("        <div class=\"table2\">\n");
      out.write("            <button type=\"button\">Log out!</button> \n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">Sr No</th>\n");
      out.write("                        <th scope=\"col\">Meeting Topic</th>\n");
      out.write("                        <th scope=\"col\">Meeting date</th>\n");
      out.write("                        <th scope=\"col\">File Name</th>\n");
      out.write("                        <th scope=\"col\">Download File</th>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        while (rs.next()) {
      out.write("\n");
      out.write("                       \n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(rs.getString("momid"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("mytopic"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("momdate"));
      out.write("</td>                       \n");
      out.write("                        <td>");
      out.print(rs.getString("myfilename"));
      out.write("</td>\n");
      out.write("                       <td><a href=\"DownloadFile?fileName=");
      out.print(rs.getString("myfilename"));
      out.write("\">Download</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
                    
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
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
