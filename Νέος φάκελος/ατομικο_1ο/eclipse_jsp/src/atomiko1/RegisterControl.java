package atomiko1;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Register")
public class RegisterControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterControl() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		//PrintWriter out = new PrintWriter(response.getWriter(), true);

		//reading parameters from request
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		//define RequestDispatcher object to forward any errors
		RequestDispatcher errodis = getServletContext().getRequestDispatcher("/error.jsp");
		
		//define RequestDispatcher object to forward if data are correct and successfully stored in database
		RequestDispatcher succdis = getServletContext().getRequestDispatcher("/todo.jsp");
		
		String errormsg = "";
		int ercounter = 0;

		try {

			if(username == null || username.length() == 0) {
				
				errormsg += ++ercounter + ") Το πεδίο όνομα χρήστη δεν είναι έγκυρο<br>";
				
			}
			
			if(password == null || password.length() == 0) {
				
				errormsg += ++ercounter + ") Το πεδίο κωδικός δεν είναι έγκυρο<br>";
				
			}
			
			
			if(ercounter > 0) {
				
				if(ercounter == 1) 
					errormsg = "<h3>Βρέθηκε " + ercounter + " λάθος</h3>" + errormsg;
				else 
					errormsg = "<h3>Βρέθηκαν " + ercounter + " λάθη</h3>" + errormsg;
				
				//adding error message (String) to request
				request.setAttribute("errormessage", errormsg);
				
				errodis.forward(request, response);							
				
				return;
			}

			User user = new User(username, password);

			UserDAO sdao = new UserDAO();

			sdao.open(); // open connection

			sdao.registerUser(user); //store student to database

			sdao.close(); // close connection

			request.setAttribute("userobj", user); //adding Student object to request

			succdis.forward(request, response);
			return;

		} catch (Exception e) {
			
			request.setAttribute("errormessage", e.getMessage());
			
			errodis.forward(request, response);	
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
