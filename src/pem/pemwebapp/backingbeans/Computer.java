package pem.pemwebapp.backingbeans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="computer")
@SessionScoped
public class Computer {
	
	
	@ManagedProperty(value="#{message}")
	private Message message;

	public void setMessage(Message message) {
		this.message = message;
	}


	
	public String sayHello() {
		return message.getMessage();
	}

}
