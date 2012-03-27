package pem.pemwebapp.dataaccess;

import java.util.List;

import javax.ejb.Local;

import pem.pemwebapp.domain.Profile;

@Local
public interface DataAccess {
	
	// only for test
	public void createProfile(Profile profile);
	
	public List<Profile> getProfile(Profile profile);
	
	public void deleteProfile(Profile profile);


}
