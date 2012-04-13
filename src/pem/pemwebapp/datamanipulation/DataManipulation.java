package pem.pemwebapp.datamanipulation;


import javax.ejb.Local;
import pem.pemwebapp.domain.Profile;

@Local
public interface DataManipulation {
	
	public Profile _getProfile(String email);
	
	public void _deleteProfile(String email);
				
}
