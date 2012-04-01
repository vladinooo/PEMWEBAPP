package pem.pemwebapp.backingbeans;




import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import pem.pemwebapp.datamanipulation.DataManipulation;
import pem.pemwebapp.domain.Session;


@ManagedBean(name="sessions")
@SessionScoped
public class SessionsBean {
	
	private List<Session> allSessions;
	
	@EJB
	private DataManipulation dm;
	
	@ManagedProperty(value="#{profile}")
	
	private ProfileBean profileBean;
	
	public void setProfileBean(ProfileBean profileBean) {
		this.profileBean = profileBean;
	}
	
	public List<Session> getAllSessions() {
		setAllSessions();
		return allSessions;
	}
	
	public void setAllSessions() {
		allSessions = dm._getProfile(profileBean.getCurrentUser()).getAllSessions();
	}
	
	public void __deleteSession(Session session) {
		dm._deleteSession(profileBean.getCurrentUser(), session);
	}
	 
}

