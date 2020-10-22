package crud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertStudent
 */
@WebServlet("/InsertStudent")
public class InsertStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String country = request.getParameter("country");
		PrintWriter pr = response.getWriter();
		pr.print("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" >\r\n" + 
				"");
		Student std = new Student(name,email,password,country);
	
		if(name=="" || email=="" || password=="" || country=="") {
			pr.print("<div class=\"alert alert-danger\" role=\"alert\">\r\n" + 
					"  Empty column ! please verify all your inputs \r\n" + 
					"</div>");
			pr.print("<br><br>");
			pr.print("<a href='http://127.0.0.1:8080/CRUDjavaee/index.jsp'>Back to Home page..</a>");
	
		}else if(GestionStudent.SearchStudent(name)!= null) {
			pr.print("<div class=\"alert alert-danger\" role=\"alert\">\r\n" + 
					"  User already exists ! add a new one  \r\n" + 
					"</div>");
			pr.print("<br><br>");
			pr.print("<a href='http://127.0.0.1:8080/CRUDjavaee/index.jsp'>Back to Home page..</a>");
		
		}else {
			
			
			GestionStudent.AddUser(std);
				
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/AffichageStudnet");
			rd.forward(request, response);
			
		}
		
		
	
	}

}
