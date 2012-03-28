package pem.pemwebapp.datamanipulation;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import pem.pemwebapp.dataaccess.DataAccess;
import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

@Stateless
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

}
