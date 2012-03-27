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
	@Temporal(TemporalType.DATE)
	private Date date;
	private String sessionName;
	private String caloriesBurned;
	private String distance;
	private String time;
	private String speed;
	private String cO2Emissions;

	
	public Session() { 
		// for JPA use only }
	}
	
	public Session(String sessionName, String caloriesBurned,
			String distance, String time, String speed, String cO2Emissions) {
		
		date = new Date();
		this.sessionName = sessionName;
		this.caloriesBurned = caloriesBurned;
		this.distance = distance;
		this.time = time;
		this.speed = speed;
		this.cO2Emissions= cO2Emissions;
	}

	public int getId() {
		return id;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
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

	public String getcO2Emissions() {
		return cO2Emissions;
	}

	public void setcO2Emissions(String cO2Emissions) {
		this.cO2Emissions = cO2Emissions;
	}
	
	

}
