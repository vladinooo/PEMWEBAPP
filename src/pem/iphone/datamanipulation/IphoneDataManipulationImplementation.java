package pem.iphone.datamanipulation;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import pem.iphone.dataaccess.IphoneDataAccess;
import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

@Stateless
public class IphoneDataManipulationImplementation implements
		IphoneDataManipulation {
	
	
	@EJB // dependency injection
	private IphoneDataAccess dao;

	public void _createProfile(Profile profile) {
		dao.createProfile(profile);
	}

	public void _updateProfile(Profile profile) {
		dao.updateProfile(profile);
	}

	public void _deleteProfile(Profile profile) {
		dao.deleteProfile(profile);
	}

	public void _createSession(Profile profile, Session session) {
		dao.createSession(profile, session);
	}

	public void _deleteSession(Session session) {
		dao.deleteSession(session);
	}

}
