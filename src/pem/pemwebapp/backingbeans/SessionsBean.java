package pem.pemwebapp.backingbeans;


import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import pem.pemwebapp.datamanipulation.DataManipulation;
import pem.pemwebapp.domain.Session;


@ManagedBean(name="sessions")
@SessionScoped
public class SessionsBean {
	
	@EJB
	private DataManipulation dm;
	
	private List<Session> sessionList;


	public List<Session> getSessionList() {
		sessionList = dm._listSessions();
		return sessionList;
	}
	
	public void __deleteSession(Session session) {
		dm._deleteSession(session);
	}

	

	
	
	
}

