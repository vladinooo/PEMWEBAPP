package pem.pemwebapp.dataaccess;

import java.util.List;

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
	
	public Profile getProfile(String email) {
		Query q = em.createNamedQuery("getProfile");
		q.setParameter("email", email);
		System.out.print("This email is from DataManipulation: " + email);
		Profile profile = (Profile) q.getSingleResult();
		return profile;
	}
	
	public void deleteProfile(Profile profile) {
		Profile profileToRemove = em.find(Profile.class, profile.getId());
		em.remove(profileToRemove);
	}
	
	public void deleteSession(String email, Session session) {
		// remove session-to-profile relationship
		Profile profile = getProfile(email);
		profile.removeSession(session);
		// remove session
		Session sessionToRemove = em.find(Session.class, session.getId());
		em.remove(sessionToRemove);
	}

	public List<Session> listAllSessionsOfProfile(Profile profile) {
		return profile.getAllSessions();
	}

}
