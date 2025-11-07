package kapilit;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		request.getRequestDispatcher("/Link.html").include(request, response);
		
		String uname = request.getParameter("user");
		String password = request.getParameter("pass");
		
		if(uname.equals("Admin") && (password.equals("admin@123")))
		{
			out.println("welcome to mr. " + uname);
			Cookie ck = new Cookie("username", uname);
			response.addCookie(ck);
		}
		else
		{
			out.println("Wrong credentials");
			request.getRequestDispatcher("/Login.html").include(request, response);
		}
		
		
		
	}

}
