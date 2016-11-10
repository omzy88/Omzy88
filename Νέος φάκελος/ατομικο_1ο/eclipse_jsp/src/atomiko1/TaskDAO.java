package atomiko1;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class TaskDAO {

public TaskDAO() {
		
	}

	private Connection con = null;
	
	public void open() throws SQLException {
		try {
			// dynamically load the driver's class file into memory
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception e) {
			
			throw new SQLException("MySQL Driver error: " + e.getMessage());
		}

		try {
			// establish a connection with the database and creates a Connection
			// object (con)
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atomiko1?characterEncoding=utf8", "root", "rania2000");
		} catch (Exception e2) {
			con = null;
			// throw SQLException if a database access error occurs
			throw new SQLException("Could not establish connection with the Database Server: " + e2.getMessage());
		}

	} // End of open

	public void close() throws SQLException {
		try {
			// if connection is open
			if (con != null)
				con.close(); // close the connection to the database to end database session			

		} catch (Exception e3) {
			
			throw new SQLException("Could not close connection with the Database Server: " + e3.getMessage());
		}

	} // end of close
		
	public int maxID() throws Exception {
		
		try {
			if(con == null) {
				throw new Exception("You must open a connection first");
			}

		String sql="select max(idtasks) as max from atomiko1.tasks";
		PreparedStatement stmt1 = con.prepareStatement(sql);
		ResultSet rs = stmt1.executeQuery();
		int result = 0;
		
		while(rs.next()) {
			
			result =rs.getInt("max");
			
		}
		rs.close();
		stmt1.close();
		
		return result;

	} catch (Exception e) {
		
		throw new Exception("An error occured while getting students from database: " + e.getMessage());
	
	}
		 
}//End of getStudents
	

	

	public void registerTask(String task) throws Exception {

		try {

			if(con == null) {
				throw new Exception("You must open a connection first");
			}
	
			String sql= "INSERT INTO  atomiko1.tasks (task) VALUES (?);";
	
			PreparedStatement stmt = con.prepareStatement(sql);
	
			
			stmt.setString( 1, task) ;
	
			stmt.executeUpdate();			
	
			stmt.close();	
	

		} catch (Exception e) {
	
			throw new Exception("An error occured while inserting task to database: " + e.getMessage());
		}

	}//End of registerTask

	public String getTask(int i)  throws Exception {
		
		try {
			
			if(con == null) {
				throw new Exception("You must open a connection first");
			}

		String sql="select atomiko1.tasks.task as colum  from atomiko1.tasks where atomiko1.tasks.idtasks = ?;";
		PreparedStatement stmt1 = con.prepareStatement(sql);
		stmt1.setInt( 1, i);
		ResultSet rs = stmt1.executeQuery();
		String result = null ;
		
		while(rs.next()) {
			
			result = rs.getString("colum");
			
		}
		rs.close();
		stmt1.close();
		
		return result;

		} catch (Exception e) {
		
		throw new Exception("An error occured while getting students from database: " + e.getMessage());
	
		}
		 
		
		
	}
	
	public void deleteTask(int i)  throws Exception {
		
		try {
			
			if(con == null) {
				throw new Exception("You must open a connection first");
			}

		String sql="DELETE FROM atomiko1.tasks WHERE idtasks = ?;";
		PreparedStatement stmt1 = con.prepareStatement(sql);
		stmt1.setInt( 1, i);
		stmt1.executeUpdate();
		stmt1.close();
		

		} catch (Exception e) {
		
		throw new Exception("An error occured while getting students from database: " + e.getMessage());
	
		}
		 
	}

	}//End of class