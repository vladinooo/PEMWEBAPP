package pem.iphone.rest;


import java.util.ArrayList;
import java.util.List;

import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class RestClientTestApp {
	
	public static void main(String []args) {
		
		Client client = Client.create();
			
		// creat profile
		WebResource web = client.resource("http://localhost:8080/pemwebapp/webservice/profile/");

		List<Session> sessions = new ArrayList<Session>();
		
		sessions.add(new Session("28 Mar 2012 12:33", "Walk to station", "Walk", "233","400 m", "30 min", "6.3 km/h", "0"));
		sessions.add(new Session("28 Mar 2012 16:53", "Run to town", "Run", "555","1500 m", "1h", "10 km/h", "0"));
		sessions.add(new Session("29 Mar 2012 08:20", "Journey to work", "Bus", "10","20.000 m", "35 min", "70 km/h", "20"));
		sessions.add(new Session("30 Mar 2012 20:00", "Walk to beach", "Walk", "345","800 m", "50 min", "5.3 km/h", "0"));
		sessions.add(new Session("31 Mar 2012 14:50", "Journey to uni", "Car", "5","3000 m", "10 min", "40 km/h", "10"));
		
		Profile profile = new Profile("Vlad", "Hartmann", "artmannv@yahoo.co.uk", "vava", "145");
		
		TransferData td2 = new TransferData();
		td2.setProfile(profile);
		td2.setSessions(sessions);

		web.post(td2);
		System.out.print("Profile created :)");
		
		
		// get profile
//		web = client.resource("http://localhost:8080/pemwebapp/webservice/profile/artmannv@yahoo.co.uk");
//		
//		TransferData td = new TransferData();
//		td.setProfile(web.get(Profile.class));
//		
//		System.out.print("Username is: " + td.getProfile().getEmail());
	}

}
