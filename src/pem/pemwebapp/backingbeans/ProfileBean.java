package pem.pemwebapp.backingbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import pem.pemwebapp.datamanipulation.DataManipulation;
import pem.pemwebapp.domain.Profile;




@ManagedBean(name="profileBean")
@SessionScoped
public class ProfileBean {
	
	private String currentUser;
	private Profile profile;
	
	@EJB
	private DataManipulation dm;
		
	
	// constructor
	public ProfileBean() {
		String email = FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
		setCurrentUser(email);
		System.out.print("Current user set to: " + currentUser);
	}


	public String getCurrentUser() {
		return currentUser;
	}


	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
	}

	public Profile getProfile() {
		return profile = dm._getProfile(currentUser);
	}
	
}

