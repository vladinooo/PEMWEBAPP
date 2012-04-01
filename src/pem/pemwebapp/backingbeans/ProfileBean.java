package pem.pemwebapp.backingbeans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import pem.iphone.datamanipulation.IphoneDataManipulation;
import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;




@ManagedBean(name="profile")
@SessionScoped
public class ProfileBean {
	
	private String currentUser;
	
	@EJB
	private IphoneDataManipulation idm;
	
	
	private String message = "Hello Worlddddd!";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	// constructor
	public ProfileBean() {
		String email = FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
		setCurrentUser(email);
		System.out.print("Current user set to: " + currentUser);
	}
	
	
	public String createProfile() {
		
		// call EJB business logic
		List<Session> sessions = new ArrayList<Session>();
		
		sessions.add(new Session("28 Mar 2012 12:33", "Walk to station", "Walk", "233","400 m", "30 min", "6.3 km/h", "0"));
		sessions.add(new Session("28 Mar 2012 16:53", "Run to town", "Run", "555","1500 m", "1h", "10 km/h", "0"));
		sessions.add(new Session("29 Mar 2012 08:20", "Journey to work", "Bus", "10","20.000 m", "35 min", "70 km/h", "20"));
		sessions.add(new Session("30 Mar 2012 20:00", "Walk to beach", "Walk", "345","800 m", "50 min", "5.3 km/h", "0"));
		sessions.add(new Session("31 Mar 2012 14:50", "Journey to uni", "Car", "5","3000 m", "10 min", "40 km/h", "10"));
		
		Profile profile = new Profile("Vlad", "Hartmann", "artmannv@yahoo.co.uk", "vava", "145");

		idm._createProfile(profile, sessions);
		
		// refresh current page
		return null;
	}


	public String getCurrentUser() {
		return currentUser;
	}


	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
	}

	
}

