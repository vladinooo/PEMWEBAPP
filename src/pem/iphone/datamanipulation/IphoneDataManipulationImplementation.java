package pem.iphone.datamanipulation;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import pem.iphone.dataaccess.IphoneDataAccess;
import pem.pemwebapp.domain.Profile;

@Stateless
public class IphoneDataManipulationImplementation implements
		IphoneDataManipulation {
	
	
	@EJB // dependency injection
	private IphoneDataAccess dao;

	
	public void _createProfile(Profile profile) {
		dao.createProfile(profile);
	}
	
	public Profile _getProfile(String email) {
		return dao.getProfile(email);
	}

	public String _deleteProfile(String email) {
		return dao.deleteProfile(email);
	}


}
