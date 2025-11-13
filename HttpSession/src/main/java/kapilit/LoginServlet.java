package kapilit;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
        String name = request.getParameter("user");
        String pass = request.getParameter("pass");
        
        
        if((name.equals("user")) && (pass.equals("pass"))) 
        {
        Employee e1 = new Employee(123, "sahil");
        HttpSession session = request.getSession();
        session.setAttribute("username", e1);
        request.getRequestDispatcher("WelcomeServlet").forward(request, response);
        } 
        else
        {
        	out.println("wrong credentials, enter the perfect");
        	request.getRequestDispatcher("/Link.html").include(request, response);
        }
        
}
}