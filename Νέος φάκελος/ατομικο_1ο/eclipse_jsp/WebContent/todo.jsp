<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page errorPage="error.jsp" %>
<%@ page import="java.sql.*"%>
<%@ page import="atomiko1.*"%>

<!DOCTYPE html>
<html>
    <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <title>ToDo</title>
      <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
      <link rel="stylesheet" type="text/css" href="css/To_Do_List.css">
      <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet" type='text/css' />
    </head>

    <body>
      <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
          <div class="container">
              <div class="navbar-header">
                  <a class="navbar-brand" href="home.jsp">
                      <img src="/atomiko1/images/todo4.png" alt="To Do List">
                      <p class="navbar-bold">ToDo</p>
                  </a>
              </div>
              <div id="navbar" class="navbar-collapse collapse">
                  <span class="navbar-right welcome navbar-bold">
                    Καλωσήρθες
                  </span>
              </div>
          </div>
      </nav>



      <div class="container">
	       <div class="row">
	          <div class="col-md-4 col-md-offset-4">
		          <form name="checkListForm" class="todo-area" action="Todo" method="get">
			             <input type="text" name="task" placeholder="Προσθήκη υπενθύμισης"/><br>
	    	      <button type="submit" id="add" class="btn btn-info bottom-marg">Προσθήκη</button>
	    	      </form>
            </div>
          </div>
          <div class="row">
            <div class="col-md-4 col-md-offset-4">
            <% TaskDAO obj1 = new TaskDAO();
               obj1.open();
               int res1 = obj1.maxID();
               
            
            for (int i=1 ; i <= res1; i++){ %>
            
              <form action="Delete">
              <%if (obj1.getTask(i) != null) {%>
              	<p>
              		<span  class="reminder">
              		<%	out.println(obj1.getTask(i)); %></span>
               		<button type="submit" class="btn btn-labeled btn-danger left-button">
               		<span class="btn-label"></span>Delete</button>
               		<input type="hidden" name="idTasks" value="<%= i %>">
              	</p>
              	<% } %>
              </form>
              <%}	obj1.close(); %>
              
            </div>
	        </div>
        </div>


      <footer class="footer-distributed">
  			<div class="footer-left">
  				<h3>ToDo</h3>
  				<p class="footer-company-name">ToDo &copy; 2016</p>
  			</div>
  			<div class="footer-center">
  				<div>
  					<p><span>Κοραή 3</span>Αθήνα, Ελλάδα</p>
  				</div>
  				<div>
  					<p>+30 210-1234567</p>
  				</div>
  				<div>
  					<p><span class="mailcompany">ToDo@company.com</span></p>
  				</div>
  			</div>
  			<div class="footer-right">
  				<p class="footer-company-about">
  					<span>Σχετικά με την εφαρμογή</span>
  					Θέλουμε να μπορείς να οργανώσεις εύκολα και γρήγορα το πρόγραμμα σου.
  				</p>
  			</div>
  		</footer>




    </body>
</html>