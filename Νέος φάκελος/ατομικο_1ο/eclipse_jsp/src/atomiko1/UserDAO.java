package atomiko1;
import java.sql.*;
import java.util.List;

public class UserDAO {
	
	public UserDAO() {
		
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
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atomiko1", "root", "0000");
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
	
		
	public void registerUser(User user) throws Exception {

		try {

			if(con == null) {
				throw new Exception("You must open a connection first");
			}
	
			String sql= "INSERT INTO  atomiko1.user (iduser, username, password) VALUES (?, ?, ?);";
	
			PreparedStatement stmt = con.prepareStatement(sql);
	
			stmt.setString( 1, user.getIduser() );
			stmt.setString( 2, user.getUsername() );
			stmt.setString( 3, user.getPassword());
	
			stmt.executeUpdate();			
	
			stmt.close();	
	

		} catch (Exception e) {
	
			throw new Exception("An error occured while inserting user to database: " + e.getMessage());
		}

	}//End of registerTask
}