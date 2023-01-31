import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int a1=Integer.parseInt(request.getParameter("n1"));
		int a2=Integer.parseInt(request.getParameter("n2"));
		if(request.getParameter("r1")!=null)
		{
			out.println("<h3>Addition= </h3>"+(a1+a2));
		}
		else if(request.getParameter("r2")!=null)
		{
			out.println("<h3>Substraction= </h3>"+(a1-a2));
		}
		else if(request.getParameter("r3")!=null)
		{
			out.println("<h3>Multipliation= </h3>"+(a1*a2));
		}
		else if(request.getParameter("r4")!=null)
		{
			out.println("<h3>Divide= </h3>"+(a1/a2));
		}
	}

}