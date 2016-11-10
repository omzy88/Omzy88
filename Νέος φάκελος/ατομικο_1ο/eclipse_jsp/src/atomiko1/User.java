package atomiko1;

public class User {

	
	private int iduser;
	private String username;
	private String password;
	
	public User() {
		
	}

	public User(String username, String password) {

		this.username = username;
		this.password = password;

	}

	public int getIduser() {
		return this.iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	

}

