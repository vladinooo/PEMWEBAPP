//
//  Created by Vladimir Hartmann
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//
// DataManipulationImplementation is an intermediate class which
// delegates data to DAO. This class can implement more sophisticated
// logic in future as application will grow thus leaving DAO simple.

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
	
	public void _deleteProfile(String email) {
		dao.deleteProfile(email);
	}

}
