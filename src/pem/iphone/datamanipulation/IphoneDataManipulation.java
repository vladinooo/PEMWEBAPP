package pem.iphone.datamanipulation;

import javax.ejb.Local;

import pem.iphone.rest.TransferData;
import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.SimpleProfile;

@Local
public interface IphoneDataManipulation {
	
	
	// json test
	public void _createSimpleProfile(SimpleProfile simpleProfie);
	
	public SimpleProfile _getSimpleProfile(String email);

	
	
	public void _createProfile(TransferData iphoneData);
	
	public Profile _getProfile(String email);
	
}
