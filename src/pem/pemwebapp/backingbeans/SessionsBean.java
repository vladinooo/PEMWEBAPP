//
//  Created by Vladimir Hartmann
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//
// SessionsBean is a backing bean for sessions.xhtml

package pem.pemwebapp.backingbeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import pem.pemwebapp.datamanipulation.DataManipulation;
import pem.pemwebapp.domain.Session;


@ManagedBean(name="sessionsBean")
@SessionScoped
public class SessionsBean {
	
	private List<Session> allSessions;
	
	@EJB
	private DataManipulation dm;
	
	@ManagedProperty(value="#{profileBean}") // name of real bean to be injected to tempProfileBean
	private ProfileBean tempProfileBean;
	
	public void setTempProfileBean(ProfileBean profileBean) {
		tempProfileBean = profileBean;
	}
	
	public List<Session> getAllSessions() {
		setAllSessions();
		return allSessions;
	}
	
	public void setAllSessions() {
		allSessions = dm._getProfile(tempProfileBean.getCurrentUser()).getSessions();
	}
	
	 
}

