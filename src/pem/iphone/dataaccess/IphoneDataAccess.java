//
//  Created by Vladimir Hartmann
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//

package pem.iphone.dataaccess;


import javax.ejb.Local;
import pem.pemwebapp.domain.Profile;

@Local
public interface IphoneDataAccess {
	
	public Profile getProfile(String email);

	public void createProfile(Profile profile);
	
	public String deleteProfile(String email);	
	
}
