package pem.pemwebapp.backingbeans;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import pem.iphone.datamanipulation.IphoneDataManipulation;
import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;
import pem.pemwebapp.domain.Groups;


@ManagedBean(name="profile")
@SessionScoped
public class ProfileBean {
	
	
	@EJB
	private IphoneDataManipulation idm;

	
	public String createProfile() {
		
		// call EJB business logic
		Profile profile = new Profile("Vlad", "Hartmann", "artmannv@yahoo.co.uk", "vava", "145");
		Groups group = new Groups("artmannv@yahoo.co.uk", "user");
		idm._createProfile(profile);
		idm._createGroup(group);
		
		Session session = new Session("28 Mar 2012 12:33", "Walk to station", "Walk", "233","400 m", "30 min", "6.3 km/h", "0");
		Session session2 = new Session("28 Mar 2012 16:53", "Run to town", "Run", "555","1500 m", "1h", "10 km/h", "0");
		Session session3 = new Session("29 Mar 2012 08:20", "Journey to work", "Bus", "10","20.000 m", "35 min", "70 km/h", "20");
		Session session4 = new Session("30 Mar 2012 20:00", "Walk to beach", "Walk", "345","800 m", "50 min", "5.3 km/h", "0");
		Session session5 = new Session("31 Mar 2012 14:50", "Journey to uni", "Car", "5","3000 m", "10 min", "40 km/h", "10");
		
		idm._createSession(profile, session);
		idm._createSession(profile, session2);
		idm._createSession(profile, session3);
		idm._createSession(profile, session4);
		idm._createSession(profile, session5);
		
		// refresh current page
		return null;
	}
	
	
	
}

