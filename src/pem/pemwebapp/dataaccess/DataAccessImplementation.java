package pem.pemwebapp.dataaccess;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pem.pemwebapp.domain.Profile;

@Stateless
public class DataAccessImplementation implements DataAccess {
	
	@PersistenceContext
	private EntityManager em;
	
	// for test only
	public void createProfile(Profile profile) {
		em.persist(profile);
	}
	
	public List<Profile> getProfile(Profile profile) {
		Query q = em.createNamedQuery("getProfile");
		List<Profile> results = q.getResultList();
		return results;
	}
	
	public void deleteProfile(Profile profile) {
		Profile profileToRemove = em.find(Profile.class, profile.getId());
		em.remove(profileToRemove);
	}

}
