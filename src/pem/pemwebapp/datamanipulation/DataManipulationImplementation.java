package pem.pemwebapp.datamanipulation;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import pem.pemwebapp.dataaccess.DataAccess;
import pem.pemwebapp.domain.Profile;

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

}
