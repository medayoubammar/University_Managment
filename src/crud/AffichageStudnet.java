package crud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AffichageStudnet
 */
@WebServlet("/AffichageStudnet")
public class AffichageStudnet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AffichageStudnet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pr = response.getWriter();
		response.setContentType("text/html");
		pr.print("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" >\r\n" + 
				"");
		pr.print("<br><br>");
		
		
		pr.print("<div class=\"container\"><table class=\"table table-dark\" border='2'><tr><td>Name</td><td>Email</td><td>Country</td></tr>");
		
		for(Student e: GestionStudent.getListe()) {
			pr.print("<tr>");
			pr.print("<td>"+e.getName()+"</td>");
			pr.print("<td>"+e.getEmail()+"</td>");
			pr.print("<td>"+e.getCountry()+"</td>");
		
			pr.print("</tr>");
			
		}
		pr.print("</table></div>");
		
		pr.print("<a href='http://127.0.0.1:8080/CRUDjavaee/index.jsp'>Back to Home page..</a>");

	

	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
