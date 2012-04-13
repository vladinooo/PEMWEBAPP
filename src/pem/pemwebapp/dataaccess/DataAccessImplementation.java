//
//  Created by Vladimir Hartmann
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//
// DataAccessImplementation is a DAO for commands issued
// by web application.

package pem.pemwebapp.dataaccess;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import pem.pemwebapp.domain.Profile;

@Stateless
public class DataAccessImplementation implements DataAccess {
	
	@PersistenceContext
	private EntityManager em;
	
	public Profile getProfile(String email) {
		Query q = em.createNamedQuery("getProfile");
		q.setParameter("email", email);
		Profile profile = (Profile) q.getSingleResult();
		return profile;
	}
	
	public void deleteProfile(String email) {
		Query q = em.createNamedQuery("getProfile");
		q.setParameter("email", email);
		Profile profileToDelete = (Profile) q.getSingleResult();
		em.remove(profileToDelete);
	}

}
