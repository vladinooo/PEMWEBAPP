//
//  Created by Vladimir Hartmann
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//
// SessionDetailsBean is a backing bean for sessionDetails.xhtml

package pem.pemwebapp.backingbeans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import pem.pemwebapp.domain.Session;



@ManagedBean(name="sessionDetailsBean")
@SessionScoped
public class SessionDetailsBean {
	
	private Session session;
	
	
	public String showDetails(Session session) {
		this.session = session;
		return "sessionDetails";
	}


	public Session getSession() {
		return session;
	}

	
}

