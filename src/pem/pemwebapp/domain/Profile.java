//
//  Created by Vladimir Hartmann
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//
// Profile entity for storing profile data. Used by JPA.

	package pem.pemwebapp.domain;
	
	import java.io.Serializable;
	import java.util.ArrayList;
	import java.util.List;
	
	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;
	import javax.xml.bind.annotation.XmlRootElement;
	
	@Entity
	@XmlRootElement
	public class Profile implements Serializable {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		private String firstName;
		private String lastName;
		private String email;
		private String password;
		private String bodyWeight;
		
		@OneToMany(cascade=CascadeType.ALL)
		private List<Session> sessions;
	
		
		public Profile() { 
			// for JPA use only }
		}
		
		public Profile(String firstName, String lastName, String email, String password, String bodyWeight) {
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.password = password;
			this.bodyWeight = bodyWeight;
			sessions = new ArrayList<Session>();
		}
	
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBodyWeight() {
		return bodyWeight;
	}

	public void setBodyWeight(String bodyWeight) {
		this.bodyWeight = bodyWeight;
	}
	
	// add session to profile sessions collection
	public void addSession(Session session) {
		sessions.add(session);
	}
	
	// remove session from profile sessions collection
	public void removeSession(Session session) {
		sessions.remove(session);
	}

	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

}


