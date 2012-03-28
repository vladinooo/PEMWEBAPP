package pem.pemwebapp.backingbeans;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import pem.pemwebapp.datamanipulation.DataManipulation;
import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;


@ManagedBean(name="profile")
@SessionScoped
public class ProfileBean {
	
	@EJB
	private DataManipulation dm;

	
	public String createProfile() {
		
		// call EJB business logic
		Profile profile = new Profile("Vlad", "Hartmann", "artmannv@yahoo.co.uk", "vava", "145");
		dm._createProfile(profile);
		
		Session session = new Session("28 Mar 2012 12:33", "Walk to station", "Walk", "233","400 m", "30 min", "6.3 km/h", "0");
		Session session2 = new Session("28 Mar 2012 16:53", "Run to town", "Run", "555","1500 m", "1h", "10 km/h", "0");
		Session session3 = new Session("29 Mar 2012 08:20", "Journey to work", "Bus", "10","20.000 m", "35 min", "70 km/h", "20");
		Session session4 = new Session("30 Mar 2012 20:00", "Walk to beach", "Walk", "345","800 m", "50 min", "5.3 km/h", "0");
		Session session5 = new Session("31 Mar 2012 14:50", "Journey to uni", "Car", "5","3000 m", "10 min", "40 km/h", "10");
		
		dm._createSession(session);
		dm._createSession(session2);
		dm._createSession(session3);
		dm._createSession(session4);
		dm._createSession(session5);

		
		// refresh current page
		return null;
	}
}

