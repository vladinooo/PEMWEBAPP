package pem.pemwebapp.backingbeans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import pem.pemwebapp.domain.Session;



@ManagedBean(name="sessionDetails")
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

