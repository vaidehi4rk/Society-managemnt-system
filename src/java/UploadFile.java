import java.io.*;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(urlPatterns = {"/UploadFile"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50)

public class UploadFile extends HttpServlet {
    
    
    public static final String UPLOAD_DIR = "moms";
    public String dbFileName = "";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;");
        PrintWriter out = response.getWriter();

        String date = request.getParameter("mydate");
        String topic = request.getParameter("topic");
        String minutes = request.getParameter("minutes");

        out.println(date);
        out.println(topic);
        out.println(minutes);
        Part part = request.getPart("file");
        String fileName = extractFileName(part);
        out.println(fileName);
        String savePath = "E:\\SocietyApp\\SocietyApp\\web\\moms\\" + File.separator + fileName;
        out.println(savePath);
        File fileSaveDir1 = new File(savePath);
        part.write(savePath + File.separator);
        try {

            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/society", "root", "root");
            //Statement st1 = con.createStatement();
            //int i = st1.executeUpdate("insert into minutes(topic,momdate,path,desc,filename) values ('" + topic + "','" + date + "','" + savePath +"','"+minutes+"','"+fileName+ "')");
            PreparedStatement ps = con.prepareStatement("insert into minutes(mytopic,momdate,mypath,description,myfilename) values(?,?,?,?,?)");
            ps.setString(1, topic);
            ps.setString(2, date);
            ps.setString(3, savePath);
            ps.setString(4, minutes);
            ps.setString(5, fileName);
            ps.executeUpdate();
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Minutes Added!');");
            out.println("location='AddMinutes.html';");
            out.println("</script>");

        } catch (Exception e) {
            out.println(e);
        }

    }
   
    private String extractFileName(Part part) {//This method will print the file name.
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }

//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet UploadFile</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet UploadFile at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        //processRequest(request, response);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>

}
