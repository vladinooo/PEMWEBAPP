package pem.iphone.dataaccess;


import javax.ejb.Local;

import pem.iphone.rest.TransferData;
import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.SimpleProfile;

@Local
public interface IphoneDataAccess {
	
	// json test
	public void createSimpleProfile(SimpleProfile simpleProfie);
	
	public SimpleProfile getSimpleProfile(String email);
	
	
	public void createProfile(TransferData iphoneData);
	
	public Profile getProfile(String email);
	
}
