package pem.iphone.dataaccess;


import java.util.List;

import javax.ejb.Local;

import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;
import pem.pemwebapp.domain.UserGroup;

@Local
public interface IphoneDataAccess {
	
	public void createProfile(Profile profile, List<Session> sessions);

}
