package pem.pemwebapp.dataaccess;

import java.util.List;

import javax.ejb.Local;

import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

@Local
public interface DataAccess {
	
	// only for test
	public void createProfile(Profile profile);
	
	public List<Profile> getProfile(Profile profile);
	
	public void deleteProfile(Profile profile);
	
	// for test only
	public void createSession(Session session);
	
	public List<Session> listSessions();
	
	public void deleteSession(Session session);


}
