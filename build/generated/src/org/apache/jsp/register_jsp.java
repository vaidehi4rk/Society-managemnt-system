package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import java.sql.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String mName = request.getParameter("name");
    String username = request.getParameter("uname");
    String gender = request.getParameter("gender");
    String contact = request.getParameter("contact");
    String emergencycno = request.getParameter("econtact");
    String wing = request.getParameter("wing");
    String floor = request.getParameter("floor");
    String roomno = request.getParameter("roomno");
    String ftype = request.getParameter("ftype");
    String password = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
    Statement st = con.createStatement();

    int i = st.executeUpdate("insert into memberregister(mName,gender,contact,emergencycno,wing,floor,roomno,flattype,password,username) values ('" + mName + "','" + gender + "','" + contact + "','" + emergencycno + "','" + wing + "','" + floor + "','" + roomno + "','" + ftype + "','" + password + "','" + username + "')");
    ResultSet rs = st.executeQuery("select * from mastermtable");
    int mid=0;
    int cost=0;
    try {
        while (rs.next()) {
            if (rs.getString("roomtype").equals(ftype)) 
            {
                mid=rs.getInt("mid");
                cost=rs.getInt("mcost"); 
            } 
        }
    }
    catch(Exception e)
    {
        out.println(e);
    }
    int regid=0;
    ResultSet rs1=st.executeQuery("select rid,mName from memberregister");
    while(rs1.next())
    {
        if((rs1.getString("mName")).equals(mName))
        {
            regid=rs1.getInt("rid");
        }
    }
//    java.util.Date date=new java.util.Date();
//    int m=date.getMonth();
//    int y=date.getYear()+ 1900;

    Calendar now = Calendar.getInstance();
    int month = now.get(Calendar.MONTH) + 1;
    int year= now.get(Calendar.YEAR);
    
    out.println(month);
    out.println(year);
    
//    String start=y+"-"+m+"-01";
//    String end=y+"-"+m+"-29";
//    int i1 = st.executeUpdate("insert into childt (mid,startdate,enddate,paid_status,cost,rid) values ("+mid+",'"+start+"','"+end+"','not paid',"+cost+","+regid+")");
//    if (i > 0 && i1>0) {
//        out.println("<script type=\"text/javascript\">");
//        out.println("alert('Succesffully  Registered!!');");
//        out.println("location='MemberLogin.html';");
//        out.println("</script>");
//        // response.sendRedirect("MemberLogin.html");
//
//    } else {
//        response.sendRedirect("index.html");
//    }

      out.write("\n");
      out.write("\n");
      out.write("<!--//yyyy-mm-dd-->");
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
