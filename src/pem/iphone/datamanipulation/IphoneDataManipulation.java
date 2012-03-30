package pem.iphone.datamanipulation;

import javax.ejb.Local;

import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

@Local
public interface IphoneDataManipulation {
	
	public void _createProfile(Profile profile);
	
	public void _updateProfile(Profile profile);
	
	public void _deleteProfile(Profile profile);
	
	public void _createSession(Profile profile, Session session);
	
	public void _deleteSession(Session session);
	
}
