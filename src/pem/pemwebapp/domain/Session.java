package pem.pemwebapp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Session implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String date;
	private String sessionName;
	private String modeOfTransport;
	private String caloriesBurned;
	private String distance;
	private String time;
	private String speed;
	private String cO2Emission;

	
	public Session() { 
		// for JPA use only }
	}
	
	public Session(String date, String sessionName, String modeOfTransport, String caloriesBurned,
			String distance, String time, String speed, String cO2Emission) {
		
		this.date = date;
		this.sessionName = sessionName;
		this.modeOfTransport = modeOfTransport;
		this.caloriesBurned = caloriesBurned;
		this.distance = distance;
		this.time = time;
		this.speed = speed;
		this.cO2Emission = cO2Emission;
	}

	public int getId() {
		return id;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	public String getModeOfTransport() {
		return modeOfTransport;
	}

	public void setModeOfTransport(String modeOfTransport) {
		this.modeOfTransport = modeOfTransport;
	}

	public String getCaloriesBurned() {
		return caloriesBurned;
	}

	public void setCaloriesBurned(String caloriesBurned) {
		this.caloriesBurned = caloriesBurned;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getcO2Emission() {
		return cO2Emission;
	}

	public void setcO2Emission(String cO2Emission) {
		this.cO2Emission = cO2Emission;
	}
	
	

}
