package pem.pemwebapp.backingbeans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="message")
@SessionScoped
public class Message {
	
	private String message = "Hello World!";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
