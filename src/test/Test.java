package test;

import javax.ejb.EJB;

import pem.iphone.datamanipulation.IphoneDataManipulation;
import pem.pemwebapp.domain.Profile;

public class Test {
	
	@EJB
	private static IphoneDataManipulation idm;
	
	
	public static void main(String []args) {
		Profile profile = new Profile("Vlad", "Hartmann", "artmannv@yahoo.co.uk", "vava", "145");
		idm._createProfile(profile);
	}

}
