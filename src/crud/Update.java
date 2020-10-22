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
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pr= response.getWriter();
		String oldName = request.getParameter("oldName");
		String newName = request.getParameter("newName");
		String newAdresse = request.getParameter("newAdresse");
		String newCountry = request.getParameter("newCountry");
		
		pr.print("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" >\r\n" + 
				"");
		
		Student std = GestionStudent.SearchStudent(oldName);
		
		if(std == null  ) {
			pr.print("<div class=\"alert alert-danger\" role=\"alert\">\r\n" + 
					" Student never exist ! \r\n" + 
					"</div>");
			pr.print("<br><br>");
			pr.print("<a href='http://127.0.0.1:8080/CRUDjavaee/index.jsp'>Back to Home page..</a>");
			
		}
			
		else if(newName=="" && newAdresse=="" && newCountry=="") {
				pr.print("<div class=\"alert alert-danger\" role=\"alert\">\r\n" + 
						"  Empty column ! please verify your inputs \r\n" + 
						"</div>");
				pr.print("<br><br>");
				pr.print("<a href='http://127.0.0.1:8080/CRUDjavaee/index.jsp'>Back to Home page..</a>");
			
		}
		else {
		
		
			
		if(!newName.equals("")) {	std.setName(newName);}
		if(!newAdresse.equals("")) {std.setEmail(newAdresse);}
			if(!newCountry.equals("")) {std.setCountry(newCountry);}
			
		
				
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/AffichageStudnet");
			rd.forward(request, response);
			
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
