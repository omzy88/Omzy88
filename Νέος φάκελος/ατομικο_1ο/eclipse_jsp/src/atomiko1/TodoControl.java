package atomiko1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Todo")
public class TodoControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TodoControl() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		
		//reading parameters from request
		String task = request.getParameter("task");

		
		String errormsg = "";
		

		try {

			if(task == null || task.length() == 0) {
				
				errormsg += " Το πεδίο υπενθύμιση δεν είναι έγκυρο<br>";
				response.sendRedirect("/atomiko1/error.jsp");
			}
			
			TaskDAO conn = new TaskDAO();
			conn.open();
			conn.registerTask(task);
			conn.close();
			response.sendRedirect("/atomiko1/todo.jsp");
			
			
				
				//adding error message (String) to request
				request.setAttribute("errormessage", errormsg);
				
										
			

		} catch (Exception e) {
			
			request.setAttribute("errormessage", e.getMessage());
			
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
