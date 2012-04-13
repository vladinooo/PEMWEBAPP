package pem.pemwebapp.datamanipulation;


import javax.ejb.EJB;
import javax.ejb.Stateless;

import pem.pemwebapp.dataaccess.DataAccess;
import pem.pemwebapp.domain.Profile;

@Stateless
public class DataManipulationImplementation implements DataManipulation {
	
	@EJB
	private DataAccess dao;
	
	public Profile _getProfile(String email) {
		return dao.getProfile(email);	
	}

}
