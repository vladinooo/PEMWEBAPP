package pem.iphone.datamanipulation;

import java.util.List;

import javax.ejb.Local;

import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;
import pem.pemwebapp.domain.UserGroup;

@Local
public interface IphoneDataManipulation {
	
	public void _createProfile(Profile profile, List<Session> sessions);
	
}
