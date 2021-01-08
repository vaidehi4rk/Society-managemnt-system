package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addNotice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Admin Page</title>\n");
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
      out.write("        <style>\n");
      out.write("           \n");
      out.write("            .row{\n");
      out.write("                margin-left:0px;\n");
      out.write("                margin-right:0px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #sidebar-wrapper {\n");
      out.write("                margin-left: -150px;\n");
      out.write("                left: 70px;\n");
      out.write("                width: 290px;\n");
      out.write("                background: #222;\n");
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
      out.write("                background: #252525;\n");
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
      out.write("           \n");
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
      out.write("                margin-left: 200px;\n");
      out.write("                padding: 100px;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--sidebar menu--><nav>\n");
      out.write("        <div id=\"wrapper\" class=\"active\">\n");
      out.write("            <div id=\"sidebar-wrapper\">\n");
      out.write("                <ul id=\"sidebar_menu\" class=\"sidebar-nav\">\n");
      out.write("                    <li class=\"sidebar-brand\"><a id=\"menu-toggle\" href=\"AdminHome.html\">HOME<span class=\"main_icon fa fa-bars\"></span></a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"sidebar-nav\" id=\"sidebar\">     \n");
      out.write("                    <li><a href=\"ViewMembers.jsp\">View members<span class=\"sub_icon fa fa-users\"></span></a></li>                    \n");
      out.write("                    <li><a href=\"#\">Gallery<span class=\"sub_icon fa fa-image\"></span></a></li>\n");
      out.write("                    <li><a href=\"#\">View Maintenance history<span class=\"sub_icon fa fa-history\"></span></a></li>\n");
      out.write("                    <li><a href=\"AddMinutes.html\">Add Minutes of meetings<span class=\"sub_icon fa fa-plus-circle\"></span></a></li>\n");
      out.write("                    <li><a href=\"addNotice.jsp\">Add Notices<span class=\"sub_icon fa fa-bell\"></span></a></li>\n");
      out.write("                    <li><a href=\"ViewMinutes.jsp\">View Minutes of meetings<span class=\"sub_icon fa fa-eye\"></span></a></li>\n");
      out.write("                    <li><a href=\"updateMaintenance.jsp\">Update Maintenance<span class=\"sub_icon fa fa-edit\"></span></a></li>\n");
      out.write("                    <li><a href=\"#\">View Complaints<span class=\"sub_icon fa fa-comments\"></span></a></li>\n");
      out.write("                    <li><a href=\"#\">View Tenants<span class=\"sub_icon fa fa-users\"></span></a></li>\n");
      out.write("                    <li><a href=\"#\">View Visitors<span class=\"sub_icon fa fa-user-friends\"></span></a></li>\n");
      out.write("                    <li><a href=\"index.html\">Logout<span class=\"sub_icon fa fa-power-off\"></span></a></li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("        </nav>\n");
      out.write("        <!--admin page-->\n");
      out.write("        <main id=\"page-content-wrapper\" class=\"col-sm-7\">\n");
      out.write("            <div class=\"container page-content\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-md-10\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header\"><h3>Minutes of Meetings</h3></div>\n");
      out.write("                            <div class=\"card-body \">\n");
      out.write("                                <form name=\"my-form\"  method=\"post\" >\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group row offset-md-4 justify-content-center\">\n");
      out.write("                                        <input type=\"date\" class=\"form-control\" name=\"mydate\" id=\"mydate\" data-date-format=\"yyyy-mm-dd\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group row\">\n");
      out.write("                                        <input type=\"text\" id=\"topic\" class=\"form-control\" name=\"topic\" placeholder=\"Your Complaint\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group row offset-md-4 justify-content-center\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary\" name=\"btnsub\">\n");
      out.write("                                            Submit\n");
      out.write("                                        </button>\n");
      out.write("                                    </div>\n");
      out.write("                                    ");
  
//                                       

                                    
      out.write("\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            /* $(\"#menu-toggle\").click(function (e) {\n");
      out.write("             e.preventDefault();\n");
      out.write("             $(\"#wrapper\").toggleClass(\"active\");\n");
      out.write("             });*/\n");
      out.write("        </script>\n");
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
