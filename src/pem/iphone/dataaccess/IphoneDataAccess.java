package pem.iphone.dataaccess;


import javax.ejb.Local;

import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

@Local
public interface IphoneDataAccess {
	
	public void createProfile(Profile profile);
	
	public void updateProfile(Profile profile);
	
	public void deleteProfile(Profile profile);
	
	public void createSession(Profile profile, Session session);
	
	public void deleteSession(Session session);
	

}
