package pem.pemwebapp.dataaccess;

import java.util.List;
import java.util.Set;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

@Stateless
public class DataAccessImplementation implements DataAccess {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Profile> getProfile(Profile profile) {
		Query q = em.createNamedQuery("getProfile");
		List<Profile> results = q.getResultList();
		return results;
	}
	
	public void deleteProfile(Profile profile) {
		Profile profileToRemove = em.find(Profile.class, profile.getId());
		em.remove(profileToRemove);
	}
	
	public void deleteSession(Session session) {
		Session sessionToRemove = em.find(Session.class, session.getId());
		em.remove(sessionToRemove);
	}

	public Set<Session> listAllSessionsOfProfile(Profile profile) {
		return profile.getAllSessions();
	}

}
