package kapilit;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        String uname = request.getParameter("user");
	        String pass = request.getParameter("upass");

	        if (uname.equals("Admin") && pass.equals("admin@123")) 
	        {
	        	out.println("Correct Credentials");
	        	request.getRequestDispatcher("SecondServlet").forward(request, response);
	        	
	        } else {
	        	out.println("please Enter correct Credentials");
	        	request.getRequestDispatcher("/login.html").include(request, response);
	        }
	}

}
