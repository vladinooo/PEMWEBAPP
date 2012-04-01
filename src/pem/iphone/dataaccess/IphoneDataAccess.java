package pem.iphone.dataaccess;


import javax.ejb.Local;

import pem.iphone.rest.TransferData;
import pem.pemwebapp.domain.Profile;

@Local
public interface IphoneDataAccess {
	
	public void createProfile(TransferData iphoneData);
	
	public Profile getProfile(String email);
	
}
