//
//  Created by Vladimir Hartmann
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//
// IphoneDataManipulationImplementation is an intermediate class which
// delegates data to DAO. This class can implement more sophisticated
// logic in future as application will grow thus leaving DAO simple.

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
