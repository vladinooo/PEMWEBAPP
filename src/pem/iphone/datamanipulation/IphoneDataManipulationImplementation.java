package pem.iphone.datamanipulation;

import java.util.List;

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

	public void _createProfile(Profile profile, List<Session> sessions) {
		dao.createProfile(profile, sessions);
	}

}
