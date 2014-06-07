//
//  Created by Vladimir Hartmann
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//
// ProfileBean is a backing bean for profile.xhtml

	package pem.pemwebapp.backingbeans;
	
	import java.io.IOException;
	
	import javax.ejb.EJB;
	import javax.faces.application.FacesMessage;
	import javax.faces.bean.ManagedBean;
	import javax.faces.bean.SessionScoped;
	import javax.faces.context.FacesContext;
	import javax.faces.event.ActionEvent;
	
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
	
	public void deleteProfile(ActionEvent actionEvent) throws IOException{  
		dm._deleteProfile(currentUser);
		
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Profile deleted",  "Re-directing...");
        FacesContext.getCurrentInstance().addMessage(null, message);  
        
        FacesContext.getCurrentInstance().getExternalContext()
		.redirect("http://vladinooo.info:9090/pemwebapp/faces/public/login.xhtml");
    }  
}

