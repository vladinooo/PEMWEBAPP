//
//  Created by Vladimir Hartmann
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//
// IphoneDataAccessImplementation accepts commands from iPhone via RESTful web service
// and communicate with database. This is a DAO.

package pem.iphone.dataaccess;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.UserGroup;

@Stateless
public class IphoneDataAccessImplementation implements IphoneDataAccess {
	
	@PersistenceContext
	private EntityManager em;

	
	public Profile getProfile(String email) throws javax.persistence.NoResultException {
		try {
			Query q = em.createNamedQuery("getProfile");
			q.setParameter("email", email);
			Profile profile = (Profile) q.getSingleResult();
			return profile;
		} catch (NoResultException e) {
			return null;
		}
	}
	
	
	public void createProfile(Profile profile) {
		UserGroup group = new UserGroup(profile.getEmail(), "USER");
		em.persist(group);
		em.persist(profile);
	}
	
	public String deleteProfile(String email) throws javax.persistence.NoResultException {
		try {
			Query q = em.createNamedQuery("getProfile");
			q.setParameter("email", email);
			Profile profileToDelete = (Profile) q.getSingleResult();
			em.remove(profileToDelete);
			return "1";
		} catch (NoResultException e) {
			System.out.print("Profile doesn't exist!");
			return "0";
		}
	}	
	
}
