package pem.pemwebapp.datamanipulation;

import java.util.Set;

import javax.ejb.Local;

import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

@Local
public interface DataManipulation {
	
	public void _getProfile(Profile profile);
	
	public void _deleteProfile(Profile profile);
	
	public void _deleteSession(Session session);
	
	public Set<Session> _listAllSessionsOfProfile(Profile profile);
	
}
