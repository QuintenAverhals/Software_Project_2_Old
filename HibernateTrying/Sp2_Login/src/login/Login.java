package login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOGIN")

public class Login extends LoginDao {

	@Id
	@Column(name="UserID")
	private int user_ID;
	
	@Column(name="Username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="admin")
	private boolean Admin;
	
	
	public Login()
	{
		
	}
	
	public Login(String username, String password, boolean admin) {
		super();
		this.username = username;
		this.password = password;
		Admin = admin;
	}



	
	public int getUser_ID() {
		return user_ID;
	}




	public Login(String username, String password) {
		
		this.username = username;
		this.password = password;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public boolean isAdmin() {
		return Admin;
	}




	public void setAdmin(boolean admin) {
		Admin = admin;
	}

	@Override
	public String toString() {
		return "Login [user_ID=" + user_ID + ", username=" + username + ", password=" + password + ", Admin=" + Admin
				+ "]";
	}
	
}
