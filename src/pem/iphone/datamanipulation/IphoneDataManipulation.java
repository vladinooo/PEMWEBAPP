package pem.iphone.datamanipulation;

import javax.ejb.Local;

import pem.pemwebapp.domain.Profile;

@Local
public interface IphoneDataManipulation {
	
	
	public Profile _getProfile(String email);

	public void _createProfile(Profile profile);
			
	public String _deleteProfile(String email);
	
	
}
