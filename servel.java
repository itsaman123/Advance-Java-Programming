import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class servel extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    HttpSession session = request.getSession();

    // Get session creation time
    long createTime = session.getCreationTime();
    java.util.Date createDate = new java.util.Date(createTime);

    // Get last access time of this session
    long lastAccessTime = session.getLastAccessedTime();
    java.util.Date lastAccessDate = new java.util.Date(lastAccessTime);

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String title = "Session Tracking Example";
    String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
        "transitional//en\">\n";

    out.println(docType +
        "<html>\n" +
        "<head><title>" + title + "</title></head>\n" +
        "<body bgcolor = \"#f0f0f0\">\n" +
        "<h1 align = \"center\">" + title + "</h1>\n" +
        "<table border = \"1\" align = \"center\">\n" +
        "<tr bgcolor = \"#949494\">\n" +
        "  <th>Session Info</th><th>Value</th></tr>\n" +
        "<tr>\n" +
        "  <td>id</td>\n" +
        "  <td>" + session.getId() + "</td></tr>\n" +
        "<tr>\n" +
        "  <td>Creation Time</td>\n" +
        "  <td>" + createDate + "</td></tr>\n" +
        "<tr>\n" +
        "  <td>Time of Last Access</td>\n" +
        "  <td>" + lastAccessDate + "</td></tr>\n" +
        "</table>\n" +
        "</body></html>"
    );
  }
}
