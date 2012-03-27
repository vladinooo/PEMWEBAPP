package pem.iphone.dataaccess;


import pem.pemwebapp.domain.Profile;

public interface IphoneDataAccess {
	
	public void createProfile(Profile profile);
	
	public void updateProfile(Profile profile);
	
	public void deleteProfile(Profile profile);

}
