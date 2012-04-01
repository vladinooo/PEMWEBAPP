
package pem.iphone.dataaccess;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pem.iphone.rest.TransferData;
import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;
import pem.pemwebapp.domain.UserGroup;

@Stateless
public class IphoneDataAccessImplementation implements IphoneDataAccess {
	
	@PersistenceContext
	private EntityManager em;

	
	public void createProfile(TransferData iphoneData) {
		
		Profile profile = iphoneData.getProfile();
		List<Session> sessions = iphoneData.getSessions();

		UserGroup group = new UserGroup(profile.getEmail(), "USER");
		em.persist(group);
		em.persist(profile);

		for (Session s : sessions) {
			profile.addSession(s);
		}
				
	}
	
	public Profile getProfile(String email) {
		Query q = em.createNamedQuery("getProfile");
		q.setParameter("email", email);
		Profile profile = (Profile) q.getSingleResult();
		return profile;
	}
	
}
