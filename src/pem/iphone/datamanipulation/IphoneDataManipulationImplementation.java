package pem.iphone.datamanipulation;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import pem.iphone.dataaccess.IphoneDataAccess;
import pem.iphone.rest.TransferData;
import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.SimpleProfile;

@Stateless
public class IphoneDataManipulationImplementation implements
		IphoneDataManipulation {
	
	
	@EJB // dependency injection
	private IphoneDataAccess dao;

	
	// json test
	public void _createSimpleProfile(SimpleProfile simpleProfie) {
		dao.createSimpleProfile(simpleProfie);
	}
	
	public SimpleProfile _getSimpleProfile(String email) {
		return dao.getSimpleProfile(email);
	}

		
		
		
		
	public void _createProfile(TransferData iphoneData) {
		dao.createProfile(iphoneData);
	}

	public Profile _getProfile(String email) {
		return dao.getProfile(email);
	}
	
}
