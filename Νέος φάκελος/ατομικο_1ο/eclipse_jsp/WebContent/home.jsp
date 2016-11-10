<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>

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
                      <img src="images/todo4.png" alt="To Do List">
                      <p class="navbar-bold">ToDo</p>
                  </a>
              </div>
              <div id="navbar" class="navbar-collapse collapse">
                  <form class="navbar-form navbar-right" role="form">
                      <div class="form-group">
                          <input type="text" placeholder="Όνομα Χρήστη" class="form-control" required>
                      </div>
                      <div class="form-group">
                          <input type="password" placeholder="Κωδικός" class="form-control" required>
                      </div>
                      <button type="submit" class="btn btn-secondary">Είσοδος</button>
                  </form>
              </div>
          </div>
      </nav>


      <div class="container">
        <div class="jumbotron">
          <h1>ToDo Web Application</h1>
          <p> Η ToDo είναι μία ευρέως γνωστή εφαρμογή η οποία σας βοηθάει στην οργάνωση του εβδομαδιαίου σας προγράμματος.</p>
          <hr>
          <p>Δοκιμάστε την.</p>
          <p class="lead">
            <a class="btn btn-primary btn-lg" href="register.jsp" role="button">Εγγραφτείτε Τώρα</a>
          </p>
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