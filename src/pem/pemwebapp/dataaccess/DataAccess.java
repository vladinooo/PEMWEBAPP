package pem.pemwebapp.dataaccess;

import java.util.List;

import javax.ejb.Local;

import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

@Local
public interface DataAccess {
	
	public Profile getProfile(String email);
	
	public void deleteProfile(Profile profile);
	
	public void deleteSession(String email, Session session);
	
	public List<Session> listAllSessionsOfProfile(Profile profile);


}
