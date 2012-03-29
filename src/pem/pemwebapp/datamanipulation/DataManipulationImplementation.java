package pem.pemwebapp.datamanipulation;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import pem.pemwebapp.dataaccess.DataAccess;
import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

@Stateless
@WebService(name="pemwebappWebService")
public class DataManipulationImplementation implements DataManipulation {
	
	@EJB
	private DataAccess dao;
	
	// for test only
	public void _createProfile(Profile profile) {
		dao.createProfile(profile);
	}
	
	public void _getProfile(Profile profile) {
		dao.getProfile(profile);	
	}
	
	public void _deleteProfile(Profile profile) {
		dao.deleteProfile(profile);
	}
	
	// for test only
	public void _createSession(Session session) {
		dao.createSession(session);
	}
	
	public List<Session> _listSessions() {
		return dao.listSessions();
	}
	
	public void _deleteSession(Session session) {
		dao.deleteSession(session);
	}
	
	
	// invocation from iPhone
	public void bigTest() {
		
		// call EJB business logic
		Profile profile = new Profile("Vlad", "Hartmann", "artmannv@yahoo.co.uk", "vava", "145");
		dao.createProfile(profile);
		
		Session session = new Session("28 Mar 2012 12:33", "Walk to station", "Walk", "233","400 m", "30 min", "6.3 km/h", "0");
		Session session2 = new Session("28 Mar 2012 16:53", "Run to town", "Run", "555","1500 m", "1h", "10 km/h", "0");
		Session session3 = new Session("29 Mar 2012 08:20", "Journey to work", "Bus", "10","20.000 m", "35 min", "70 km/h", "20");
		Session session4 = new Session("30 Mar 2012 20:00", "Walk to beach", "Walk", "345","800 m", "50 min", "5.3 km/h", "0");
		Session session5 = new Session("31 Mar 2012 14:50", "Journey to uni", "Car", "5","3000 m", "10 min", "40 km/h", "10");
		
		dao.createSession(session);
		dao.createSession(session2);
		dao.createSession(session3);
		dao.createSession(session4);
		dao.createSession(session5);
	}

}
