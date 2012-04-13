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


}
