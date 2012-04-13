package pem.iphone.rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import pem.iphone.datamanipulation.IphoneDataManipulation;
import pem.pemwebapp.domain.Profile;

@Stateless
@Path("/profile")
public class ProfileResource {
	
	@EJB
	private IphoneDataManipulation idm;
	
	
	
	@GET
	@Produces("application/json")
	@Path("{email}")
	public String __getProfile(@PathParam("email") String email) {
		
		if (idm._getProfile(email) == null) {
			return "0";
		}
		else {
			return "1";
		}
	}
	
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Profile __createProfile(Profile profile) {
		idm._createProfile(profile);
		return profile;
	}

	
	@DELETE
	@Produces("application/json")
	@Path("{email}")
	public String __deleteProfile(@PathParam("email") String email) {
		return idm._deleteProfile(email);
	}
	

}
