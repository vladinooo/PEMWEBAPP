package pem.iphone.dataaccess;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

@Stateless
public class IphoneDataAccessImplementation implements IphoneDataAccess {
	
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
	
	public void createSession(Profile profile, Session session) {
		em.persist(session);
		profile.addSession(session);
	}
	
	public void deleteSession(Session session) {
		Session sessionToRemove = em.find(Session.class, session.getId());
		em.remove(sessionToRemove);
	}

}
