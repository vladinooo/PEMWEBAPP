package pem.pemwebapp.backingbeans;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import pem.pemwebapp.datamanipulation.DataManipulation;
import pem.pemwebapp.domain.Profile;


@ManagedBean(name="profile")
@SessionScoped
public class ProfileBean {
	
	@EJB
	private DataManipulation dm;

	
	public String createProfile() {
		
		// call EJB business logic
		Profile profile = new Profile("Vlad", "Hartmann", "artmannv@yahoo.co.uk", "vava", "145");
		dm._createProfile(profile);
		
		// refresh current page
		return null;
	}
}

