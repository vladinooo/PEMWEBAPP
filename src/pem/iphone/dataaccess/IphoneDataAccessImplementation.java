package pem.iphone.dataaccess;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pem.pemwebapp.domain.Profile;

@Stateless
public class IphoneDataAccessImplementation {
	
	@PersistenceContext
	private EntityManager em;

	
	public void createProfile(Profile profile) {
		em.persist(profile);
	}
	
	public void updateProfile(Profile profile) {
		
	}
	
	public void deleteProfile(Profile profile) {
		Profile profileToRemove = em.find(Profile.class, profile.getId());
		em.remove(profileToRemove);
	}

}
