package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public final class MyProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

    Object o = session.getAttribute("userid");
    Integer u = (Integer) o;
    //out.println(u);

    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from memberregister where rid=" + u);

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>User Home Page</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <!--sidebar-->\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\"  crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\"  crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"  crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\"  crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
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
      out.write("                padding: 50px;\n");
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
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!--sidebar menu-->\n");
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
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("        <!--admin page-->\n");
      out.write(" ");

                        while (rs.next()) {
      out.write("\n");
      out.write("                   \n");
      out.write("        <div id=\"page-content-wrapper\">\n");
      out.write("            <div class=\"page-content\">\n");
      out.write("                <form>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"name\" class=\"col-sm-2 col-form-label\">Name</label>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"name\" value=\"");
      out.print(rs.getString("mName"));
      out.write("\" name=\"name\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("\n");
      out.write("                        <label class=\" col-sm-2 col-form-label\" for=\"gender\" >Gender</label>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <select class=\"custom-select\" id=\"gender\" name=\"gender\">\n");
      out.write("                                <option selected>");
      out.print(rs.getString("gender"));
      out.write("</option>\n");
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
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"contact\" placeholder=\"Contact number\" name=\"contact\" value=\"");
      out.print(rs.getString("contact"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"ecn\" class=\"col-sm-2 col-form-label\">Emergency Contact Number</label>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"ecn\" name=\"ecn\" placeholder=\"EmergencyContact number\" value=\"");
      out.print(rs.getString("emergencycno"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"wing\" class=\"col-sm-2 col-form-label\">Wing</label>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"wing\" name=\"wing\" placeholder=\"wing\" value=\"");
      out.print(rs.getString("wing"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"floor\" class=\"col-sm-2 col-form-label\">Floor</label>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"floor\" name=\"floor\" placeholder=\"floor\" value=\"");
      out.print(rs.getString("floor"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"roomno\" class=\"col-sm-2 col-form-label\">Room Number</label>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"roomno\" name=\"roomno\" placeholder=\"Room No\" value=\"");
      out.print(rs.getString("roomno"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"form-group row\">\n");
      out.write("\n");
      out.write("                        <label class=\" col-sm-2 col-form-label\" for=\"flattype\">Flat type</label>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <select class=\"custom-select\" id=\"flattype\" name=\"flattype\">\n");
      out.write("                                <option selected>");
      out.print(rs.getString("flattype"));
      out.write("</option>\n");
      out.write("                                <option value=\"1BHK\">1BHK</option>\n");
      out.write("                                <option value=\"2BHK\">2BHK</option>\n");
      out.write("                                <option value=\"1RK\">1RK</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"usn\" class=\"col-sm-2 col-form-label\">Username</label>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"usn\" name=\"usn\" placeholder=\"Username\" value=\"");
      out.print(rs.getString("username"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"pwd\" class=\"col-sm-2 col-form-label\">Password</label>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"pwd\" name=\"pwd\" placeholder=\"Password\" value=\"");
      out.print(rs.getString("password"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        <br><br>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <div class=\"col-sm-6 \">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\" style=\"align: center\" name=\"btnsub\">Update Profile</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        ");
}
                    
      out.write("\n");
      out.write("                     ");

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

                            
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            /* $(\"#menu-toggle\").click(function (e) {\n");
      out.write("             e.preventDefault();\n");
      out.write("             $(\"#wrapper\").toggleClass(\"active\");\n");
      out.write("             });*/\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
