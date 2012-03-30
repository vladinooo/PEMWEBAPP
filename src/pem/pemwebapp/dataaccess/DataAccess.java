package pem.pemwebapp.dataaccess;

import java.util.List;
import java.util.Set;

import javax.ejb.Local;

import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

@Local
public interface DataAccess {
	
	public List<Profile> getProfile(Profile profile);
	
	public void deleteProfile(Profile profile);
	
	public void deleteSession(Session session);
	
	public Set<Session> listAllSessionsOfProfile(Profile profile);


}
