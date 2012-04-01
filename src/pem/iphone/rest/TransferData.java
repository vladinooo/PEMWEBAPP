package pem.iphone.rest;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import pem.pemwebapp.domain.Profile;
import pem.pemwebapp.domain.Session;

@XmlRootElement
public class TransferData {
	
	private Profile profile;
	private List<Session> sessions;
	
	
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public List<Session> getSessions() {
		return sessions;
	}
	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

}
