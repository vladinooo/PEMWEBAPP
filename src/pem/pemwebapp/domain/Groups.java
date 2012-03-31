package pem.pemwebapp.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Groups implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String email;
	private String groupname;
	
	
	public Groups() { 
		// for JPA use only }
	}
	
	public Groups(String email, String groupname) {
		
		this.email = email;
		this.groupname = groupname;

	}
	
	public int getId() {
		return id;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	

}

