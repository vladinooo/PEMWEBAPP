package pem.pemwebapp.backingbeans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


@ManagedBean(name="logoutBean")
@RequestScoped
public class LogoutBean {
	
	public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "faces/public/login.xhtml?faces-redirect=true";
    }
}
