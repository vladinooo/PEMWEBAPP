package pem.iphone.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
	@Produces("application/xml")
	@Path("{id}")
	public Profile __getProfile(@PathParam("id") String email) {
		return idm._getProfile(email);
	}
	
	
	@POST
	@Consumes("application/xml")
	public void __createProfile(TransferData transferData) {
		System.out.print("Data arrived to the server :" + transferData.getProfile().getEmail() + " , " + transferData.getProfile().getFirstName());
		idm._createProfile(transferData);
	}

}
