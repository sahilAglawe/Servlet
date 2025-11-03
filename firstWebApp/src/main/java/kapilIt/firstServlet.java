package kapilIt;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


@WebServlet("/firstServlet")
public class firstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public firstServlet() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Employee e1 = new Employee(234,"sahil", 23, 90000);
		Employee e2 = new Employee(123,"savi", 21,80000);
		Student s1 = new Student(111,"vivek", 16);
		Student s2 = new Student(222,"vijay", 17);
		request.setAttribute("student2", s2);
		request.setAttribute("student1", s1);
		request.setAttribute("emp1", e1);
		request.setAttribute("emp2", e1);
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			out.println("the name of the parameter is " + name + "its value is " +request.getParameter(name) );
			
	}
		Enumeration<String> attribute = request.getAttributeNames();
		while(attribute.hasMoreElements())
		{
			String attri = attribute.nextElement();
			out.println("the name of the attribute is "+ attri + "its value is " + request.getAttribute(attri));
		}
	}
}
