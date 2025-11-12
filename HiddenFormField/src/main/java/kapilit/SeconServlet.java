package kapilit;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/SeconServlet")
public class SeconServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SeconServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("The name the user is " + request.getParameter("uname"));
		
		out.println("<form action='ThirdServlet' method='post'>");
		out.println("<input type='hidden' name='Company' value='" + "kits" + "'>");
		out.println("<input type='submit' name='forward' >");
		out.println("</form>");
	}

}
