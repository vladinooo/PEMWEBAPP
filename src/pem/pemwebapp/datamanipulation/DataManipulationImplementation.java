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
	
	public Profile _getProfile(String email) {
		return dao.getProfile(email);	
	}
	
	public void _deleteProfile(Profile profile) {
		dao.deleteProfile(profile);
	}
	
	public void _deleteSession(String email, Session session) {
		dao.deleteSession(email, session);
	}
	
	public List<Session> _listAllSessionsOfProfile(Profile profile) {
		return dao.listAllSessionsOfProfile(profile);
	}

}
