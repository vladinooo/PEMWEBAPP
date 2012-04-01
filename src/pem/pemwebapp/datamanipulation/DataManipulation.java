package pem.pemwebapp.datamanipulation;

import java.util.List;

import javax.ejb.Local;

import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

@Local
public interface DataManipulation {
	
	public Profile _getProfile(String email);
	
	public void _deleteProfile(Profile profile);
	
	public void _deleteSession(String email, Session session);
	
	public List<Session> _listAllSessionsOfProfile(Profile profile);
	
}
