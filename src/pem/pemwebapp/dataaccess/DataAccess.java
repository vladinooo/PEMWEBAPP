package pem.pemwebapp.dataaccess;


import javax.ejb.Local;

import pem.pemwebapp.domain.Profile;

@Local
public interface DataAccess {
	
	public Profile getProfile(String email);
	
	public void deleteProfile(String email);

}
