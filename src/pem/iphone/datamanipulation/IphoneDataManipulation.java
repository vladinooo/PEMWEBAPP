package pem.iphone.datamanipulation;

import javax.ejb.Local;

import pem.iphone.rest.TransferData;
import pem.pemwebapp.domain.Profile;

@Local
public interface IphoneDataManipulation {
	
	public void _createProfile(TransferData iphoneData);
	
	public Profile _getProfile(String email);
	
}
