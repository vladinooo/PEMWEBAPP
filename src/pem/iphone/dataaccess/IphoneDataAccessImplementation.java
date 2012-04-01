package pem.iphone.dataaccess;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pem.pemwebapp.domain.UserGroup;
import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

@Stateless
public class IphoneDataAccessImplementation implements IphoneDataAccess {
	
	@PersistenceContext
	private EntityManager em;

	
	public void createProfile(Profile profile, List<Session> sessions) {
		
		UserGroup group = new UserGroup(profile.getEmail(), "USER");
		em.persist(group);
		em.persist(profile);
		
		for (Session s:sessions){
			em.persist(s);
			profile.addSession(s);
		}
	}
	
	
}
