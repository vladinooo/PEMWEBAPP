package pem.pemwebapp.datamanipulation;

import java.util.Set;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import pem.pemwebapp.dataaccess.DataAccess;
import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

@Stateless
public class DataManipulationImplementation implements DataManipulation {
	
	@EJB
	private DataAccess dao;
	
	public void _getProfile(Profile profile) {
		dao.getProfile(profile);	
	}
	
	public void _deleteProfile(Profile profile) {
		dao.deleteProfile(profile);
	}
	
	public void _deleteSession(Session session) {
		dao.deleteSession(session);
	}
	
	public Set<Session> _listAllSessionsOfProfile(Profile profile) {
		return dao.listAllSessionsOfProfile(profile);
	}

}
