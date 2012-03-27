package pem.pemwebapp.datamanipulation;

import javax.ejb.Local;

import pem.pemwebapp.domain.Profile;

@Local
public interface DataManipulation {
	
	// for test only
	public void _createProfile(Profile profile);
	
	public void _getProfile(Profile profile);
	
	public void _deleteProfile(Profile profile);

}
