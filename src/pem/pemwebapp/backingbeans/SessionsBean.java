package pem.pemwebapp.backingbeans;




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



	public void __deleteSession(Session session) {
		dm._deleteSession(session);
	}


}

