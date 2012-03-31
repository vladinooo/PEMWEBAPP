package pem.iphone.dataaccess;


import javax.ejb.Local;

import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;
import pem.pemwebapp.domain.Groups;

@Local
public interface IphoneDataAccess {
	
	public void createProfile(Profile profile);
	
	public void updateProfile(Profile profile);
	
	public void deleteProfile(Profile profile);
	
	public void createGroup(Groups group);
	
	public void createSession(Profile profile, Session session);
	
	public void deleteSession(Session session);
	

}
