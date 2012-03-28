package pem.pemwebapp.datamanipulation;

import java.util.List;

import javax.ejb.Local;

import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

@Local
public interface DataManipulation {
	
	// for test only
	public void _createProfile(Profile profile);
	
	public void _getProfile(Profile profile);
	
	public void _deleteProfile(Profile profile);
	
	// for test only
	public void _createSession(Session session);
	
	public List<Session> _listSessions();
	
	public void _deleteSession(Session session);
	

}
